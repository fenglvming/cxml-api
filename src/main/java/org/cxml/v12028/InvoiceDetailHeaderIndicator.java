//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 10:57:51 AM CEST 
//


package org.cxml.v12028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "InvoiceDetailHeaderIndicator")
public class InvoiceDetailHeaderIndicator {

    @XmlAttribute(name = "isHeaderInvoice")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isHeaderInvoice;
    @XmlAttribute(name = "isVatRecoverable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isVatRecoverable;

    /**
     * Gets the value of the isHeaderInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHeaderInvoice() {
        return isHeaderInvoice;
    }

    /**
     * Sets the value of the isHeaderInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHeaderInvoice(String value) {
        this.isHeaderInvoice = value;
    }

    /**
     * Gets the value of the isVatRecoverable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVatRecoverable() {
        return isVatRecoverable;
    }

    /**
     * Sets the value of the isVatRecoverable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVatRecoverable(String value) {
        this.isVatRecoverable = value;
    }

}