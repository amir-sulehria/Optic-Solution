package DbConnection;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate-annotation.cfg.xml
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Entity.TblCoating.class);
            configuration.addAnnotatedClass(Entity.TblCustomer.class);
            configuration.addAnnotatedClass(Entity.TblGlass.class);
            configuration.addAnnotatedClass(Entity.TblLens.class);
            configuration.addAnnotatedClass(Entity.TblManufacturer.class);
            configuration.addAnnotatedClass(Entity.TblProductSupplier.class);
            configuration.addAnnotatedClass(Entity.TblPurchase.class);
            configuration.addAnnotatedClass(Entity.TblSupplier.class);
            configuration.addAnnotatedClass(Entity.TblEmployee.class);
            configuration.addAnnotatedClass(Entity.TblFrames.class);
            configuration.addAnnotatedClass(Entity.TblPhone.class);
            configuration.configure("DbConnection/hibernate.cfg.xml");
            System.out.println("Hibernate Annotation Configuration loaded");

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                    .build();
            System.out.println("Hibernate Annotation serviceRegistry created");

            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            return sessionFactory;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null)
            sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
}