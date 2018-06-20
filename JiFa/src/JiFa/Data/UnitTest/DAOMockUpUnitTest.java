package JiFa.Data.UnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import JiFa.Data.Interface.DAOProject;
import JiFa.Data.Interface.DAOTask;
import JiFa.Data.Interface.DataFactory;
import junit.framework.Assert;

public class DAOMockUpUnitTest {
	DAOProject projMockUp = null;
	DAOTask taskMockUp = null;
	@Before
	public void setUp() throws Exception {
		projMockUp = DataFactory.getDAOProjectMockUp();
		taskMockUp = DataFactory.getDAOTaskMockUp();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cerateProjectWoTaskAndDelete() {
		String[] proj01 = {"2","20.06.2018","Test Description","First Project", "30.06.2018"};
		projMockUp.createProject(proj01);
		
		for(String stg : projMockUp.getProject(2)){
			System.out.println(stg);
			
		}
		projMockUp.deleteProject(2);
		
		System.out.println("Project was Deleted");
		
	}
	@Test
	public void showAllProjects() {
		for(String[] stgs : projMockUp.getProjects()){
			for(String stg : stgs){
				System.out.println(stg);
			}
			
		}
	}
	@Test
	public void showAllTask() {
		fail("Not yet implemented");
	}
	@Test
	public void cerateProjectWTaskAndDelete() {
		fail("Not yet implemented");
	}

}
