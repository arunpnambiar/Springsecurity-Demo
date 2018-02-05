package com.dataload.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class ConfigureSecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource datasource;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*UserBuilder users = User.withDefaultPasswordEncoder();*/
		auth.jdbcAuthentication()
		.dataSource(datasource)
		.usersByUsernameQuery("select username, password, enabled from users where username=?")
		.authoritiesByUsernameQuery("select username, authority from authorities where username=?")
		.passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	  
		http.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/userPage").hasAnyAuthority("ADMIN","USER")
				.antMatchers("/qaPage").hasAnyAuthority("ADMIN","QA")
				.antMatchers("/adminPage").hasAnyAuthority("ADMIN","SUPERADMIN")
			.and()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/authUser")
				.permitAll()
				.and()
				.logout()
				.permitAll().and().exceptionHandling().accessDeniedPage("/accessdenied");
		
	}
	
}
