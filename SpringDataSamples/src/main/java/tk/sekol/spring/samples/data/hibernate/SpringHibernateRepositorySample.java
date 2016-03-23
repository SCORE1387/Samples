package tk.sekol.spring.samples.data.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kolesnikov
 */
@Repository
@Transactional
public class SpringHibernateRepositorySample {

    public Person getPersonById(int id) {
        return (Person) currentSession().get(Person.class, id);
    }

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addPerson(Person person) {
        currentSession().save(person);
    }
}
