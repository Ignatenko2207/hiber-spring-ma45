package com.mainacad;

import com.mainacad.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.mainacad");
//        context.getEnvironment().setActiveProfiles("prod");
        UserDAO userDAO = context.getBean(UserDAO.class);

        System.out.println(userDAO.toString());
    }
}
