/**
 * Offer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.amazon.ws;

public class Offer  implements java.io.Serializable {
    private com.amazon.ws.Merchant merchant;

    private com.amazon.ws.Seller seller;

    private com.amazon.ws.Image smallImage;

    private com.amazon.ws.Image mediumImage;

    private com.amazon.ws.Image largeImage;

    private com.amazon.ws.OfferAttributes offerAttributes;

    private com.amazon.ws.OfferListing[] offerListing;

    public Offer() {
    }

    public Offer(
           com.amazon.ws.Merchant merchant,
           com.amazon.ws.Seller seller,
           com.amazon.ws.Image smallImage,
           com.amazon.ws.Image mediumImage,
           com.amazon.ws.Image largeImage,
           com.amazon.ws.OfferAttributes offerAttributes,
           com.amazon.ws.OfferListing[] offerListing) {
           this.merchant = merchant;
           this.seller = seller;
           this.smallImage = smallImage;
           this.mediumImage = mediumImage;
           this.largeImage = largeImage;
           this.offerAttributes = offerAttributes;
           this.offerListing = offerListing;
    }


    /**
     * Gets the merchant value for this Offer.
     * 
     * @return merchant
     */
    public com.amazon.ws.Merchant getMerchant() {
        return merchant;
    }


    /**
     * Sets the merchant value for this Offer.
     * 
     * @param merchant
     */
    public void setMerchant(com.amazon.ws.Merchant merchant) {
        this.merchant = merchant;
    }


    /**
     * Gets the seller value for this Offer.
     * 
     * @return seller
     */
    public com.amazon.ws.Seller getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this Offer.
     * 
     * @param seller
     */
    public void setSeller(com.amazon.ws.Seller seller) {
        this.seller = seller;
    }


    /**
     * Gets the smallImage value for this Offer.
     * 
     * @return smallImage
     */
    public com.amazon.ws.Image getSmallImage() {
        return smallImage;
    }


    /**
     * Sets the smallImage value for this Offer.
     * 
     * @param smallImage
     */
    public void setSmallImage(com.amazon.ws.Image smallImage) {
        this.smallImage = smallImage;
    }


    /**
     * Gets the mediumImage value for this Offer.
     * 
     * @return mediumImage
     */
    public com.amazon.ws.Image getMediumImage() {
        return mediumImage;
    }


    /**
     * Sets the mediumImage value for this Offer.
     * 
     * @param mediumImage
     */
    public void setMediumImage(com.amazon.ws.Image mediumImage) {
        this.mediumImage = mediumImage;
    }


    /**
     * Gets the largeImage value for this Offer.
     * 
     * @return largeImage
     */
    public com.amazon.ws.Image getLargeImage() {
        return largeImage;
    }


    /**
     * Sets the largeImage value for this Offer.
     * 
     * @param largeImage
     */
    public void setLargeImage(com.amazon.ws.Image largeImage) {
        this.largeImage = largeImage;
    }


    /**
     * Gets the offerAttributes value for this Offer.
     * 
     * @return offerAttributes
     */
    public com.amazon.ws.OfferAttributes getOfferAttributes() {
        return offerAttributes;
    }


    /**
     * Sets the offerAttributes value for this Offer.
     * 
     * @param offerAttributes
     */
    public void setOfferAttributes(com.amazon.ws.OfferAttributes offerAttributes) {
        this.offerAttributes = offerAttributes;
    }


    /**
     * Gets the offerListing value for this Offer.
     * 
     * @return offerListing
     */
    public com.amazon.ws.OfferListing[] getOfferListing() {
        return offerListing;
    }


    /**
     * Sets the offerListing value for this Offer.
     * 
     * @param offerListing
     */
    public void setOfferListing(com.amazon.ws.OfferListing[] offerListing) {
        this.offerListing = offerListing;
    }

    public com.amazon.ws.OfferListing getOfferListing(int i) {
        return this.offerListing[i];
    }

    public void setOfferListing(int i, com.amazon.ws.OfferListing _value) {
        this.offerListing[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Offer)) return false;
        Offer other = (Offer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchant==null && other.getMerchant()==null) || 
             (this.merchant!=null &&
              this.merchant.equals(other.getMerchant()))) &&
            ((this.seller==null && other.getSeller()==null) || 
             (this.seller!=null &&
              this.seller.equals(other.getSeller()))) &&
            ((this.smallImage==null && other.getSmallImage()==null) || 
             (this.smallImage!=null &&
              this.smallImage.equals(other.getSmallImage()))) &&
            ((this.mediumImage==null && other.getMediumImage()==null) || 
             (this.mediumImage!=null &&
              this.mediumImage.equals(other.getMediumImage()))) &&
            ((this.largeImage==null && other.getLargeImage()==null) || 
             (this.largeImage!=null &&
              this.largeImage.equals(other.getLargeImage()))) &&
            ((this.offerAttributes==null && other.getOfferAttributes()==null) || 
             (this.offerAttributes!=null &&
              this.offerAttributes.equals(other.getOfferAttributes()))) &&
            ((this.offerListing==null && other.getOfferListing()==null) || 
             (this.offerListing!=null &&
              java.util.Arrays.equals(this.offerListing, other.getOfferListing())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMerchant() != null) {
            _hashCode += getMerchant().hashCode();
        }
        if (getSeller() != null) {
            _hashCode += getSeller().hashCode();
        }
        if (getSmallImage() != null) {
            _hashCode += getSmallImage().hashCode();
        }
        if (getMediumImage() != null) {
            _hashCode += getMediumImage().hashCode();
        }
        if (getLargeImage() != null) {
            _hashCode += getLargeImage().hashCode();
        }
        if (getOfferAttributes() != null) {
            _hashCode += getOfferAttributes().hashCode();
        }
        if (getOfferListing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferListing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferListing(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Offer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Offer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Merchant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Merchant"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Seller"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SmallImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediumImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "MediumImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "LargeImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OfferAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OfferAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerListing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OfferListing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OfferListing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
