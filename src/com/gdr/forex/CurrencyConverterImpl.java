package com.gdr.forex;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

// TODO: Add the annotation that tells JAX-WS that this class is the implementation
//       of the Web service defined by the interface CurrencyConverter
// HINT: see slide 3-15

// TODO: add an "implements" clause so the Java compiler knows that this class
//       implements the CurrencyConverter interface

@WebService(endpointInterface="com.gdr.forex.CurrencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter{

    /** Initializes the CurrencyConverterImpl */
    public CurrencyConverterImpl() {
        initConversionRates();
    }

    /**
     * Convert value from one currency to another.
     */
    @Override
    public Amount getConvertedAmount(Amount from, Currency toCurrency) 
                    throws CurrencyLookupException {
        BigDecimal rate = getConversionRate(from.getCurrency(), toCurrency);
        BigDecimal convertedValue = rate.multiply(from.getValue()).setScale(2, RoundingMode.HALF_UP);
        return new Amount(convertedValue, toCurrency);
    }

    /** 
     *  Returns the conversion rate for one unit of fromCurrency to toCurrency.
     *  For example, if fromCurrency is EUR and toCurrency is SEK,
     *  will get the number of Swedish Kroners for one Euro.
     * @throws CurrencyLookupException 
     */
    @Override
    public BigDecimal getConversionRate(Currency fromCurrency, Currency toCurrency) 
            throws CurrencyLookupException {
        verifyNonNullArg(fromCurrency, "fromCurrency");
        verifyNonNullArg(toCurrency, "toCurrency");
        BigDecimal numDollarsFrom = getUSDPerUnitOf(fromCurrency);
        BigDecimal numDollarsTo   = getUSDPerUnitOf(toCurrency);
        return numDollarsFrom.divide(numDollarsTo, new MathContext(3, RoundingMode.HALF_UP));
    }

    private BigDecimal getUSDPerUnitOf(Currency fromCurrency) throws CurrencyLookupException {
        verifyNonNullArg(fromCurrency, "fromCurrency");
        BigDecimal usdPerUnitOf = usdConversionRateMap.get(fromCurrency);
        if (usdPerUnitOf == null) {
            throw new CurrencyLookupException("No conversion rate found for currency", fromCurrency);
        }
        return usdPerUnitOf;
    }
    
    /**
     * Allows unit tests to set predictable conversion rates.
     * @param currency the currency that US dollars are being converted to
     * @param rate how many US dollars for each unit of currency 
     */
    public synchronized void setUsdConversionRate(Currency currency, BigDecimal rate) {
        usdConversionRateMap.put(currency, rate);
    }
    
    private void verifyNonNullArg(Object arg, String argName) {
        if (arg == null) {
            throw new IllegalArgumentException(argName);
        }
    }

    private void initConversionRates() {
        usdConversionRateMap = new HashMap<>();
        usdConversionRateMap.put(Currency.EUR, new BigDecimal("1.39"));
        usdConversionRateMap.put(Currency.INR, new BigDecimal("0.017"));
        usdConversionRateMap.put(Currency.SEK, new BigDecimal("0.15"));
        usdConversionRateMap.put(Currency.USD, new BigDecimal("1.0"));
    }
    
    private Map<Currency, BigDecimal> usdConversionRateMap;
}
