package JiFa.Data.UnitTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import JiFa.Data.Interface.DAOProject;
import JiFa.Data.Interface.DAOTask;
import JiFa.Data.Interface.DataFactory;
import org.junit.Assert;

public class DAOUnitTest {

	DAOProject projDAO = null;
	DAOTask taskDAO = null;
	
	@Before
	public void setUp() throws Exception {
		projDAO = DataFactory.getBCDAOProject();
		taskDAO = DataFactory.getBCDAOTask();
		//clears project.sar
		try {
 	        File file = new File("resources/project.ser");
 	       if(file.exists()){
 	    	  file.delete(); 
 	       }
 	      file.createNewFile();
 	       
 	      } catch (IOException i) {
 	         i.printStackTrace();
 	         return;
 	      }
		//clears task.sar
		try {
 	        File file = new File("resources/task.ser");
 	       if(file.exists()){
 	    	  file.delete(); 
 	       }
 	      file.createNewFile();
 	       
 	      } catch (IOException i) {
 	         i.printStackTrace();
 	         return;
 	      }
	}

	@Test
	public void createProject() {
		String[] proj01 = {"2","20.06.2018","Pedro","Test Description","First Project", "30.06.2018"};
		projDAO.createProject(proj01);
		ArrayList<String[]> projList = projDAO.getProjects();
		Assert.assertEquals(1,projList.size());
	}
	@Test
	public void createTask() {
		String[] tsk01 = {"1","20.06.18","Pedro","Description","Frist Task", "2", "Pedro"};
		taskDAO.createTask(tsk01, 3);
		ArrayList<String[]> tskList = taskDAO.getTasks();
		Assert.assertEquals(1,tskList.size());
	}
	
	@Test
	public void editProject() {
		String[] proj01 = {"2","20.06.2018","Pedro","Test Description","First Project", "30.06.2018"};
		projDAO.createProject(proj01);
		String[] proj02 = {"3","20.06.2018","TEST","TEST","TEST", "30.06.2018"};
		projDAO.createProject(proj02);
		String[] proj03 = {"2","20.06.2018","Pedro","EDITED","First Project", "30.06.2018"};
		projDAO.editProject(proj03, Integer.parseInt(proj03[0]));
		ArrayList<String[]> projList = projDAO.getProjects();
		Assert.assertEquals(2,projList.size());
	}
	
	@Test
	public void editTask() {
		ArrayList<String[]> tskList = null;
		String[] tsk01 = {"1","20.06.18","Pedro","Description","Frist Task", "2", "Pedro"};
		taskDAO.createTask(tsk01, 3);
		String[] tsk02 = {"3","20.06.18","Pedro","Description","Frist Task", "2", "Pedro"};
		taskDAO.createTask(tsk02, 3);
		String[] tsk03 = {"3","20.06.18","EDITED","EDITED","EDITED", "2", "EDITED"};
		taskDAO.editTask(tsk01, Integer.parseInt(tsk03[0]));
		tskList = taskDAO.getTasks();
		Assert.assertEquals(2,tskList.size());
	}
	
	@Test
	public void deleteProject() {
		String[] proj01 = {"2","20.06.2018","Pedro","Test Description","First Project", "30.06.2018"};
		projDAO.createProject(proj01);
		projDAO.deleteProject( Integer.parseInt(proj01[0]));
		ArrayList<String[]> projList = projDAO.getProjects();
		Assert.assertEquals(0,projList.size());
	}
	@Test
	public void deleteTask() {
		String[] tsk01 = {"1","20.06.18","Pedro","Description","Frist Task", "2", "Pedro"};
		taskDAO.createTask(tsk01, 1);
		taskDAO.deleteTask( Integer.parseInt(tsk01[0]));
		ArrayList<String[]> tskList = taskDAO.getTasks();
		Assert.assertEquals(0,tskList.size());
	}
	
	@Test
	public void getNextProjectId() {
		String[] proj01 = {"2","20.06.2018","Pedro","Test Description","First Project", "30.06.2018"};
		projDAO.createProject(proj01);
		String[] proj02 = {"3","20.06.2018","TEST","TEST","TEST", "30.06.2018"};
		projDAO.createProject(proj02);
		Assert.assertEquals(4,projDAO.getHightestUnasginedId());
	}
	
	@Test
	public void getNextTaskId() {
		String[] tsk01 = {"1","20.06.18","Pedro","Description","Frist Task", "2", "Pedro"};
		taskDAO.createTask(tsk01, 3);
		String[] tsk02 = {"2","20.06.18","Pedro","Description","Frist Task", "2", "Pedro"};
		taskDAO.createTask(tsk02, 3);
		Assert.assertEquals(3,taskDAO.getHightestUnasginedId());
	}

}
