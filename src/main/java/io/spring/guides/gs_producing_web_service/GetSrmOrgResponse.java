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
 *                   &lt;element name="RESULT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SUCCESSCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ERRORCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ERRORINFO" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="EX_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EX_MSG" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "getSrmOrgResponse")
public class GetSrmOrgResponse {

    @XmlElement(required = true)
    protected GetSrmOrgResponse.CommonHeader commonHeader;
    @XmlElement(name = "LIST", required = true)
    protected GetSrmOrgResponse.LIST list;

    /**
     * 获取commonHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSrmOrgResponse.CommonHeader }
     *     
     */
    public GetSrmOrgResponse.CommonHeader getCommonHeader() {
        return commonHeader;
    }

    /**
     * 设置commonHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSrmOrgResponse.CommonHeader }
     *     
     */
    public void setCommonHeader(GetSrmOrgResponse.CommonHeader value) {
        this.commonHeader = value;
    }

    /**
     * 获取list属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSrmOrgResponse.LIST }
     *     
     */
    public GetSrmOrgResponse.LIST getLIST() {
        return list;
    }

    /**
     * 设置list属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSrmOrgResponse.LIST }
     *     
     */
    public void setLIST(GetSrmOrgResponse.LIST value) {
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
     *         &lt;element name="RESULT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SUCCESSCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ERRORCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ERRORINFO" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "result",
        "successcount",
        "errorcode",
        "errorinfo",
        "comments"
    })
    public static class CommonHeader {

        @XmlElement(name = "BIZTRANSACTIONID", required = true)
        protected String biztransactionid;
        @XmlElement(name = "RESULT", required = true)
        protected String result;
        @XmlElement(name = "SUCCESSCOUNT", required = true)
        protected String successcount;
        @XmlElement(name = "ERRORCODE", required = true)
        protected String errorcode;
        @XmlElement(name = "ERRORINFO", required = true)
        protected String errorinfo;
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
         * 获取result属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRESULT() {
            return result;
        }

        /**
         * 设置result属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRESULT(String value) {
            this.result = value;
        }

        /**
         * 获取successcount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUCCESSCOUNT() {
            return successcount;
        }

        /**
         * 设置successcount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUCCESSCOUNT(String value) {
            this.successcount = value;
        }

        /**
         * 获取errorcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERRORCODE() {
            return errorcode;
        }

        /**
         * 设置errorcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERRORCODE(String value) {
            this.errorcode = value;
        }

        /**
         * 获取errorinfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERRORINFO() {
            return errorinfo;
        }

        /**
         * 设置errorinfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERRORINFO(String value) {
            this.errorinfo = value;
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
     *                   &lt;element name="EX_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EX_MSG" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        protected GetSrmOrgResponse.LIST.Header header;

        /**
         * 获取header属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GetSrmOrgResponse.LIST.Header }
         *     
         */
        public GetSrmOrgResponse.LIST.Header getHeader() {
            return header;
        }

        /**
         * 设置header属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GetSrmOrgResponse.LIST.Header }
         *     
         */
        public void setHeader(GetSrmOrgResponse.LIST.Header value) {
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
         *         &lt;element name="EX_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EX_MSG" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "excode",
            "exmsg"
        })
        public static class Header {

            @XmlElement(name = "EX_CODE", required = true)
            protected String excode;
            @XmlElement(name = "EX_MSG", required = true)
            protected String exmsg;

            /**
             * 获取excode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXCODE() {
                return excode;
            }

            /**
             * 设置excode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXCODE(String value) {
                this.excode = value;
            }

            /**
             * 获取exmsg属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXMSG() {
                return exmsg;
            }

            /**
             * 设置exmsg属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXMSG(String value) {
                this.exmsg = value;
            }

        }

    }

}
