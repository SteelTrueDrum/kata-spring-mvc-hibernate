package web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.config.WebConfig;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.Connection;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Starting test class...");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EntityManagerFactory entityManagerFactory = context.getBean("entityManagerFactory", EntityManagerFactory.class);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Creating User...");
        User user = new User("Ivan", "Volkov", "ivanvolkov@mail.ru");
        User user2 = new User("Alexander", "Volkov", "alexvolkov@mail.ru");
        entityManager.getTransaction().begin();

        System.out.println("Saving User...");
        entityManager.persist(user);

        entityManager.getTransaction().commit();

        context.close();


        System.out.println("Test END");
    }
}
