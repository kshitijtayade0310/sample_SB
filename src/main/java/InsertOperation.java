

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertOperation {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
	    cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product user = new Product (5, "sketch","good",75);
		session.save(user);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Recorded Inserted Successfully");
//		user u = session.load(user.class, 102);
//		System.out.println(u);
	}

}
