package seedu.addressbook.functions;

import java.util.ArrayList;
//Create a sorting class
public abstract class Sorting{
	//when the command sort is typed in
	public static final String COMMAND_WORD = "sort";
	public static final ArrayList<String> TASK = new ArrayList<String>();
	public Sorting(){
	}
	public Sorting(String COMMAND){
		COMMAND = COMMAND_WORD;
	}
	//call subclass to sort the task
	TaskList newTask = new TaskList(TASK);
}
//sub class sort the task by their order
class TaskList{
	//input the task list
	ArrayList<String> tasks = new ArrayList<String>();
	public TaskList(){
	}
	public TaskList(ArrayList<String> task){
		task = tasks;
	}
	//output the task in order
	public void ArrangeList(ArrayList<String> task){
		System.out.println(task);
	}
	public void settask(ArrayList<String> task){
		task = tasks;
	}
	public ArrayList<String> gettask(ArrayList<String> task){
		return tasks;
	}
}