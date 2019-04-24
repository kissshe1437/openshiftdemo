//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.26 时间 09:53:24 AM CST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BIZTRANSACTIONID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CONSUMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SRVLEVEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LIST">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Header">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="company_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="vendor_class_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="company_full_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="business_unit_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tax_id_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="bank_account_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="bank_branch_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="bank_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="son_bank_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="vendor_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "commonHeader",
    "list"
})
@XmlRootElement(name = "getSrmOrgRequest")
public class GetSrmOrgRequest {

    @XmlElement(required = true)
    protected GetSrmOrgRequest.CommonHeader commonHeader;
    @XmlElement(name = "LIST", required = true)
    protected GetSrmOrgRequest.LIST list;

    /**
     * 获取commonHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSrmOrgRequest.CommonHeader }
     *     
     */
    public GetSrmOrgRequest.CommonHeader getCommonHeader() {
        return commonHeader;
    }

    /**
     * 设置commonHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSrmOrgRequest.CommonHeader }
     *     
     */
    public void setCommonHeader(GetSrmOrgRequest.CommonHeader value) {
        this.commonHeader = value;
    }

    /**
     * 获取list属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSrmOrgRequest.LIST }
     *     
     */
    public GetSrmOrgRequest.LIST getLIST() {
        return list;
    }

    /**
     * 设置list属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSrmOrgRequest.LIST }
     *     
     */
    public void setLIST(GetSrmOrgRequest.LIST value) {
        this.list = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BIZTRANSACTIONID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CONSUMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SRVLEVEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "biztransactionid",
        "count",
        "consumer",
        "srvlevel",
        "account",
        "password",
        "comments"
    })
    public static class CommonHeader {

        @XmlElement(name = "BIZTRANSACTIONID", required = true)
        protected String biztransactionid;
        @XmlElement(name = "COUNT", required = true)
        protected String count;
        @XmlElement(name = "CONSUMER", required = true)
        protected String consumer;
        @XmlElement(name = "SRVLEVEL", required = true)
        protected String srvlevel;
        @XmlElement(name = "ACCOUNT", required = true)
        protected String account;
        @XmlElement(name = "PASSWORD", required = true)
        protected String password;
        @XmlElement(name = "COMMENTS", required = true)
        protected String comments;

        /**
         * 获取biztransactionid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBIZTRANSACTIONID() {
            return biztransactionid;
        }

        /**
         * 设置biztransactionid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBIZTRANSACTIONID(String value) {
            this.biztransactionid = value;
        }

        /**
         * 获取count属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNT() {
            return count;
        }

        /**
         * 设置count属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNT(String value) {
            this.count = value;
        }

        /**
         * 获取consumer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSUMER() {
            return consumer;
        }

        /**
         * 设置consumer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSUMER(String value) {
            this.consumer = value;
        }

        /**
         * 获取srvlevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSRVLEVEL() {
            return srvlevel;
        }

        /**
         * 设置srvlevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSRVLEVEL(String value) {
            this.srvlevel = value;
        }

        /**
         * 获取account属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNT() {
            return account;
        }

        /**
         * 设置account属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNT(String value) {
            this.account = value;
        }

        /**
         * 获取password属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSWORD() {
            return password;
        }

        /**
         * 设置password属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSWORD(String value) {
            this.password = value;
        }

        /**
         * 获取comments属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMENTS() {
            return comments;
        }

        /**
         * 设置comments属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMENTS(String value) {
            this.comments = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Header">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="company_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="vendor_class_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="company_full_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="business_unit_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tax_id_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="bank_account_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="bank_branch_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="bank_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="son_bank_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="vendor_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "header"
    })
    public static class LIST {

        @XmlElement(name = "Header", required = true)
        protected GetSrmOrgRequest.LIST.Header header;

        /**
         * 获取header属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GetSrmOrgRequest.LIST.Header }
         *     
         */
        public GetSrmOrgRequest.LIST.Header getHeader() {
            return header;
        }

        /**
         * 设置header属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GetSrmOrgRequest.LIST.Header }
         *     
         */
        public void setHeader(GetSrmOrgRequest.LIST.Header value) {
            this.header = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="company_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="vendor_class_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="company_full_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="business_unit_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tax_id_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="bank_account_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="bank_branch_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="bank_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="son_bank_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="vendor_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "companyCode",
            "vendorClassCode",
            "companyFullName",
            "businessUnitCode",
            "taxIdNumber",
            "bankAccountNumber",
            "bankBranchName",
            "bankAddress",
            "sonBankName",
            "vendorType"
        })
        public static class Header {

            @XmlElement(name = "company_code", required = true)
            protected String companyCode;
            @XmlElement(name = "vendor_class_code", required = true)
            protected String vendorClassCode;
            @XmlElement(name = "company_full_name", required = true)
            protected String companyFullName;
            @XmlElement(name = "business_unit_code", required = true)
            protected String businessUnitCode;
            @XmlElement(name = "tax_id_number", required = true)
            protected String taxIdNumber;
            @XmlElement(name = "bank_account_number", required = true)
            protected String bankAccountNumber;
            @XmlElement(name = "bank_branch_name", required = true)
            protected String bankBranchName;
            @XmlElement(name = "bank_address", required = true)
            protected String bankAddress;
            @XmlElement(name = "son_bank_name", required = true)
            protected String sonBankName;
            @XmlElement(name = "vendor_type", required = true)
            protected String vendorType;

            /**
             * 获取companyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyCode() {
                return companyCode;
            }

            /**
             * 设置companyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyCode(String value) {
                this.companyCode = value;
            }

            /**
             * 获取vendorClassCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVendorClassCode() {
                return vendorClassCode;
            }

            /**
             * 设置vendorClassCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVendorClassCode(String value) {
                this.vendorClassCode = value;
            }

            /**
             * 获取companyFullName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyFullName() {
                return companyFullName;
            }

            /**
             * 设置companyFullName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyFullName(String value) {
                this.companyFullName = value;
            }

            /**
             * 获取businessUnitCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessUnitCode() {
                return businessUnitCode;
            }

            /**
             * 设置businessUnitCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessUnitCode(String value) {
                this.businessUnitCode = value;
            }

            /**
             * 获取taxIdNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxIdNumber() {
                return taxIdNumber;
            }

            /**
             * 设置taxIdNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxIdNumber(String value) {
                this.taxIdNumber = value;
            }

            /**
             * 获取bankAccountNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankAccountNumber() {
                return bankAccountNumber;
            }

            /**
             * 设置bankAccountNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankAccountNumber(String value) {
                this.bankAccountNumber = value;
            }

            /**
             * 获取bankBranchName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankBranchName() {
                return bankBranchName;
            }

            /**
             * 设置bankBranchName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankBranchName(String value) {
                this.bankBranchName = value;
            }

            /**
             * 获取bankAddress属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankAddress() {
                return bankAddress;
            }

            /**
             * 设置bankAddress属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankAddress(String value) {
                this.bankAddress = value;
            }

            /**
             * 获取sonBankName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSonBankName() {
                return sonBankName;
            }

            /**
             * 设置sonBankName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSonBankName(String value) {
                this.sonBankName = value;
            }

            /**
             * 获取vendorType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVendorType() {
                return vendorType;
            }

            /**
             * 设置vendorType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVendorType(String value) {
                this.vendorType = value;
            }

        }

    }

}
