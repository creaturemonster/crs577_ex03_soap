
package com.gdr.forex.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getConvertedAmountResponse", namespace = "http://forex.gdr.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConvertedAmountResponse", namespace = "http://forex.gdr.com/")
public class GetConvertedAmountResponse {

    @XmlElement(name = "convertedAmount", namespace = "")
    private com.gdr.forex.Amount convertedAmount;

    /**
     * 
     * @return
     *     returns Amount
     */
    public com.gdr.forex.Amount getConvertedAmount() {
        return this.convertedAmount;
    }

    /**
     * 
     * @param convertedAmount
     *     the value for the convertedAmount property
     */
    public void setConvertedAmount(com.gdr.forex.Amount convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

}
