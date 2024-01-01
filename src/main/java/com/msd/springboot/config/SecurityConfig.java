package com.msd.springboot.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsManager config(DataSource dataSource) {
		UserDetailsManager usd = new JdbcUserDetailsManager(dataSource);
		return usd;
		
	}
	
	/*
	 * @Bean public InMemoryUserDetailsManager configUsd() {UserDetails user1 =
	 * User.builder().username("shiva").password("{noop}1234").roles("ADMIN").build(
	 * ); UserDetails user2 =
	 * User.builder().username("vinod").password("{bcrypt}1234").roles("MANAGER",
	 * "EMPLOYEE").build(); UserDetails user3 =
	 * User.builder().username("Anand").password("{noop}1234").roles("EMPLOYEE").
	 * build(); InMemoryUserDetailsManager inMemoryUserDetailsManager = new
	 * InMemoryUserDetailsManager(user1,user2,user3); return
	 * inMemoryUserDetailsManager; }
	 */
	 }
