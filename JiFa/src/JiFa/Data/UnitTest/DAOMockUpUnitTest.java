package JiFa.Data.UnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import JiFa.Data.Interface.DAOProject;
import JiFa.Data.Interface.DAOTask;
import JiFa.Data.Interface.DataFactory;

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
	public void test() {
		fail("Not yet implemented");
	}

}
