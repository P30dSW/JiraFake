package JiFa.Data.UnitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import JiFa.Data.Interface.DAOProject;
import JiFa.Data.Interface.DAOTask;
import JiFa.Data.Interface.DataFactory;

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
		String[] proj02 = {"2","20.06.2018","Pedro","EDITED","First Project", "30.06.2018"};
		projDAO.editProject(proj02, Integer.parseInt(proj02[0]));
	}

}
