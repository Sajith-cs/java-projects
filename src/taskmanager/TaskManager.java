package taskmanager;

import java.io.*;
import java.util.ArrayList;

public class TaskManager {
 private ArrayList<Task> tasks;
 public TaskManager() {
     tasks = new ArrayList<>();
 }
 public void addtask(String title){
     tasks.add(new Task(title));
 }
 public ArrayList<Task> getTasks(){
     return tasks;
 }
 public void markTaskDone(int index){
     if(index >tasks.size()-1||index<0){
         throw new IndexOutOfBoundsException("Invalid task number");
     }
     tasks.get(index).markDone();
 }
 public void saveToFile(String filename) throws IOException {
     BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
     for(Task task:tasks){
         writer.write(task.getTitle()+","+task.isCompleted());
         writer.newLine();
     }
     writer.close();
 }
 public void loadFromFile(String filename) throws IOException {
     BufferedReader reader=new BufferedReader(new FileReader(filename));
     String line;
     while((line=reader.readLine())!=null){
         String[] parts=line.split(",");
         String title=parts[0];
         Task t=new Task(title);
         boolean completed=Boolean.parseBoolean(parts[1]);
         if(completed){
         t.markDone();
         }
         tasks.add(t);
     }
     reader.close();
 }
}