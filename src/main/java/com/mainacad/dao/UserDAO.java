package com.mainacad.dao;

import com.mainacad.factory.ConnectionFactory;
import com.mainacad.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAO extends BaseDAO<User>{

    @Autowired
    ConnectionFactory connectionFactory;

    public List<User> findAll(){
        Session session = connectionFactory.getSessionFactory().openSession();
        session.getTransaction().begin();

        String sql = "SELECT * FROM users";
        List<User> result = session.createNativeQuery(sql).getResultList();

        session.close();
        return result;
    }
}
