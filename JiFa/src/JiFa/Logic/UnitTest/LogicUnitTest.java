package JiFa.Logic.UnitTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import JiFa.Logic.Interface.LogicFactory;
import JiFa.Logic.Interface.LogicManagement;
import JiFa.Logic.Interface.Project;
import JiFa.Logic.Interface.Task;

public class LogicUnitTest {
	LogicManagement lg ;
	@Before
	public void setUp() throws Exception {
		lg = LogicFactory.getLogicInstance();
		
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
		String[] stgProj = new String[6];
		stgProj[0] = "";
		stgProj[1] = "23.06.18";
		stgProj[2] = "Max Mustermann";
		stgProj[3] = "Test Project";
		stgProj[4] = "Test Project";
		stgProj[5] = "30.06.18";
		lg.createProject(stgProj);
		Project pg = lg.getProject(0);
		Assert.assertEquals(pg.getName(),stgProj[4]);
	}
	
	@Test
	public void createProjectAndTask() {
		//Project
		String[] stgProj = new String[6];
		stgProj[0] = "";
		stgProj[1] = "23.06.18";
		stgProj[2] = "Max Mustermann";
		stgProj[3] = "Test Project";
		stgProj[4] = "Test Project";
		stgProj[5] = "30.06.18";
		lg.createProject(stgProj);
		Project pg = lg.getProject(0);
		//Task
		String[] stgTsk = new String[7];
		stgTsk[0] = "";
		stgTsk[1] = "23.06.2018";
		stgTsk[2] = "Pedro";
		stgTsk[3] = "First Task";
		stgTsk[4] = "TSk01";
		stgTsk[5] = "1";
		stgTsk[6] = "Somebody";
		lg.createTask(stgTsk, pg.getId());
		Task tsk = lg.getTask(0);
		Assert.assertEquals(pg.getName(),stgProj[4]);
		Assert.assertEquals(tsk.getName(),stgTsk[4]);
		
	}
	
	@Test
	public void createProjectAndTaskAndDelete() {
		//Project
		String[] stgProj = new String[6];
		stgProj[0] = "";
		stgProj[1] = "23.06.18";
		stgProj[2] = "Max Mustermann";
		stgProj[3] = "Test Project";
		stgProj[4] = "Test Project";
		stgProj[5] = "30.06.18";
		lg.createProject(stgProj);
		Project pg = lg.getProject(0);
		//Task
		String[] stgTsk = new String[7];
		stgTsk[0] = "";
		stgTsk[1] = "23.06.2018";
		stgTsk[2] = "Pedro";
		stgTsk[3] = "First Task";
		stgTsk[4] = "TSk01";
		stgTsk[5] = "1";
		stgTsk[6] = "Somebody";
		lg.createTask(stgTsk, pg.getId());
		Task tsk = lg.getTask(0);
		ArrayList<Task> tskList = lg.getTask();
		//Deleting
		lg.deleteProject(pg.getId());
		lg.deleteTask(tsk.getId());
		
		Assert.assertEquals(false, tskList.contains(tsk));
		ArrayList<Project> projList = lg.getProject();
		Assert.assertEquals(false, tskList.contains(pg));
	}
	


}
