package DbConnection;

import Entity.TblPhone;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhoneDB {
    public static boolean addPhoneNumber(TblPhone phone){
        int phId=0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            //phone = new TblPhone(1,1, 033333333,"EMPLOYEE");//for testing purposes remove after
            phId = (Integer) session.save(phone);
            tx.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(tx != null) {
                tx.rollback();
            }
        }finally {
            session.close();
        }
        return phId>0;
    }
    public static int getPhoneNumber(int uId){
        int phId=-1;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            //phId = (Integer) session.save(phone);
            tx.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(tx != null) {
                tx.rollback();
            }
        }finally {
            session.close();
        }
        return phId;
    }
}
