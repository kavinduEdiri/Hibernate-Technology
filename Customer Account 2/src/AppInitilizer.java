import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.boot.MetadataSources;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;
import javax.transaction.Transaction;

public class AppInitilizer {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
         // save
        transaction.commit();
    }
}
