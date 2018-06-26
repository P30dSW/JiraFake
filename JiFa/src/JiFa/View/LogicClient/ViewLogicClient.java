/**
 * LogicClient für den Viewschicht
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.View.LogicClient;

import java.util.ArrayList;

import JiFa.Logic.Interface.LogicFactory;
import JiFa.Logic.Interface.LogicManagement;
import JiFa.Logic.Interface.Project;
import JiFa.Logic.Interface.Task;

public class ViewLogicClient {	
	private LogicManagement logic;
	
	public ViewLogicClient() {
		logic = LogicFactory.getLogicInstance();
	}
	
	public void createProject(String[] project){
		
	}
	public void editProject(String[] project){
		
	}
	public void deleteProject(int projectId){
		
	}
	public void createTask(String[] task,int projectId){
		
	}
	public void editTask(String[] task){
		
	}
	public void deleteTask(int taskId){
		
	}
	public Project getProject(int projectId){
		return null;
	}
	public Task getTask(int taskId){
		return null;
	}
	public ArrayList<Project> getProject(){
		return null;
	}
	public ArrayList<Task> getTask(){
		return null;
	}

}
