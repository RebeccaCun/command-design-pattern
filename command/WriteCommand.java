package command;

import java.util.Scanner;

/**
 * A WriteCommand class that is the child of the Command class.
 * @author Cyber Council
 */
public class WriteCommand extends Command {
    private Scanner in;
    
    /**
     * Establishes an instance of the WriteCommand class.
     * @param doc The document that will be written into.
     */
    public WriteCommand(Document doc) {
        super(doc);
        in = new Scanner(System.in);
    }

    /**
     * Executes the write command and creates a string telling the user that the text has been added.
     * @return A string representation of the document being written into.
     */
    public String execute() {
        System.out.print("Enter text: ");
        return document.write(in.nextLine());
    }
}
