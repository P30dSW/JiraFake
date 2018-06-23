package JiFa.Data.UnitTest;

import static org.junit.Assert.*;

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
	}

	@Test
	public void createProject() {
		String[] proj01 = {"2","20.06.2018","Pedro","Test Description","First Project", "30.06.2018"};
		projDAO.createProject(proj01);
		
	}
	
	@Test
	public void editProject() {
		
		//make sure the .ser is empty
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
	public void deleteProject() {
		//make sure the .ser is empty
		String[] proj01 = {"2","20.06.2018","Pedro","Test Description","First Project", "30.06.2018"};
		projDAO.createProject(proj01);
		projDAO.deleteProject( Integer.parseInt(proj01[0]));
		ArrayList<String[]> projList = projDAO.getProjects();
		Assert.assertEquals(0,projList.size());
	}
	
	@Test
	public void getNextProjectId() {
		//make sure the .ser is empty
		String[] proj01 = {"2","20.06.2018","Pedro","Test Description","First Project", "30.06.2018"};
		projDAO.createProject(proj01);
		String[] proj02 = {"3","20.06.2018","TEST","TEST","TEST", "30.06.2018"};
		projDAO.createProject(proj02);
		Assert.assertEquals(4,projDAO.getHightestUnasginedId());
	}

}
