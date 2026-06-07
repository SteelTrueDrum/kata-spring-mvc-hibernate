package web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.config.WebConfig;
import web.model.User;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.Connection;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Starting test class...");

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        try (EntityManagerFactory entityManagerFactory = new
//             ; SessionFactory factory = new Configuration()
//                .configure()
//                .addAnnotatedClass(User.class)
//                .buildSessionFactory()) {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            session.getTransaction().commit();
//        }

//        SessionFactory factory = context.getBean("sessionFactory", SessionFactory.class);
//        Session session = factory.getCurrentSession();
//
//        session.beginTransaction();
//        session.save(user);
//
//
//        session.getTransaction().commit();
//
//        context.close();

        System.out.println("Creating User...");
        User user = new User("Ivan", "Volkov", "ivanvolkov@mail.ru");
        User user2 = new User("Alexander", "Volkov", "alexvolkov@mail.ru");

        System.out.println("Test END");
    }
}
