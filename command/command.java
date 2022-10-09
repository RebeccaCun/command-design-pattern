package command;

/**
 * Command class telling each child class what to implement
 *  */
public abstract Command{
    protected Document document;

    public Command(Document document);
    public String execute();
}
