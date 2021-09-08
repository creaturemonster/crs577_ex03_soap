
package com.gdr.forex.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getConversionRate", namespace = "http://forex.gdr.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConversionRate", namespace = "http://forex.gdr.com/", propOrder = {
    "fromCurrency",
    "toCurrency"
})
public class GetConversionRate {

    @XmlElement(name = "fromCurrency", namespace = "")
    private com.gdr.forex.Currency fromCurrency;
    @XmlElement(name = "toCurrency", namespace = "")
    private com.gdr.forex.Currency toCurrency;

    /**
     * 
     * @return
     *     returns Currency
     */
    public com.gdr.forex.Currency getFromCurrency() {
        return this.fromCurrency;
    }

    /**
     * 
     * @param fromCurrency
     *     the value for the fromCurrency property
     */
    public void setFromCurrency(com.gdr.forex.Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    /**
     * 
     * @return
     *     returns Currency
     */
    public com.gdr.forex.Currency getToCurrency() {
        return this.toCurrency;
    }

    /**
     * 
     * @param toCurrency
     *     the value for the toCurrency property
     */
    public void setToCurrency(com.gdr.forex.Currency toCurrency) {
        this.toCurrency = toCurrency;
    }

}
