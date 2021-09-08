
package com.gdr.forex.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getConvertedAmount", namespace = "http://forex.gdr.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConvertedAmount", namespace = "http://forex.gdr.com/", propOrder = {
    "fromAmount",
    "toCurrency"
})
public class GetConvertedAmount {

    @XmlElement(name = "fromAmount", namespace = "")
    private com.gdr.forex.Amount fromAmount;
    @XmlElement(name = "toCurrency", namespace = "")
    private com.gdr.forex.Currency toCurrency;

    /**
     * 
     * @return
     *     returns Amount
     */
    public com.gdr.forex.Amount getFromAmount() {
        return this.fromAmount;
    }

    /**
     * 
     * @param fromAmount
     *     the value for the fromAmount property
     */
    public void setFromAmount(com.gdr.forex.Amount fromAmount) {
        this.fromAmount = fromAmount;
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
