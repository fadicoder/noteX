package controller;

import java.util.Arrays;

public class CommandCreator {
    
    public static Command createCommand (String[] args){
        String commandStr = args[0];
        args = Arrays.copyOfRange(args, 1, args.length - 1);
        Command command;
        switch(commandStr){
            case "add" -> command = new AddTaskCommand(args);
            case "clear" -> command = new ClearTaskCommand(args);
            case "print" -> command = new PrintScheduleCommand(args);
            case "exit" -> command = new ExitCommand(args);
            default -> command = new UnrecognisedCommand(args);
        }
        return command;
    }
}
