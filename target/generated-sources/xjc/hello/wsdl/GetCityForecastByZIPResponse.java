//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.28 at 10:54:51 AM SGT 
//


package hello.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCityForecastByZIPResult" type="{http://ws.cdyne.com/WeatherWS/}ForecastReturn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCityForecastByZIPResult"
})
@XmlRootElement(name = "GetCityForecastByZIPResponse")
public class GetCityForecastByZIPResponse {

    @XmlElement(name = "GetCityForecastByZIPResult")
    protected ForecastReturn getCityForecastByZIPResult;

    /**
     * Gets the value of the getCityForecastByZIPResult property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastReturn }
     *     
     */
    public ForecastReturn getGetCityForecastByZIPResult() {
        return getCityForecastByZIPResult;
    }

    /**
     * Sets the value of the getCityForecastByZIPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastReturn }
     *     
     */
    public void setGetCityForecastByZIPResult(ForecastReturn value) {
        this.getCityForecastByZIPResult = value;
    }

}
