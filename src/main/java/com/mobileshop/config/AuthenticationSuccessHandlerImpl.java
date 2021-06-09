package com.mobileshop.config;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.mobileshop.model.UserModel;
import com.mobileshop.service.UserService;

@Component
public class AuthenticationSuccessHandlerImpl extends SimpleUrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler, LogoutSuccessHandler {

	@Autowired
	HttpSession session;

	@Autowired
	UserService userService;
	
	public AuthenticationSuccessHandlerImpl() {
        super();
        setUseReferer(true);
    }

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		String email = "";
		if (authentication.getPrincipal() instanceof Principal) {
			email = ((Principal) authentication.getPrincipal()).getName();
		} else {
			email = ((User) authentication.getPrincipal()).getUsername();
		}
		UserModel userModel = null;
		try {
			userModel = userService.getUserByEmail(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("USER", userModel);
		handle(request, response, authentication);
	}

	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		request.getSession().removeAttribute("USER");
		response.sendRedirect("/");
	}

}
