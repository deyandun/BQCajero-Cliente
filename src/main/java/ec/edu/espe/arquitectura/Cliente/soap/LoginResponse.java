//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.12.02 a las 09:45:31 PM COT 
//


package ec.edu.espe.arquitectura.Cliente.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userSerializer" type="{http://espe.edu.ec/BQAuth/soap}userSerializer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userSerializer"
})
@XmlRootElement(name = "loginResponse")
public class LoginResponse {

    @XmlElement(required = true)
    protected UserSerializer userSerializer;

    /**
     * Obtiene el valor de la propiedad userSerializer.
     * 
     * @return
     *     possible object is
     *     {@link UserSerializer }
     *     
     */
    public UserSerializer getUserSerializer() {
        return userSerializer;
    }

    /**
     * Define el valor de la propiedad userSerializer.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSerializer }
     *     
     */
    public void setUserSerializer(UserSerializer value) {
        this.userSerializer = value;
    }

}
