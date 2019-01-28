public interface ICommand {

    public void redo();

    public void undo();

    public String execute();
}
