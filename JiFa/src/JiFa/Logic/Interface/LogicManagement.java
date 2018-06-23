package JiFa.Logic.Interface;

import JiFa.Data.Interface.*;
import JiFa.Logic.Management.*;
import java.util.*;
public class LogicManagement {
private DAOTask DAOTaskMockup;
private DAOProject DAOProjectMockup;


public LogicManagement(){
	DAOProjectMockup = DataFactory.getDAOProjectMockUp();
	DAOTaskMockup = DataFactory.getDAOTaskMockUp();
}
public void editProject(String[] project){
	DAOProjectMockup.editProject(project, Integer.parseInt(project[0]));
}
public void deleteProject(int projectId){
	DAOProjectMockup.deleteProject(projectId);
}
public void editTask(String[] task){
	DAOTaskMockup.editTask(task, Integer.parseInt(task[0]));
}
public void deleteTask(int taskId){
	DAOTaskMockup.deleteTask(taskId);
}
public Project getProject(int projectId){
	String[] stgProj = DAOProjectMockup.getProject(projectId);
	BCProject proj = new BCProject();
	proj.setId(Integer.parseInt(stgProj[0]));
	Date dt = new Date();
	//Date is missing
	proj.setCreator(stgProj[2]);
	proj.setDescription(stgProj[3]);
	proj.setName(stgProj[4]);
	//Deadline (uses Date) is Missing
	return proj;
}
public Task getTask(int taskId){
	String[] stgTsk = DAOTaskMockup.getTask(taskId);
	BCTask tsk = new BCTask();
	tsk.setId(Integer.parseInt(stgTsk[0]));
	
	tsk.setCreator(stgTsk[2]);
	tsk.setDescription(stgTsk[3]);
	tsk.setName(stgTsk[4]);
	tsk.setImportance(Integer.parseInt(stgTsk[5]));
	tsk.setAsignee(stgTsk[6]);
	return tsk;
}
public void  createProject(String[] project){
	int currentId = DAOProjectMockup.getHightestUnasginedId();
	project[0] = Integer.toString(currentId);
	DAOProjectMockup.createProject(project);
}
public void createTask(String[] task, int projectId){
	int currentId = DAOTaskMockup.getHightestUnasginedId();
	task[0] = Integer.toString(currentId);
	DAOTaskMockup.createTask(task, projectId);
}
public ArrayList<Project> getProject(){
	ArrayList<Project> projList = new ArrayList<Project>();
	for(String[] stg : DAOProjectMockup.getProjects()){
		projList.add(getProject(Integer.parseInt(stg[0])));
	}
	return projList;
}
public ArrayList<Task> getTask(){
	ArrayList<Task> tskList = new ArrayList<Task>();
	for(String[] stg : DAOProjectMockup.getProjects()){
		tskList.add(getTask(Integer.parseInt(stg[0])));
	}
	return tskList;
}
}
