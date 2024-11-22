

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteOperation2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
	    cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product Product = new Product (5, "skech","good",75);
		session.delete(Product);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Recorded Deleted Successfully");
//		user u = session.load(user.class, 102);
//		System.out.println(u);
	}

}
