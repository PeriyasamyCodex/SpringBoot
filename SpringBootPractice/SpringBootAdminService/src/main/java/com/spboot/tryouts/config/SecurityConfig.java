/**
 * 
 */
package com.spboot.tryouts.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author 717684
 *
 */
@EnableWebSecurity
public class SecurityConfig{

		
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("joan").password("{noop}joan@123").roles("employee","admin")
		.and()
		.withUser("hermoine").password("{noop}herm@magic").roles("customer");
		
	}
	
	
	@Configuration   
	@Order(1)
	public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
		protected void configure(HttpSecurity http) throws Exception {
					
			http.csrf().disable()
			.antMatcher("/api/**").authorizeRequests()
				.anyRequest().hasAnyRole("employee","customer")
				.and()
			.httpBasic();
		}
	}
	
	@Configuration  
	public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			
			
			http.csrf().disable()
				.authorizeRequests().antMatchers("/css/**", "/js/**").permitAll()
			.and()
				.authorizeRequests().antMatchers("/prud/**")
				.hasAnyRole("admin","employee","customer")
			.and()
				.authorizeRequests().antMatchers("/admin/**")
				.hasRole("admin")
				.anyRequest().authenticated()
			.and()
				.formLogin().loginPage("/login").permitAll()				
			.and()
				.logout().permitAll();
			
			http.headers().frameOptions().sameOrigin();
		}
	}
}
