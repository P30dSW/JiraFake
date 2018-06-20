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
}
