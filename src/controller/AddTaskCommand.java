package controller;

import task.Schedule;
import task.Task;

public class AddTaskCommand extends Command{
    public AddTaskCommand(String[] args){
        super(args);
    }

    @Override
    public void execute(Schedule schedule) {
        
        if(arguments.size() == 0){
            System.out.println("Please enter a name and date for the task");
            return;
        }

        String name = arguments.get(0);

        if(arguments.size() < 4){
            System.out.println("Please enter a date for the task");
            return;
        }
        else (arguments.size() >= 4){

            try{
                int year = Integer.parseInt(arguments[1]);
                int month = Integer.parseInt(arguments[2]);
                int day = Integer.parseInt(arguments[3]);
                int hour = Integer.parseInt(arguments[4]);
                int minute = Integer.parseInt(arguments[5]);
            }
            catch NumberFormatException e{
                System.out.println("Unvalid numbers");
                return;
            }
            if(arguments.size() == 4){
                schedule.add(new Task(name, year, month, day, hour, minute));
                return;
            }
        }

        if(arguments.size() < 7){
            System.out.println("Please enter years, months, weeks and days period");
            return;
        }

        else if(arguments.size() == 7){

            try{
                int years = Integer.parseInt(arguments[6]);
                int months = Integer.parseInt(arguments[7]);
                int weeks = Integer.parseInt(arguments[8]);
                int days = Integer.parseInt(arguments[9]);

                schedule.add(new Task(name, year, month, day, hour, minute, years, months, weeks, days));
            } catch NumberFormatException e{
                System.out.println("Unvalid numbers");
                return;
            }
        }

        else{
            System.out.println("too many arguments for command \"add\"");
            return;
        }
    }
}