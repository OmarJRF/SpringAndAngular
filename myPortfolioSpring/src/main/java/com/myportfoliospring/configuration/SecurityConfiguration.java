/**
 * 
 */
package com.myportfoliospring.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author Omar
 *
 */

@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration{// extends WebSecurityConfigurerAdapter {

	public static final Log LOG = LogFactory.getLog(SecurityConfiguration.class);
/*
	@Autowired
	@Qualifier("userService")
	private UserDetailsService userService;

	@Autowired
	private void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		//auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());

		auth.inMemoryAuthentication().withUser("user").password("123").roles("USER");

	}

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		LOG.info("METHOD:'configure': ");

		http.authorizeRequests().antMatchers("/css/**", "/imgs/**").permitAll().anyRequest().authenticated().and()
				.formLogin().loginPage("/myportfoliospring").defaultSuccessUrl("/myportfoliospring/principal")
				.failureUrl("/myportfoliospring?error").permitAll().and().logout()
				.logoutUrl("/myportfoliospring/logout").logoutSuccessUrl("/myportfoliospring?logout").permitAll();

	}*/

}
