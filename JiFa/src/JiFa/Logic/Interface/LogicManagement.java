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
	//DAOProjectMockup.editProject(project, Integer.parseInt(project[0]));
	DataFactory.getBCDAOProject().editProject(project, Integer.parseInt(project[0]));
}
public void deleteProject(int projectId){
	//DAOProjectMockup.deleteProject(projectId);
	DataFactory.getBCDAOProject().deleteProject(projectId);
}
public void editTask(String[] task){
	//DAOTaskMockup.editTask(task, Integer.parseInt(task[0]));
	DataFactory.getBCDAOTask().editTask(task, Integer.parseInt(task[0]));
}
public void deleteTask(int taskId){
	//DAOTaskMockup.deleteTask(taskId);
	DataFactory.getBCDAOTask().deleteTask(taskId);
}
public Project getProject(int projectId){
	//String[] stgProj = DAOProjectMockup.getProject(projectId);
	String[] stgProj = DataFactory.getBCDAOProject().getProject(projectId);
	BCProject proj = new BCProject();
	proj.setId(Integer.parseInt(stgProj[0]));
	//Date is missing
	proj.setDate(stgProj[1]);
	proj.setCreator(stgProj[2]);
	proj.setDescription(stgProj[3]);
	proj.setName(stgProj[4]);
	//Deadline (uses Date) is Missing
	proj.setDeadline(stgProj[5]);
	return proj;
}
public Task getTask(int taskId){
	//String[] stgTsk = DAOTaskMockup.getTask(taskId);
	String[] stgTsk = DataFactory.getBCDAOTask().getTask(taskId);
	BCTask tsk = new BCTask();
	tsk.setId(Integer.parseInt(stgTsk[0]));
	tsk.setDate(stgTsk[1]);
	tsk.setCreator(stgTsk[2]);
	tsk.setDescription(stgTsk[3]);
	tsk.setName(stgTsk[4]);
	tsk.setImportance(Integer.parseInt(stgTsk[5]));
	tsk.setAsignee(stgTsk[6]);
	return tsk;
}
public void  createProject(String[] project){
	//int currentId = DAOProjectMockup.getHightestUnasginedId();
	int currentId = DataFactory.getBCDAOProject().getHightestUnasginedId();
	project[0] = Integer.toString(currentId);
	DataFactory.getBCDAOProject().createProject(project);
}
public void createTask(String[] task, int projectId){
	//int currentId = DAOTaskMockup.getHightestUnasginedId();
	int currentId = DataFactory.getBCDAOTask().getHightestUnasginedId();
	task[0] = Integer.toString(currentId);
	DataFactory.getBCDAOTask().createTask(task, projectId);
}
public ArrayList<Project> getProject(){
	ArrayList<Project> projList = new ArrayList<Project>();
	//for(String[] stg : DAOProjectMockup.getProjects()){
	for(String[] stg : DataFactory.getBCDAOProject().getProjects()){
		projList.add(getProject(Integer.parseInt(stg[0])));
	}
	return projList;
}
public ArrayList<Task> getTask(){
	ArrayList<Task> tskList = new ArrayList<Task>();
	//for(String[] stg : DAOProjectMockup.getProjects()){^
	for(String[] stg : DataFactory.getBCDAOTask().getTasks()){
		tskList.add(getTask(Integer.parseInt(stg[0])));
	}
	return tskList;
}
}
