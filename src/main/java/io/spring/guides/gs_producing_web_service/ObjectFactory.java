//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.26 时间 09:53:24 AM CST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.gs_producing_web_service package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.gs_producing_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSrmOrgRequest }
     * 
     */
    public GetSrmOrgRequest createGetSrmOrgRequest() {
        return new GetSrmOrgRequest();
    }

    /**
     * Create an instance of {@link GetSrmOrgResponse }
     * 
     */
    public GetSrmOrgResponse createGetSrmOrgResponse() {
        return new GetSrmOrgResponse();
    }

    /**
     * Create an instance of {@link GetSrmOrgResponse.LIST }
     * 
     */
    public GetSrmOrgResponse.LIST createGetSrmOrgResponseLIST() {
        return new GetSrmOrgResponse.LIST();
    }

    /**
     * Create an instance of {@link GetSrmOrgRequest.LIST }
     * 
     */
    public GetSrmOrgRequest.LIST createGetSrmOrgRequestLIST() {
        return new GetSrmOrgRequest.LIST();
    }

    /**
     * Create an instance of {@link GetSrmOrgRequest.CommonHeader }
     * 
     */
    public GetSrmOrgRequest.CommonHeader createGetSrmOrgRequestCommonHeader() {
        return new GetSrmOrgRequest.CommonHeader();
    }

    /**
     * Create an instance of {@link GetSrmOrgResponse.CommonHeader }
     * 
     */
    public GetSrmOrgResponse.CommonHeader createGetSrmOrgResponseCommonHeader() {
        return new GetSrmOrgResponse.CommonHeader();
    }

    /**
     * Create an instance of {@link GetSrmOrgResponse.LIST.Header }
     * 
     */
    public GetSrmOrgResponse.LIST.Header createGetSrmOrgResponseLISTHeader() {
        return new GetSrmOrgResponse.LIST.Header();
    }

    /**
     * Create an instance of {@link GetSrmOrgRequest.LIST.Header }
     * 
     */
    public GetSrmOrgRequest.LIST.Header createGetSrmOrgRequestLISTHeader() {
        return new GetSrmOrgRequest.LIST.Header();
    }

}
