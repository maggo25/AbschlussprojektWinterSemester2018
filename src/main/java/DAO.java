import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {

    EntityManagerFactory emf;
    EntityManager em;

    public DAO()

    {

        emf = Persistence.createEntityManagerFactory("abschlussProjekt");
        em = emf.createEntityManager();
    }

    public void save(LoggerEntry le){
        em.getTransaction().begin();
        em.persist(le);
        em.getTransaction().commit();

    }



}
