package controller;
import task.Schedule;

public class UnrecognisedCommand extends Command{
    
    UnrecognisedCommand(String[] args){
        super(args);
    }

    @Override
    public void execute(Schedule schedule) {
        System.out.println("NOTEX: Unrecognised command");
    }
}
