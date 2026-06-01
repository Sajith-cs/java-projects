package taskmanager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskManager taskmanager = new TaskManager();
        taskmanager.addtask("Java");
        taskmanager.markTaskDone(0);
        taskmanager.addtask("Werkstudent");
        taskmanager.addtask("Praktikum");
        taskmanager.saveToFile("task.txt");
        TaskManager taskmanager2 = new TaskManager();
        taskmanager2.loadFromFile("task.txt");
        for(Task task : taskmanager2.getTasks()) {
            System.out.println("The task : " + task.getTitle()+" "+task.isCompleted());
        }
    }
}
