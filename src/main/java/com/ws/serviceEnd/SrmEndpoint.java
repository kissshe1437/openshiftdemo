package com.ws.serviceEnd;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.ws.repository.CountryRepository;

import io.spring.guides.gs_producing_web_service.GetSrmOrgRequest;
import io.spring.guides.gs_producing_web_service.GetSrmOrgResponse;
import io.spring.guides.gs_producing_web_service.GetSrmOrgResponse.CommonHeader;
import io.spring.guides.gs_producing_web_service.GetSrmOrgResponse.LIST;
import io.spring.guides.gs_producing_web_service.GetSrmOrgResponse.LIST.Header;

@Endpoint
public class SrmEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
                                                 //http://spring.io/guides/gs-producing-web-service
    private CountryRepository countryRepository;

    @Autowired
    public SrmEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSrmOrgRequest")
    @ResponsePayload
    public GetSrmOrgResponse getSrmOrgRequest(@RequestPayload GetSrmOrgRequest request) {
    	System.out.println("aaaaaaaaaaaaaa~~~~~");
    	GetSrmOrgResponse response = new GetSrmOrgResponse();  
    	CommonHeader CommonHeaderResponse=new CommonHeader();
    	CommonHeaderResponse.setBIZTRANSACTIONID("A1-YBC-TEST001");
      	CommonHeaderResponse.setSUCCESSCOUNT("1");
    	response.setCommonHeader(CommonHeaderResponse);
    	//
    	Header a=new Header();
    	 a.setEXCODE("200");
    	 a.setEXMSG("GOOD BOY!!");
    	 LIST list2=new LIST();
    	 list2.setHeader(a);   	 
    	 response.setLIST(list2);
    	 
        return response;
    }
}