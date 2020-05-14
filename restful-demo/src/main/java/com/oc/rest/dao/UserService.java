/**
 * 
 */
package com.oc.rest.dao;

import java.util.Map;

import com.oc.rest.model.User;


public interface UserService {
	
	public void addUser(User u);

	public void deleteUser(String id);

	public void updateUser(User u);

	public User getUser(String id);
	
	public Map<String, User> getMapOfUser();
}
