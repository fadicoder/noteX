package controller;

public class CommandCreator {
    
    public static Command createCommand (String[] args){
        switch(args[0]){
            case "add" -> return new AddTaskCommand(args);
            case "clear" -> return new ClearTaskCommand(args);
            case "print" -> return new PrintScheduleCommand(args);
            default -> return new UnrecognisedCommand(args);
        }
    }
}
