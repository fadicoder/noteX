package controller;

import task.Schedule;

public class ExitCommand extends Command{

    public ExitCommand(String[] args){
        super(args, true);
    }

    @Override
    public void execute(Schedule schedule) {
        System.out.println("Saving changes to the schedule...");
        schedule.save();
        System.out.println("Exiting...");
        
    }
}
