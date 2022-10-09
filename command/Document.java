package command;

import java.util.ArrayList;

public class Document {
    private String fileName;
    private ArrayList<String> lines;

    public Document(String fileName){
        this.fileName = fileName;
        this.lines = FileManipulator.readFile(this.fileName);
    }

    public String view(){
        String output = addBorder() + "\n";
        for(String line : lines){
            output += "\n|     " + line + "     |";
        }
        output += "\n" + addBorder() + "\n";
        return output;
    }

    public String append(String line){
        lines.add(line);
        return "The line has been appended to the document.";
    }

    public String write(String line){
        ArrayList<String> newLines = new ArrayList<String>();
        newLines.add(line);
        lines = newLines;
        return "The line was written to the file.";
    }

    public String save(){
        if(!FileManipulator.writeFile(fileName, lines)){
            return "Sorry, we cannot save at this time.";
        }
        return "The file has been saved.";
    }

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
        for(int i = 0; i <= longestLineLength + 12; i++){
            border += "_";
        }
        return border;
    }

}
