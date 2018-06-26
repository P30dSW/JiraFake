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
		logic.createProject(project);
	}
	public void editProject(String[] project){
		logic.editProject(project);
	}
	public void deleteProject(int projectId){
		logic.deleteProject(projectId);
	}
	public void createTask(String[] task,int projectId){
		logic.createTask(task, projectId);
	}
	public void editTask(String[] task){
		logic.editTask(task);
	}
	public void deleteTask(int taskId){
		logic.deleteTask(taskId);
	}
	public Project getProject(int projectId){
		return logic.getProject(projectId);
	}
	public Task getTask(int taskId){
		return logic.getTask(taskId);
	}
	public ArrayList<Project> getProject(){
		return logic.getProject();
	}
	public ArrayList<Task> getTask(){
		return logic.getTask();
	}

}
