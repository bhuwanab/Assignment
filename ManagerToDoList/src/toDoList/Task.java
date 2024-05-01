package toDoList;

import java.util.Date;

public class Task {
	private String taskDescription;
	private boolean statusCompleted;
//	private String status;
	private Date dueDate;
	
   
	
	
	public Task(String taskDescription, Date dueDate) {
		this.taskDescription = taskDescription;		
//		this.status = status;
		this.dueDate = dueDate;
		this.statusCompleted = statusCompleted;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	public boolean isStatusCompleted() {
		return statusCompleted;
	}
	public void setStatusCompleted() {
		statusCompleted = true;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
	
	
	
	
	

}
