package controller;

import task.Schedule;

public class ClearTaskCommand extends Command {

    ClearTaskCommand(String[] args){
        super(args);
    }
    
    @Override
    public void execute(Schedule schedule) {
        schedule.clearTasksSchedule();
    }
    
}
