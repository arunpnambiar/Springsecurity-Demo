package com.dataload.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.core.env.Environment;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.dataload")
@PropertySource("classpath:db.properties")
public class Appconfig {
	@Autowired
	  private Environment env;
	
	@Bean
	public ViewResolver ServeletConfig() {
		InternalResourceViewResolver viewresolver=new InternalResourceViewResolver();
		viewresolver.setPrefix("/WEB-INF/view/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
	}
	
	@Bean
	  public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName(env.getProperty("mysql.driver"));
	    dataSource.setUrl(env.getProperty("mysql.jdbcUrl"));
	    dataSource.setUsername(env.getProperty("mysql.username"));
	    dataSource.setPassword(env.getProperty("mysql.password"));
	    return dataSource;
	  }
	
}
