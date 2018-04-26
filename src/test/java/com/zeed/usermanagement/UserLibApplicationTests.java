package com.zeed.usermanagement;

import com.zeed.generic.RestApiClient;
import com.zeed.usermanagement.apimodels.ManagedUserModelApi;
import com.zeed.usermanagement.models.ManagedUser;
import com.zeed.usermanagement.models.UserCategory;
import com.zeed.usermanagement.request.UserDetailsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {UserDetailsRequest.class, RestApiClient.class})
public class UserLibApplicationTests {

	@Autowired
	public UserDetailsRequest userDetailsRequest;


	@Test
	public void contextLoads() {
	}

	@Test
	public void getUserInfo() throws Exception {
		userDetailsRequest.getManagedUserDetails("superuser");
	}
	@Test
	public void addUser() throws Exception {
		Date date = new Date(new java.util.Date().getTime());
		ManagedUser managedUser = new ManagedUser();
		managedUser.setPassword("password");
		managedUser.setDateCreated(date);
		managedUser.setEmail("mytest@email.com");
		managedUser.setFirstName("Saheed");
		managedUser.setLastName("Yusuf");
		managedUser.setPhoneNumber("00000000000000");
		managedUser.setUserCategory(UserCategory.ADMIN);
		managedUser.setUserName("zeedoli2");
		ManagedUserModelApi managedUserModelApi = userDetailsRequest.addManagedUser(managedUser);
		return;
	}
}
