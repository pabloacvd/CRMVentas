package ar.com.xeven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
	    Empresa e = new Empresa();
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        try(Session session = sf.openSession()){
            //session.save(objeto);
        }
    }
}
