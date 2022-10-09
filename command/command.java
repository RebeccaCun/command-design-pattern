package command;

public interface Command {
    protected Document document;

    public Command(Document document);
    public String execute();
}
