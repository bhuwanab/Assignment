package toDoList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ToDoListTasksOfManager {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		ToDoList toDoList = new ToDoList();
		Scanner sc = new Scanner(System.in);
		int option, viewTaskType;
		
		while(true) {
			System.out.println("Select options from the following");
			System.out.println("1.Add Task");
			System.out.println("2.Mark the task Completed");
			System.out.println("3.View All tasks");
			System.out.println("4.Delete task");
			System.out.println("5.Exit");
			
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			 case 1:
                 System.out.print("Enter description of task: ");
                 String description = sc.nextLine();
                 System.out.print("Enter due date (yyyy-MM-dd): ");
                 String dueDateString = sc.nextLine();
                 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                 Date dueDate = dateFormat.parse(dueDateString);
                 toDoList.addTask(description, dueDate);
                 break;	
                 
			 case 2: 
				 System.out.println("Enter the description to mark the task as Completed");
				 String des = sc.nextLine();
				 boolean fl = toDoList.VerifyDescription(des);
				 break;
				 
			 case 3:	
				 System.out.println("Select an option to view task");
				 System.out.println("1. view all");
                 System.out.println("2. view completed");
                 System.out.println("3. view pending");
                 
                 viewTaskType = sc.nextInt();
                 sc.nextLine();
                 
                 List<Task> viewTasksBasesOnStatus = new ArrayList<>();
                 
                 switch(viewTaskType) {
	                 case 1:
	                	 viewTasksBasesOnStatus = toDoList.getAllTasks();
	                     break;
	                 case 2:
	                	 viewTasksBasesOnStatus = toDoList.getAllCompletedTasks();
	                     break;
	                 case 3:
	                	 viewTasksBasesOnStatus = toDoList.getAllPendingTasks();
	                     break;
                 }
                 
                 
                 System.out.println("List of tasks:");
                 for (Task task : viewTasksBasesOnStatus) {
                     System.out.println(task.getTaskDescription() + " " + task.getDueDate());
                 }
                 break;
             
			 case 4: 
				 System.out.print("Enter task description to delete the task: ");
                 String deleteDescription = sc.nextLine();
                 toDoList.deleteTask(deleteDescription);
                 break;
             
			 case 5:
                 System.out.println("Exiting program...");
                 System.exit(0);
                 break;
             }
		}
	}

}
