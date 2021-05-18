//package com.projects.praticandoAPI.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.projects.praticandoAPI.service.CustomUserDetailService;
//
////@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
////	@Autowired
////	private CustomUserDetailService customUserDetailService;
////
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/h2-console/**").permitAll().antMatchers(HttpMethod.POST, "/usuarios").permitAll();
////		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
////		http.csrf().disable();
////		http.headers().frameOptions().disable();
////	}
////
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.userDetailsService(customUserDetailService).passwordEncoder(new BCryptPasswordEncoder());
////	}
//}
