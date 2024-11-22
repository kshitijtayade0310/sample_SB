import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.jvnet.staxex.util.XMLStreamReaderToXMLStreamWriter;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration ();
		cfg.configure();
	cfg.addAnnotatedClass(Employee.class);
	SessionFactory factory= cfg.buildSessionFactory();
	Session session = factory.openSession();
	@SuppressWarnings("deprection")
	Criteria c= session.createCriteria(Employee.class);
	
//	c.add(Restrictions.between("salary", 3000, 7000));
//	c.add(Restrictions.like("empname", "p%"));
//	c.add(Restrictions.in("deptno",Arrays.asList (20,30,40)));
//	c.add(Restrictions.eq("deptno", 30));
//	c.add(Restrictions.gt("salary", 45000));
	c.add(Restrictions.ne("salary", 50000));
//	c.add(Restrictions.isEmpty("salary"));
	
	
	
	
	List<Employee>emplist = c.list();	
	for(Employee e:emplist)
	{
		System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSalary()+" "+e.getDeptno());
	}
	
	}}


