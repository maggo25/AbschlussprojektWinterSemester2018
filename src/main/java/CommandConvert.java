public class CommandConvert implements ICommand {

    //Zustände als Datenfelder speichern
    //WR
    //betrag
    //Variante

    private double erg;
    private WR wr;
    private double betrag;
    private String variante;


    public CommandConvert(WR wr, String variante, double betrag) {
        this.variante = variante;
        this.betrag = betrag;
        this.wr = wr;
    }


    @Override
    public void redo() {
        this.erg = this.wr.umrechnen(this.variante, this.betrag);
    }

    @Override
    public void undo() {
        this.erg = this.betrag;
    }

}
