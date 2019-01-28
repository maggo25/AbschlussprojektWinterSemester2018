import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Bildet die Entität für den Logeintrag mit ID, Variante und Betrag;
 */
@Entity
public class LoggerEntry {

    @GeneratedValue
    @Id
    private int id;

    @Column()
    private String logentry;

    @Column
    private LocalDateTime dateTime;


    public LoggerEntry() {
        this.dateTime = LocalDateTime.now();
    }

    public LoggerEntry(String logentry) {
        this.logentry = logentry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogentry() {
        return logentry;
    }

    public void setLogentry(String logentry) {
        this.logentry = logentry;
    }

    public void setDateTime(LocalDateTime dt)
    {

    }

    public LocalDateTime getDateTime()
    {
        return this.dateTime;
    }
}
