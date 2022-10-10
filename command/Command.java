package command;

/**
 * Command class telling each child class what to implement
 * @author Cyber Council
 */
public abstract class Command{
    protected Document document;

    /**
     * Establishes an instance of the Command class.
     * @param document The document of the Command class.
     */
    public Command(Document document){
        this.document = document;
    }
    
    /**
     * Executes a command dependent on the class.
     * @return A string representation of the executed command.
     */
    public abstract String execute();
}
