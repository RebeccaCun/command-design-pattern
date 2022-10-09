package command;

/**
 * A SaveCommand class that is the child of the Command class.
 * @author Cyber Council
 */
public class SaveCommand extends Command {

    /**
     * Establishes an instance of the SaveCommand class.
     * @param doc The document that will be saved.
     */
    public SaveCommand(Document doc) {
        super(doc);
    }

    /**
     * Executes the save command and creates a string telling the user that the document has been saved.
     * @return A string representation of the document being saved.
     */
    public String execute() {
        return this.document.save();
    }
}
