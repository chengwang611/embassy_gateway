package com.hsbc.embassy.security;



import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception{
        http
        .authorizeRequests()
          .antMatchers("swagger-ui.html#/**").permitAll()
          .antMatchers("/hive/list/**").hasAnyRole("ADMIN")
          .antMatchers("/hive/show/**").hasAnyRole("ADMIN,USER");
         // .antMatchers("/hive/**").authenticated()
         // .anyRequest().authenticated();
    }
}
