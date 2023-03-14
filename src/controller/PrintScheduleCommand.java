package controller;

import task.Schedule;

public class PrintScheduleCommand extends Command{
    
    public PrintScheduleCommand(String[] args){
        super(args);
    }

    @Override
    public void execute(Schedule schedule) {
        System.out.println(schedule);
    }
}