
package com.ltree.converter.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ltree.converter.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetConvertedAmountResponse_QNAME = new QName("http://forex.gdr.com/", "getConvertedAmountResponse");
    private final static QName _GetConversionRate_QNAME = new QName("http://forex.gdr.com/", "getConversionRate");
    private final static QName _GetConversionRateResponse_QNAME = new QName("http://forex.gdr.com/", "getConversionRateResponse");
    private final static QName _GetConvertedAmount_QNAME = new QName("http://forex.gdr.com/", "getConvertedAmount");
    private final static QName _ConversionFaultInfo_QNAME = new QName("http://forex.gdr.com/", "conversionFaultInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ltree.converter.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetConvertedAmountResponse }
     * 
     */
    public GetConvertedAmountResponse createGetConvertedAmountResponse() {
        return new GetConvertedAmountResponse();
    }

    /**
     * Create an instance of {@link CurrencyLookupFaultDetail }
     * 
     */
    public CurrencyLookupFaultDetail createCurrencyLookupFaultDetail() {
        return new CurrencyLookupFaultDetail();
    }

    /**
     * Create an instance of {@link GetConversionRate }
     * 
     */
    public GetConversionRate createGetConversionRate() {
        return new GetConversionRate();
    }

    /**
     * Create an instance of {@link GetConversionRateResponse }
     * 
     */
    public GetConversionRateResponse createGetConversionRateResponse() {
        return new GetConversionRateResponse();
    }

    /**
     * Create an instance of {@link GetConvertedAmount }
     * 
     */
    public GetConvertedAmount createGetConvertedAmount() {
        return new GetConvertedAmount();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConvertedAmountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://forex.gdr.com/", name = "getConvertedAmountResponse")
    public JAXBElement<GetConvertedAmountResponse> createGetConvertedAmountResponse(GetConvertedAmountResponse value) {
        return new JAXBElement<GetConvertedAmountResponse>(_GetConvertedAmountResponse_QNAME, GetConvertedAmountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConversionRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://forex.gdr.com/", name = "getConversionRate")
    public JAXBElement<GetConversionRate> createGetConversionRate(GetConversionRate value) {
        return new JAXBElement<GetConversionRate>(_GetConversionRate_QNAME, GetConversionRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConversionRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://forex.gdr.com/", name = "getConversionRateResponse")
    public JAXBElement<GetConversionRateResponse> createGetConversionRateResponse(GetConversionRateResponse value) {
        return new JAXBElement<GetConversionRateResponse>(_GetConversionRateResponse_QNAME, GetConversionRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConvertedAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://forex.gdr.com/", name = "getConvertedAmount")
    public JAXBElement<GetConvertedAmount> createGetConvertedAmount(GetConvertedAmount value) {
        return new JAXBElement<GetConvertedAmount>(_GetConvertedAmount_QNAME, GetConvertedAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyLookupFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://forex.gdr.com/", name = "conversionFaultInfo")
    public JAXBElement<CurrencyLookupFaultDetail> createConversionFaultInfo(CurrencyLookupFaultDetail value) {
        return new JAXBElement<CurrencyLookupFaultDetail>(_ConversionFaultInfo_QNAME, CurrencyLookupFaultDetail.class, null, value);
    }

}
