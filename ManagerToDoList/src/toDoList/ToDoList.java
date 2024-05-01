package toDoList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDoList {
	
	private List<Task> tasks = new ArrayList<>();
	
	//GET ALL TASKS
	public  List<Task> getAllTasks(){
		return tasks;
	}
		
	//SAVE TASK
	public void addTask(String description, Date dueDate) {
		Task task = new Task(description, dueDate);
		tasks.add(task);
	}
	
	//GET ALL COMPLETED TASKS
	public List<Task> getAllCompletedTasks(){
		List<Task> completedTasks = new ArrayList<>();
		for(Task t : tasks) {
			if(t.isStatusCompleted())
				completedTasks.add(t);
		}
		
		return completedTasks;
	}
	
	//GET PENDING TASKS
	public List<Task> getAllPendingTasks(){
		List<Task> pendingTasks = new ArrayList<>();
		for(Task t : tasks) {
			if(!t.isStatusCompleted())
				pendingTasks.add(t);
		}
		
		return pendingTasks;
	}
	
	//SET TASK AS COMPLETD	
	public void setTaskAsCompleted(String description) {
		for(Task t: tasks) {
			if(t.getTaskDescription().equals(description)) {
				t.setStatusCompleted();
			    break;
			}
		}
	}
	
	//DELETE TASK
	
	public void deleteTask(String description) {
//		for(Task t: tasks) {
//			if(t.getTaskDescription().equals(description)) {
//				tasks.remove(t);
//			}
//		}
		tasks.removeIf(task -> task.getTaskDescription().equals(description));
	}
	
	
	public boolean VerifyDescription(String desc) {
		for(Task t: tasks) {
			if(t.getTaskDescription().equals(desc)) {
				return true;
			}
			
		}
		return false;
	}

}



















