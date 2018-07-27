package com.zeed.usermanagement.apimodels;


import com.zeed.usermanagement.enums.ResponseStatus;
import com.zeed.usermanagement.models.Authority;
import com.zeed.usermanagement.models.ManagedUser;

import java.io.Serializable;
import java.util.List;

public class ManagedUserModelApi {

    private ManagedUser managedUser;

    private List<Authority> authorityList;

    private ResponseStatus responseStatus;

    private Authority authorityModel;

    private String message;

    private String email;

    private List<String> authorities;

    private String authority;

    public ManagedUserModelApi (ManagedUser managedUser, List<Authority> authorityList, ResponseStatus responseStatus) {
        this.managedUser = managedUser;
        this.authorityList = authorityList;
        this.responseStatus = responseStatus;
    }
    public ManagedUserModelApi (ManagedUser managedUser, Authority authorityModel, List<Authority> authorityList, ResponseStatus responseStatus) {
        this.managedUser = managedUser;
        this.authorityList = authorityList;
        this.authorityModel = authorityModel;
        this.responseStatus = responseStatus;
    }
    public ManagedUserModelApi (ManagedUser managedUser, Authority authorityModel, ResponseStatus responseStatus) {
        this.managedUser = managedUser;
        this.authorityModel = authorityModel;
        this.responseStatus = responseStatus;
    }
    public ManagedUserModelApi (ManagedUser managedUser, List<Authority> authorityList, ResponseStatus responseStatus, String message) {
        this.managedUser = managedUser;
        this.authorityList = authorityList;
        this.responseStatus = responseStatus;
        this.message = message;
    }

    public ManagedUserModelApi() {
    }

    public ManagedUserModelApi(ResponseStatus responseStatus, String message) {
        this.responseStatus = responseStatus;
        this.message = message;
    }

    public ManagedUser getManagedUser() {
        return managedUser;
    }

    public void setManagedUser(ManagedUser managedUser) {
        this.managedUser = managedUser;
    }

    public List<Authority> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<Authority> authorityList) {
        this.authorityList = authorityList;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Authority getAuthorityModel() {
        return authorityModel;
    }

    public void setAuthorityModel(Authority authorityModel) {
        this.authorityModel = authorityModel;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
