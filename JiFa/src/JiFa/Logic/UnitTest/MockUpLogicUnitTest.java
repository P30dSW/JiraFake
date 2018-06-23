package JiFa.Logic.UnitTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import JiFa.Logic.Interface.LogicFactory;
import JiFa.Logic.Interface.LogicManagement;
import JiFa.Logic.Interface.Project;

public class MockUpLogicUnitTest {
	LogicManagement lg ;
	@Before
	public void setUp() throws Exception {
		lg = LogicFactory.getLogicInstance();
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
		String[] stgTsk = new String[6];
	}
	
	@Test
	public void createProjectAndTaskAndDelete() {
		fail("Not yet implemented");
	}
	


}
