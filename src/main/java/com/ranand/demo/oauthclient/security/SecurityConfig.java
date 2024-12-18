package com.ranand.demo.oauthclient.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Ramesh Anand
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Protect all endpoints
        http
                .oauth2Login()
                .and()
                .authorizeRequests()
                .antMatchers("/public/**").permitAll() // Public endpoints accessible without OAuth authentication
                .anyRequest().authenticated(); // All other endpoints require authentication via OAuth2 login
    }
}