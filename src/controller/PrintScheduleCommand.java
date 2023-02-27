package controller;

public class PrintScheduleCommand extends Command{
    public PrintScheduleCommand(String args){

    }

    public void execute(Schedule schedule) {
        System.out.println(schedule);
    }
