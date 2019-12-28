package com.hsbc.embassy;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.hsbc.embassy.utils.UserContextFilter;
@SpringBootApplication
//@EnableEurekaClient
@EnableResourceServer



/**
 * 
 * 
 * request token :
curl --location --request POST 'http://192.168.37.1:8080/auth/oauth/token' \
--header 'Authorization: Basic ZWFnbGVleWU6dGhpc2lzc2VjcmV0' \
--header 'Content-Type: multipart/form-data; boundary=--------------------------776162717660977051409865' \
--form 'grant_type=password' \
--form 'scope=webclient' \
--form 'username=william.woodward' \
--form 'password=password2'


test token:
curl --location --request GET 'http://192.168.37.1:8084/hive/databases' \
--header 'Authorization: Bearer 37cdbc12-f708-4a16-9860-78d9d4b8c337'
 * 
 * @author chenwang2017
 *
 */
public class SpringHiveJdbcTemplateApplication {

  //  @Bean
    public Filter userContextFilter() {
        UserContextFilter userContextFilter = new UserContextFilter();
        return userContextFilter;
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringHiveJdbcTemplateApplication.class, args);
	}
}
