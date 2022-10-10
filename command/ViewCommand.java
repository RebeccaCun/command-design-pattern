package command;
/** 
 * allows user to view Doc
 */
public class ViewCommand extends Command{
    /**
     * brings down existing doc
     * @param doc in use
     */
    public ViewCommand(Document doc){
        super(doc);
    }
    /**
     * @returns String of the doc
     */
    public String execute(){
        return this.document.view();
    }
}
