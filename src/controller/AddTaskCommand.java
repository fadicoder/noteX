package controller;

import task.Schedule;

public class AddTaskCommand extends Command{
    public AddTaskCommand(String[] args){

    }

    @Override
    public void execute(Schedule schedule) {
        schedule.add();
    }
}