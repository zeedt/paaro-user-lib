package com.zeed.usermanagement.request;

import com.zeed.generic.RestApiClient;
import com.zeed.usermanagement.apimodels.ManagedUserModelApi;
import com.zeed.usermanagement.enums.ResponseStatus;
import com.zeed.usermanagement.models.Authority;
import com.zeed.usermanagement.models.ManagedUser;
import com.zeed.usermanagement.requestmodels.UserUpdateRequestModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AuthorityRequest {

    @Value("${user.service.url:http://localhost:8011}")
    private String url;

    Logger logger = LoggerFactory.getLogger(AuthorityRequest.class.getName());

    @Autowired
    private RestApiClient restApiClient;

    public ManagedUserModelApi fetchAllAuthorities() {
        HashMap<String,String> headers = new HashMap<>();

        try {
            ManagedUserModelApi managedUserModelApi = restApiClient.apiGetAndGetClass(url+"/authority/fetchAllAuthorities",ManagedUserModelApi.class,new Object[0],headers,true);
            return managedUserModelApi;
        } catch (Exception e) {
            logger.error("Error occured while fetching authorities due to ", e);
            return new ManagedUserModelApi(null,null, ResponseStatus.SYSTEM_ERROR,String.format("Error occured while fetching authorities due to " + e.getCause().toString()));
        }
    }

    public ManagedUserModelApi mapAuthoritiestoUser(ManagedUserModelApi requestModel) {
        HashMap<String,String> headers = new HashMap<>();

        try {
            ManagedUserModelApi managedUserModelApi = restApiClient.apiPostAndGetClass(url+"/authority/mapAuthoritiesToUser",ManagedUserModelApi.class,requestModel,headers, true);
            return managedUserModelApi;
        } catch (Exception e) {
            logger.error("Error occured while mapping authorities to user due to ", e);
            return new ManagedUserModelApi(null,null, ResponseStatus.SYSTEM_ERROR,String.format("Error occured while mapping authorities due to " + e.getCause().toString()));
        }
    }

    public ManagedUserModelApi mapAuthoritytoUser(ManagedUserModelApi requestModel) {
        HashMap<String,String> headers = new HashMap<>();

        try {
            ManagedUserModelApi managedUserModelApi = restApiClient.apiPostAndGetClass(url+"/authority/mapAuthorityToUser",ManagedUserModelApi.class,requestModel,headers, true);
            return managedUserModelApi;
        } catch (Exception e) {
            logger.error("Error occured while mapping authority to user due to ", e);
            return new ManagedUserModelApi(null,null, ResponseStatus.SYSTEM_ERROR,String.format("Error occured while mapping authority due to " + e.getCause().toString()));
        }
    }

    public ManagedUserModelApi addAuthority(Authority authority) {
        HashMap<String,String> headers = new HashMap<>();

        try {
            ManagedUserModelApi managedUserModelApi = restApiClient.apiPostAndGetClass(url+"/authority/addAuthority",ManagedUserModelApi.class,authority,headers, true);
            return managedUserModelApi;
        } catch (Exception e) {
            logger.error("Error occured while adding authority ", e);
            return new ManagedUserModelApi(null,null, ResponseStatus.SYSTEM_ERROR,String.format("Error occured while adding authority due to " + e.getCause().toString()));
        }
    }


}
