package com.mobileshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
	
	@Autowired
	AuthenticationSuccessHandler authenticationSuccessHandler;
	
	@Autowired
	LogoutSuccessHandler logoutSuccessHandler;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
        http
			.authorizeRequests()
				.antMatchers("/admin/**").hasAnyAuthority("ADMIN")
                .antMatchers("/*").permitAll()
                .and()
            .formLogin()
            	.permitAll()
            	.loginProcessingUrl("/j_spring_security_login")
            	.loginPage("/signin")
            	.usernameParameter("email")
            	.passwordParameter("password")
//            	.successHandler(authenticationSuccessHandler)
            	//.defaultSuccessUrl("/login-success")
            	.failureUrl("/signin?message=Invalid Email or Password")
            	.and()
            .logout()
            	.permitAll()
            	.logoutUrl("/logout")
            	.logoutSuccessHandler(logoutSuccessHandler)
            	.and()
            .exceptionHandling()
                .accessDeniedPage("/signin?message=access-denied");
    }
	
}
