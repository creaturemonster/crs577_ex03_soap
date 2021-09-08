
package com.gdr.forex.jaxws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getConversionRateResponse", namespace = "http://forex.gdr.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConversionRateResponse", namespace = "http://forex.gdr.com/")
public class GetConversionRateResponse {

    @XmlElement(name = "conversionRate", namespace = "")
    private BigDecimal conversionRate;

    /**
     * 
     * @return
     *     returns BigDecimal
     */
    public BigDecimal getConversionRate() {
        return this.conversionRate;
    }

    /**
     * 
     * @param conversionRate
     *     the value for the conversionRate property
     */
    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

}
