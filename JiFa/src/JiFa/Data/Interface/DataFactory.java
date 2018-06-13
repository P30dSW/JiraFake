package JiFa.Data.Interface;

import JiFa.Data.DAO.*;

public class DataFactory {
	private static DataFactory theInstance = null;
	private static BCDAOProject DAOProjectInstance = null;
	private static BCDAOTask DAOTaskInstance = null;
	private static DAOProjectMockUp ProjectMockUpInstance = null;
	private static DAOTaskMockUp TaskMockUpInstance = null;
	public static DataFactory getInstance(){
		if(theInstance == null){
			theInstance = new DataFactory();
		}
		return theInstance;
	}
	public static DAOProject getBCDAOProject(){
		if(DAOProjectInstance == null){
			DAOProjectInstance = new BCDAOProject();
		}
		return DAOProjectInstance;
	}
	public static DAOTask getBCDAOTask(){
		if(DAOTaskInstance == null){
			DAOTaskInstance = new BCDAOTask();
		}
		return DAOTaskInstance;
	}
	public static DAOProject getDAOProjectMockUp(){
		if(ProjectMockUpInstance == null){
			ProjectMockUpInstance = new DAOProjectMockUp();
		}
		return ProjectMockUpInstance;
	}
	public static DAOTask getDAOTaskMockUp(){
		if(TaskMockUpInstance == null){
			TaskMockUpInstance = new DAOTaskMockUp();
		}
		return TaskMockUpInstance;
	}
}
