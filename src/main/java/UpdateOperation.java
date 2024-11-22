

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateOperation {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
	    cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product user = new Product (6, "bag","tough",800);
		session.update(user);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Recorded Updated Successfully");
//		user u = session.load(user.class, 102);
//		System.out.println(u);
	}

}
