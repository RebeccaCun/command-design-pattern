package command;

import java.util.Scanner;
/**
 * appends doc to add new sentences
 * @author Cyber Council
 */
public class AppendCommand extends Command{
    private Scanner in;
    /**
     * brings the doc down
     * @param doc that is being edited
     */
    public AppendCommand(Document doc){
        super(doc);
        in = new Scanner(System.in);
    }
    /**
     * @return String of whats being added
     */
    public String execute() {
        System.out.print("Enter Text: ");
        return document.append(in.nextLine());
    }
}
