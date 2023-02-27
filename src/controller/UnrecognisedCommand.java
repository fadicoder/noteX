package controller;

public class UnrecognisedCommand extends Command{
    
    public void execute(Schedule schedule) {
        System.out.println("NOTEX: Unrecognised command");
    }
}
