package command;

import java.util.Scanner;
/**
 * appends doc to add new sentences
 */
public class AppendCommand extends Command{
    private Scanner in;
    /**
     * brings the doc down
     * @param doc that is being edited
     */
    public AppendCommand(Document doc){
        super(doc);
    }
    /**
     * @return String of whats being added
     */
    public String execute() {
        System.out.println("Enter Text");
        String line = in.nextLine();
        document.append(line);
        return line;
    }
}
