package com.mainacad.config;

import com.mainacad.dao.ItemDAO;
import com.mainacad.dao.UserDAO;
import com.mainacad.factory.ConnectionFactory;
import com.mainacad.factory.H2Factory;
import com.mainacad.factory.PostgresFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.mainacad")
public class AppConfig {

    @Bean
    @Qualifier(value = "h2")
    @Profile("test")
    public ConnectionFactory getH2Factory() {
        return new H2Factory();
    }

    @Bean
    @Qualifier(value = "pstgres")
    @Profile("prod")
    public ConnectionFactory getPostgresFactory() {
        return new PostgresFactory();
    }

    @Bean
    public UserDAO getUserDAO() {
        return new UserDAO();
    }

//    @Bean
//    public ItemDAO getItemDAO() {
//        return new ItemDAO();
//    }
}
