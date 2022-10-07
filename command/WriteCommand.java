package command;

import java.util.Scanner;

public class WriteCommand extends Command {
    private in Scanner;
    
    public WriteCommand(Document doc) {

    }

    public String execute() {
        System.out.println("Enter text: ");
        String line = in.nextLine();

    }
}
