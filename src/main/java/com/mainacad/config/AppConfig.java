package com.mainacad.config;

import com.mainacad.dao.ItemDAO;
import com.mainacad.dao.UserDAO;
import com.mainacad.factory.ConnectionFactory;
import com.mainacad.factory.H2Factory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ConnectionFactory getConnectionFactory() {
        return new H2Factory();
    }

    @Bean
    public UserDAO getUserDAO() {
        return new UserDAO();
    }

    @Bean
    public ItemDAO getItemDAO() {
        return new ItemDAO();
    }
}
