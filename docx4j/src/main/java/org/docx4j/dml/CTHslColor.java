
package org.docx4j.dml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_HslColor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_HslColor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://schemas.openxmlformats.org/drawingml/2006/main}EG_ColorTransform" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hue" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PositiveFixedAngle" />
 *       &lt;attribute name="sat" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_Percentage" />
 *       &lt;attribute name="lum" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_Percentage" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_HslColor", propOrder = {
    "egColorTransform"
})
public class CTHslColor implements Child
{

    @XmlElementRefs({
        @XmlElementRef(name = "redMod", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "alphaOff", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "inv", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "gamma", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "hue", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "blueOff", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "red", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "sat", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "lum", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "gray", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "alpha", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "comp", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "satOff", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "tint", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "blue", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "invGamma", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "greenMod", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "hueOff", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "lumOff", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "hueMod", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "lumMod", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "blueMod", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "greenOff", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "shade", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "green", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "redOff", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "alphaMod", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "satMod", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> egColorTransform;
    @XmlAttribute(required = true)
    protected int hue;
    @XmlAttribute(required = true)
    protected int sat;
    @XmlAttribute(required = true)
    protected int lum;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the egColorTransform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egColorTransform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEGColorTransform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTFixedPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTInverseTransform }{@code >}
     * {@link JAXBElement }{@code <}{@link CTGammaTransform }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPositiveFixedAngle }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTGrayscaleTransform }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPositiveFixedPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTComplementTransform }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPositiveFixedPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTInverseGammaTransform }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTAngle }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPositivePercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPositiveFixedPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPositivePercentage }{@code >}
     * {@link JAXBElement }{@code <}{@link CTPercentage }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getEGColorTransform() {
        if (egColorTransform == null) {
            egColorTransform = new ArrayList<JAXBElement<?>>();
        }
        return this.egColorTransform;
    }

    /**
     * Gets the value of the hue property.
     * 
     */
    public int getHue() {
        return hue;
    }

    /**
     * Sets the value of the hue property.
     * 
     */
    public void setHue(int value) {
        this.hue = value;
    }

    /**
     * Gets the value of the sat property.
     * 
     */
    public int getSat() {
        return sat;
    }

    /**
     * Sets the value of the sat property.
     * 
     */
    public void setSat(int value) {
        this.sat = value;
    }

    /**
     * Gets the value of the lum property.
     * 
     */
    public int getLum() {
        return lum;
    }

    /**
     * Sets the value of the lum property.
     * 
     */
    public void setLum(int value) {
        this.lum = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
