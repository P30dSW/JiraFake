/**
 * Singleton Klasse Für den DataSchicht
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
	 * Gibt den Instanz vom DataFacotry zurück
	 * @return DataFactory Objekt 
	 */
	public static DataFactory getInstance(){
		if(theInstance == null){
			theInstance = new DataFactory();
		}
		return theInstance;
	}
	/**
	 * Gibt den Instanz vom BCDAOProject zurück
	 * @return DAOProject Objekt 
	 */
	public static DAOProject getBCDAOProject(){
		if(DAOProjectInstance == null){
			DAOProjectInstance = new BCDAOProject();
		}
		return DAOProjectInstance;
	}
	/**
	 * Gibt den Instanz vom BCDAOTask zurück
	 * @return DAOTask Objekt 
	 */
	public static DAOTask getBCDAOTask(){
		if(DAOTaskInstance == null){
			DAOTaskInstance = new BCDAOTask();
		}
		return DAOTaskInstance;
	}
	/**
	 * Gibt den Instanz vom ProjectMockUp zurück
	 * @return DAOProject Objekt 
	 */
	public static DAOProject getDAOProjectMockUp(){
		if(ProjectMockUpInstance == null){
			ProjectMockUpInstance = new DAOProjectMockUp();
		}
		return ProjectMockUpInstance;
	}
	/**
	 * Gibt den Instanz vom DAOTaskMockUp zurück
	 * @return DAOTask Objekt 
	 */
	public static DAOTask getDAOTaskMockUp(){
		if(TaskMockUpInstance == null){
			TaskMockUpInstance = new DAOTaskMockUp();
		}
		return TaskMockUpInstance;
	}
}
