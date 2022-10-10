package command;
import java.util.HashMap;

/**
 * InputHandler class that handles and executes all the commands.
 * @author Cyber Council
 */
public class InputHandler {
    
    private HashMap<String, Command> commands;
    
    /**
     * The paramterized constructor which initializes the hashmap of commands 
     * and fills it with the different commands available.
     * @param document the Document type which will be passed in the 
     * commands hashmap as parameters.
     */
    public InputHandler(Document document) {
        commands = new HashMap<String, Command>();

        commands.put("save", new SaveCommand(document));
        commands.put("view", new ViewCommand(document));
        commands.put("append", new AppendCommand(document));
        commands.put("write", new WriteCommand(document));
    }
    
    /**
     * Check if the data given is in 'commands' and if it is, 
     * then execute the command.
     * @param data The key which will execute the related command
     */
    public void inputEntered(String data) {

        for (String key : commands.keySet()) {
            
            if (data.equalsIgnoreCase(key)) {
                System.out.println(commands.get(key).execute() + "\n");
                break;
            }
        }
    }

}
