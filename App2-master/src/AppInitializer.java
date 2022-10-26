import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppInitializer {
    public static void main(String[] args) {
        CustomerName name1= new CustomerName("Nimal","Bandara");
        Customer c1= new Customer(3,name1,"Colombo",2000);

        Account account1= new Account(1,"Checking");
        Account account2= new Account(2,"Saving");
        account2.setCustomer(c1);

        Configuration configuration=
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Customer.class)
                        .addAnnotatedClass(Account.class)
                        .addAnnotatedClass(Order.class)
                        .addAnnotatedClass(Item.class)
                        .addAnnotatedClass(OrderDetail.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //session.save(c1);
        //session.save(account1);
        //session.save(account2);
        transaction.commit();
    }
}
