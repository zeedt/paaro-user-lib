package com.zeed.usermanagement.request;


import com.zeed.generic.RestApiClient;
import com.zeed.usermanagement.apimodels.ManagedUserModelApi;
import com.zeed.usermanagement.enums.ResponseStatus;
import com.zeed.usermanagement.models.ManagedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;

@Service
public class UserDetailsRequest {

    @Autowired
    private RestApiClient restApiClient;

    @Value("${user.service.url:http://localhost:8011}")
    private String url;

    public ManagedUserModelApi getManagedUserDetails(String username) throws Exception {

        try {
            ManagedUserModelApi managedUserModelApi = restApiClient.apiGetAndGetClass(url+"/user/getDetailsByUsername/"+username,ManagedUserModelApi.class,
                    null,null);

            return managedUserModelApi;
        } catch (Exception e) {
            e.printStackTrace();
            return new ManagedUserModelApi(null,null, ResponseStatus.SYSTEM_ERROR,String.format("Error occured due to " + e.getCause().toString()));
        }
    }
    public ManagedUserModelApi getManagedUserDetailsEntity(String username) throws Exception {

        HashMap<String,String> headers = new HashMap<>();

        try {
            ManagedUserModelApi userModelApi = restApiClient.apiGetAndGetClass(url+"/user/getDetailsByUsername/"+username,ManagedUserModelApi.class,
                    null,headers);

            return userModelApi;
        } catch (Exception e) {
            e.printStackTrace();
            return new ManagedUserModelApi(new ManagedUser(),null, ResponseStatus.SYSTEM_ERROR,String.format("Error occured due to " + e.getCause().toString()));
        }
    }

    public ManagedUserModelApi addManagedUser(ManagedUser managedUser){

        HashMap<String,String> headers = new HashMap<>();

        try {
            ManagedUserModelApi managedUserModelApi = restApiClient.apiPostAndGetClass(url+"/user/createUser",ManagedUserModelApi.class,managedUser,headers);
            return managedUserModelApi;
        } catch (Exception e) {
            e.printStackTrace();
            return new ManagedUserModelApi(managedUser,null, ResponseStatus.SYSTEM_ERROR,String.format("Error occured due to " + e.getCause().toString()));
        }

    }

}
