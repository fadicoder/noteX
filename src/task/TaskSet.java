package task;

import java.util.ArrayList;

public class TaskSet{

    private ArrayList<Task> tasks;
    private TaskPeriod period;
    private Task templateTask;

    protected TaskSet(Task templateTask, TaskPeriod period){
        this.period = period;
        this.templateTask = templateTask;
        this.tasks = new ArrayList<Task>();
        period.fillTasksSet(tasks, templateTask);
    }

    protected void setPeriod(TaskPeriod period){
        this.period = period;
        period.fillTasksSet(tasks, templateTask);
    }

    protected void setName(String name){
        templateTask.setName(name);
        for (Task task: tasks){
            task.setName(name);
        }
    }

    protected ArrayList<Task> getTasks(){
        return tasks;
    }
}