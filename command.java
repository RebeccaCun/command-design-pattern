//package command;

public interface command {
    protected Document document;

    public Command(Document document){
        this.document = document;
    }
    public static String execute(){
        return " ";
    }

}