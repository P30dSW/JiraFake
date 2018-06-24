/**
 * Singleton Klasse F�r den DataSchicht
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Data.Interface;

import JiFa.Data.DAO.*;

public class DataFactory {
	private static DataFactory theInstance = null;
	private static BCDAOProject DAOProjectInstance = null;
	private static BCDAOTask DAOTaskInstance = null;
	private static DAOProjectMockUp ProjectMockUpInstance = null;
	private static DAOTaskMockUp TaskMockUpInstance = null;
	/**
	 * Gibt den Instanz vom DataFacotry zur�ck
	 * @return DataFactory Objekt 
	 */
	public static DataFactory getInstance(){
		if(theInstance == null){
			theInstance = new DataFactory();
		}
		return theInstance;
	}
	/**
	 * Gibt den Instanz vom BCDAOProject zur�ck
	 * @return DAOProject Objekt 
	 */
	public static DAOProject getBCDAOProject(){
		if(DAOProjectInstance == null){
			DAOProjectInstance = new BCDAOProject();
		}
		return DAOProjectInstance;
	}
	/**
	 * Gibt den Instanz vom BCDAOTask zur�ck
	 * @return DAOTask Objekt 
	 */
	public static DAOTask getBCDAOTask(){
		if(DAOTaskInstance == null){
			DAOTaskInstance = new BCDAOTask();
		}
		return DAOTaskInstance;
	}
	/**
	 * Gibt den Instanz vom ProjectMockUp zur�ck
	 * @return DAOProject Objekt 
	 */
	public static DAOProject getDAOProjectMockUp(){
		if(ProjectMockUpInstance == null){
			ProjectMockUpInstance = new DAOProjectMockUp();
		}
		return ProjectMockUpInstance;
	}
	/**
	 * Gibt den Instanz vom DAOTaskMockUp zur�ck
	 * @return DAOTask Objekt 
	 */
	public static DAOTask getDAOTaskMockUp(){
		if(TaskMockUpInstance == null){
			TaskMockUpInstance = new DAOTaskMockUp();
		}
		return TaskMockUpInstance;
	}
}
