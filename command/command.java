package command;

/**
 * Command class telling each child class what to implement
 *  */
public abstract class Command{
    protected Document document;

    public Command(Document document){
        this.document = document;
    }
    
    public abstract String execute();
}
