package controller;

import java.util.ArrayList;

import task.Schedule;

public abstract class Command{
    
    protected ArrayList<String> arguments;
    protected boolean exitCommand;

    public Command(String args[], boolean exitCommand){
        arguments = new ArrayList<>();
        for (String arg : args){
            if(arg != ""){
                arguments.add(arg);
            }
        }
        this.exitCommand = exitCommand;
    }
    public Command(String args[]){
        this(args, false);
    }

    abstract public void execute(Schedule schedule);

    public boolean isExitCommand(){
        return exitCommand;
    }
}
