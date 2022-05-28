package com.example.demo.Config;


import com.example.demo.Controllers.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws
            Exception {
        http.csrf().disable().cors().disable()
                .authorizeRequests().antMatchers("/login",
                        "/logout", "/register").permitAll()
                .anyRequest().authenticated()
                .and().formLogin()
                .and().userDetailsService(UserController.userDetailsService());
    }

    @Bean
    public PasswordEncoder encoder() {return new BCryptPasswordEncoder();}

}

