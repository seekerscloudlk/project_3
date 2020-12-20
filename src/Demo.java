import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        //----Save
        //--------------------------------------------------
     /*   Book b1= new Book(1,"Sample Name","Sample Tittle");
        Session session=HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(b1);
        transaction.commit();*/
        //--------------------------------------------------

        //----delete

        /*Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Book b = session.get(Book.class, 1);
        session.delete(b);
        transaction.commit();*/
        //--------------------------------------------------

        //----delete (using HQL [Hibernate Query Language])

        //-Option 1
        /*Session session=HibernateUtil.getSession();
        Query query = session.createQuery("DELETE Book WHERE bookId=1");
        Transaction transaction = session.beginTransaction();
        query.executeUpdate();
        transaction.commit();*/

        //-Option 2
       /* Session session = HibernateUtil.getSession();
        String hql="DELETE Book WHERE bookId=:id";
        Transaction transaction = session.beginTransaction();
        session.createQuery(hql).setParameter("id",1).executeUpdate();
        transaction.commit();*/

        // how to get a record from the database using hql

        /*Session session=HibernateUtil.getSession();
        Query query = session.createQuery("FROM Book WHERE bookId=:id");
        query.setParameter("id",1);
        List list = query.list();
        System.out.println(list);*/

        Session session=HibernateUtil.getSession();
        List from_book = session.createQuery("FROM Book").list();
        System.out.println(from_book);

    }
}
