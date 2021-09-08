
package com.ltree.converter.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CurrencyConverterImplService", targetNamespace = "http://forex.gdr.com/", wsdlLocation = "http://localhost:8080/ex03/currencyconverter?wsdl")
public class CurrencyConverterImplService
    extends Service
{

    private final static URL CURRENCYCONVERTERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CURRENCYCONVERTERIMPLSERVICE_EXCEPTION;
    private final static QName CURRENCYCONVERTERIMPLSERVICE_QNAME = new QName("http://forex.gdr.com/", "CurrencyConverterImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ex03/currencyconverter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CURRENCYCONVERTERIMPLSERVICE_WSDL_LOCATION = url;
        CURRENCYCONVERTERIMPLSERVICE_EXCEPTION = e;
    }

    public CurrencyConverterImplService() {
        super(__getWsdlLocation(), CURRENCYCONVERTERIMPLSERVICE_QNAME);
    }

    public CurrencyConverterImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYCONVERTERIMPLSERVICE_QNAME, features);
    }

    public CurrencyConverterImplService(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYCONVERTERIMPLSERVICE_QNAME);
    }

    public CurrencyConverterImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYCONVERTERIMPLSERVICE_QNAME, features);
    }

    public CurrencyConverterImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyConverterImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyConverter
     */
    @WebEndpoint(name = "CurrencyConverterImplPort")
    public CurrencyConverter getCurrencyConverterImplPort() {
        return super.getPort(new QName("http://forex.gdr.com/", "CurrencyConverterImplPort"), CurrencyConverter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConverter
     */
    @WebEndpoint(name = "CurrencyConverterImplPort")
    public CurrencyConverter getCurrencyConverterImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://forex.gdr.com/", "CurrencyConverterImplPort"), CurrencyConverter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYCONVERTERIMPLSERVICE_EXCEPTION!= null) {
            throw CURRENCYCONVERTERIMPLSERVICE_EXCEPTION;
        }
        return CURRENCYCONVERTERIMPLSERVICE_WSDL_LOCATION;
    }

}
