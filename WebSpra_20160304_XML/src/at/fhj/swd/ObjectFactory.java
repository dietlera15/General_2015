//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.04 um 07:19:07 PM CET 
//


package at.fhj.swd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.fhj.swd package. 
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

    private final static QName _Spielplan_QNAME = new QName("http://www.example.org/spielplan", "spielplan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.fhj.swd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Spielplan }
     * 
     */
    public Spielplan createSpielplan() {
        return new Spielplan();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Feld }
     * 
     */
    public Feld createFeld() {
        return new Feld();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Spielplan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/spielplan", name = "spielplan")
    public JAXBElement<Spielplan> createSpielplan(Spielplan value) {
        return new JAXBElement<Spielplan>(_Spielplan_QNAME, Spielplan.class, null, value);
    }

}
