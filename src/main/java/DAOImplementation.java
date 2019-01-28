import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class DAOImplementation implements DAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public DAOImplementation()

    {
        emf = Persistence.createEntityManagerFactory("abschlussProjekt");
        em = emf.createEntityManager();
    }



    public LoggerEntry getLogEntry(int id)
    {
        LoggerEntry loggerEntry = em.find(LoggerEntry.class, id);
        return loggerEntry;
    }

    public List<LoggerEntry> getAllLogEvents()
    {
        Query query = em.createQuery("Select l from LoggerEntry l");
        List<LoggerEntry> list = query.getResultList();
        return list;
    }

    public void createLogEntry(LoggerEntry loggerEntry)
    {
        em.getTransaction().begin();
        em.persist(loggerEntry);
        em.getTransaction().commit();
    }

    public void updateLogEntry(LoggerEntry loggerEntry)
    {
        em.getTransaction().begin();
        em.persist(loggerEntry);
        em.getTransaction().commit();
    }

    public void deleteLogEntry(int id)
    {
        em.getTransaction().begin();
        LoggerEntry temp = em.find(LoggerEntry.class, id);
        em.remove(temp);
        em.getTransaction().commit();

    }
}
