package com.mobileshop.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.mobileshop.model.UserModel;
import com.mobileshop.service.UserService;

@Component
public class AccountUtil {
	public static UserModel user;
	
	@Autowired
	UserService userService;
	
	@SuppressWarnings({ "unchecked" })
	public static List<String> getRoleNames() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		List<String> roleNames = new ArrayList<String>();
		if (principal instanceof UserDetails) {
			Set<GrantedAuthority> grantedAuthorities = (Set<GrantedAuthority>) ((UserDetails) principal).getAuthorities();
    		Iterator<GrantedAuthority> value = grantedAuthorities.iterator();
    		while (value.hasNext()) { 
    			roleNames.add(value.next().getAuthority());
            } 
		}
		return roleNames;
	}
	
	public UserModel getUser() {
		try {
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal instanceof UserDetails) {
				String email = ((UserDetails) principal).getUsername();
				UserModel userModel = userService.getUserByEmail(email);
				return userModel;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
