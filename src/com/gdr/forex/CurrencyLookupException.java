package com.gdr.forex;

import javax.xml.ws.WebFault;

// TODO: Mark this class as a Web fault named "conversionFaultInfo"

@WebFault(name="conversionFaultInfo")
public class CurrencyLookupException extends Exception {
    private CurrencyLookupFaultDetail faultInfo;

    /** Convenience constructor */
    public CurrencyLookupException(String message, Currency currency) {
        this(message, new CurrencyLookupFaultDetail(currency, message));
    }

    /** Constructor required by JAX-WS specification */
    public CurrencyLookupException(String message, 
    		CurrencyLookupFaultDetail faultInfo) {
        this(message, faultInfo, null);
    }

    /** Constructor required by JAX-WS specification */
    public CurrencyLookupException(String message, 
    		CurrencyLookupFaultDetail faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }
    
    public CurrencyLookupFaultDetail getFaultInfo() {
        return faultInfo;
    }

}
