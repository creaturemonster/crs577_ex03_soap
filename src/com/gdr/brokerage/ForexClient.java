/**
 * Chapter 3 lab exercise
 */
package com.gdr.brokerage;

import java.math.BigDecimal;

import com.ltree.converter.generated.Amount;
import com.ltree.converter.generated.Currency;
import com.ltree.converter.generated.CurrencyConverter;
import com.ltree.converter.generated.CurrencyConverterImplService;
import com.ltree.converter.generated.CurrencyLookupException;
import com.ltree.converter.generated.CurrencyLookupFaultDetail;

/**
 * Client application for forex service
 */
public class ForexClient {

    public static void main(String[] args) throws Exception {
        
        // Use the generated code to create a CurrencyConverter
        CurrencyConverterImplService currencyConverterService = 
                new CurrencyConverterImplService();
        CurrencyConverter converterProxy = 
                currencyConverterService.getCurrencyConverterImplPort();
        
        // To redirect requests to soapUI, uncomment the following lines of code 
//        ((javax.xml.ws.BindingProvider) converterProxy).getRequestContext().put(
//            javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
//            "http://localhost:7777");
        
        // Use the generated code to create an amount of 100 US Dollars
        Amount from = new Amount();
        
        from.setValue(new BigDecimal(100));
        from.setCurrency(Currency.USD);
        
        System.out.println("Attempting to convert USD to EUR:");
        // Convert the amount into Euros and print out the result
        Amount result = converterProxy.getConvertedAmount(from, Currency.EUR);
        System.out.println("\t" + toString(from) + " equals " + toString(result));

        from.setValue(new BigDecimal(100));
        from.setCurrency(Currency.JPY); // unsupported currency
        
        try {
            System.out.println("Attempting to convert JPY to EUR:");
            result = converterProxy.getConvertedAmount(from, Currency.EUR);
            System.out.println("\t" + toString(from) + " equals " + toString(result));
        } 
        catch (CurrencyLookupException e) {
            CurrencyLookupFaultDetail faultInfo = e.getFaultInfo();
            System.err.println(e.getMessage() + ": " + faultInfo.getCurrency());
        } 

    }

    private static String toString(Amount from) {
        return from.getValue().setScale(2) + " " + from.getCurrency();
    }

}
