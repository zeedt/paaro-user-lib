package com.zeed.usermanagement.apimodels;


import com.zeed.usermanagement.enums.ResponseStatus;
import com.zeed.usermanagement.models.Authority;
import com.zeed.usermanagement.models.ManagedUser;

import java.io.Serializable;
import java.util.List;

public class ManagedUserModelApi implements Serializable {

    private ManagedUser managedUser;

    private List<Authority> authorities;

    private ResponseStatus responseStatus;

    private Authority authority;

    private String message;

    public ManagedUserModelApi (ManagedUser managedUser, List<Authority> authorities, ResponseStatus responseStatus) {
        this.managedUser = managedUser;
        this.authorities = authorities;
        this.responseStatus = responseStatus;
    }
    public ManagedUserModelApi (ManagedUser managedUser, Authority authority, List<Authority> authorities, ResponseStatus responseStatus) {
        this.managedUser = managedUser;
        this.authorities = authorities;
        this.authority = authority;
        this.responseStatus = responseStatus;
    }
    public ManagedUserModelApi (ManagedUser managedUser, Authority authority, ResponseStatus responseStatus) {
        this.managedUser = managedUser;
        this.authority = authority;
        this.responseStatus = responseStatus;
    }
    public ManagedUserModelApi (ManagedUser managedUser, List<Authority> authorities, ResponseStatus responseStatus, String message) {
        this.managedUser = managedUser;
        this.authorities = authorities;
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

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
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

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }
}
