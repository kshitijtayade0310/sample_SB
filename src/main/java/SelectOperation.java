

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectOperation {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
	    cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product u = session.load(Product.class, 4);
		System.out.println(u);
	}

}
