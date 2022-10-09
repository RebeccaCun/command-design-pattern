package command;

import java.util.ArrayList;

/** @author Luca Ossendorf
 * 
 * implements methods to view/modify the Document 
 */
public class Document {
    private String fileName;
    private ArrayList<String> lines;

    /**
     * creates a new instance of the Document class and saves the
     * content of the specified file in the lines variable
     * @param fileName the name/path to the file
     */
    public Document(String fileName){
        this.fileName = fileName;
        this.lines = FileManipulator.readFile(this.fileName);
    }

    /**
     * creates a String containing the current lines of the Document
     * (might be containing unsaved changes)
     * @return the formatted String
     */
    public String view(){
        String output = addBorder() + "\n";
        for(String line : lines){
            output += "\n|     " + line + "     |";
        }
        output += "\n" + addBorder() + "\n";
        return output;
    }

    /**
     * appends a line to the Document lines
     * @param line the String that should be appended
     * @return a statement confirming that the line has been appended
     */
    public String append(String line){
        lines.add(line);
        return "The line has been appended to the document.";
    }

    /**
     * overwrites the current lines of the Document with the specified String
     * @param line the String to write to the Document
     * @return a statement confirming that the line has been written
     */
    public String write(String line){
        ArrayList<String> newLines = new ArrayList<String>();
        newLines.add(line);
        lines = newLines;
        return "The line was written to the file.";
    }

    /**
     * saves all changes to the file
     * @return a statement confirming that the file has been saved
     */
    public String save(){
        if(!FileManipulator.writeFile(fileName, lines)){
            return "Sorry, we cannot save at this time.";
        }
        return "The file has been saved.";
    }

    /**
     * a helper method for formatting the String in view()
     * that calculates the length and returns the borders above and below
     * the lines of the file
     * @return the border
     */
    private String addBorder(){
        if(lines.size() == 0){
            return "__________";
        }
        int longestLineLength = lines.get(0).length();
        for(String line : lines){
            if(line.length() > longestLineLength){
                longestLineLength = line.length();
            }
        }
        String border = new String();
        for(int i = 0; i <= longestLineLength + 10; i++){
            border += "_";
        }
        return border;
    }

}
