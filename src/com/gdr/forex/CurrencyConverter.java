package com.gdr.forex;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

// TODO:
// 1. Add the annotation that tells JAX-WS that this interface defines a
//    Web service named "CurrencyConverter"
@WebService(name="CurrencyConverter")
public interface CurrencyConverter {

    /**
     * Convert value from one currency to another.
     */
    // TODO:
    // 1. Set the name of the WSDL operation's result to "convertedAmount"
    // 2. Set the name of the WSDL operation's first parameter to "fromAmount"
    // 3. Set the name of the WSDL operation's second parameter to "toCurrency"
    public  @WebResult(name="convertedAmount") Amount getConvertedAmount(@WebParam(name="fromAmount") Amount from, @WebParam(name="toCurrency") Currency toCurrency)
                    throws CurrencyLookupException;

    /**
     * Get conversion rate from one currency to another.
     */
    public @WebResult(name="conversionRate") BigDecimal getConversionRate(
           @WebParam(name="fromCurrency") Currency fromCurrency,
           @WebParam(name="toCurrency") Currency toCurrency)
              throws CurrencyLookupException;

}
