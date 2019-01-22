import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Bildet die Entität für den Logeintrag mit ID, Variante und Betrag;
 */
@Entity
public class LoggerEntry {

    @GeneratedValue
    @Id
    private int id;

    @Column(nullable=false)
    private double betrag;

    @Column(nullable=false)
    private String variante;


    public LoggerEntry() {
    }

    public LoggerEntry(double betrag, String variante) {
        this.betrag = betrag;
        this.variante = variante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }
}
