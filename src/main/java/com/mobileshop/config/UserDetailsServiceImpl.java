package com.mobileshop.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mobileshop.model.RoleModel;
import com.mobileshop.model.UserModel;
import com.mobileshop.service.RoleService;
import com.mobileshop.service.UserService;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		try {
			UserModel user = userService.getUserByEmail(email);
			if (user == null) {
				throw new UsernameNotFoundException("User not found");
			}

			RoleModel roleModel = roleService.getRole(user.getRoleId());

			List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
			grantedAuthorities.add(new SimpleGrantedAuthority(roleModel.getRoleName()));

			UserDetails userDetails = (UserDetails) new User(user.getEmail(), user.getPassword(), grantedAuthorities);
			return userDetails;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
