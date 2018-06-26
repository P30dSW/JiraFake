/**
 * Klasse für den Runtimespeicher von Task
 * Erbt von DAOTask
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Data.DAO;

import java.util.ArrayList;

import JiFa.Data.Interface.DAOTask;

public class DAOTaskMockUp implements DAOTask{
	private ArrayList<String[]> taskList = null;
	public DAOTaskMockUp() {
		taskList = new ArrayList<String[]>();
	}

	/**
	 * Erstellt einen Task und seipchert es
	 * @param data StringArray vom Task
	 * @param projectId IdNummer der zugewiesenden Project
	 */
	@Override
	public void createTask(String[] data, int projectId) {
		//String reihenfolge
		//Id, date, creator, description, name ,importance, asignee, projectId
		String[] newStgArray = new String[7] ;
		for (int i = 0; i < 7; i++) {
			if(i == 7){
				newStgArray[i] = Integer.toString(projectId);
			}else{
				newStgArray[i] = data[i];
			}
		}
		taskList.add(newStgArray);
	}

	/**
	 * Man gibt einen Task ein mit einen Ähnlichen Id und es erstetzt den im Speicher
	 * @param data StringArray vom Task
	 * @param id idNummer vom Task
	 */
	@Override
	public void editTask(String[] data, int id) {
		//Test if works
				for(String[] task : taskList){
					if(task[0].equals(Integer.toString(id))){
						task = data;
						break;
					}
				}
		
	}

	/**
	 *Löscht einen Task anhand der id
	 * @param id idNummer des Tasks
	 */
	@Override
	public void deleteTask(int id) {
		for(String[] task : taskList){
			if(task[0].equals(Integer.toString(id))){
				taskList.remove(task);
			}
		}
		
	}
	/**
	 * Gibt einen Task anhand des id zurück
	 * @param id idNummer des Tasks
	 * @return StringArray von Task
	 */
	@Override
	public String[] getTask(int id) {
		String[] result = null;
		for(String[] task : taskList){
			if(task[0].equals(Integer.toString(id))){
				result = task;
			}
		}
		return result;
	}
	/**
	 * Gibt alle Task in einer ArrayList von Strings zurück
	 * @return ArrayList von Tasks
	 */
	@Override
	public ArrayList<String[]> getTasks() {
	
		return taskList;
	}
	/**
	 * gibt den nächsten mit besetzten TaskID zurück
	 * @return den nicht besetzten Id
	 */
	@Override
	public int getHightestUnasginedId() {
		int bigNum = 0;
		if(taskList.size() != 0){
		
		for(String[] stg : taskList){
			if(Integer.parseInt(stg[0]) > bigNum){
				bigNum = Integer.parseInt(stg[0]);
			}
		}
		}
		
		return bigNum;
	}

}
