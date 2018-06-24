/**
 * Klasse für den Runtimespeichern von Projekten
 * Erbt von DAOProject
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Data.DAO;

import java.util.ArrayList;

import JiFa.Data.Interface.DAOProject;

public class DAOProjectMockUp implements DAOProject {
	private ArrayList<String[]> projectList = null;
	public DAOProjectMockUp() {
		
		this.projectList = new ArrayList<String[]>();
	}
	/**
	 * erstellt eien Projekt
	 * @param data StringArray von PRojekt
	 */
	@Override
	public void createProject(String[] data) {
		//String reihenfolge
		//Id, date, creator, description, name ,deadline 
		//Date und Deadline wird als DD.MM.YYYY gespeichert
		projectList.add(data);
		
	}
	
	/**
	 * ändert einen Projekt
	 * @param data StringArray von PRojekt
	 * @param id id eines Projektes
	 */
	@Override
	public void editProject(String[] data, int id) {
		//Test if works
		for(String[] proj : projectList){
			if(proj[0].equals(Integer.toString(id))){
				proj = data;
				break;
			}
		}
		
	}

	/**
	 * gibt den gesuchen Projekt anhand eines id züruck 
	 * @params id idNummer des Projektes
	 * @retrun StringArray vom Projekt
	 */
	@Override
	public String[] getProject(int id) {
        String[] result = null;
		for(String[] proj : projectList){
			if(proj[0].equals(Integer.toString(id))){
				result = proj;
			}
		}
		return result;
	}
	
	/**
	 * gibt eine Liste von allen Proejkten züruck
	 * @return ArraList von Projekten StringArray
	 */
	@Override
	public ArrayList<String[]> getProjects() {
		return projectList;
	}
	
	/**
	 * löscht den Projekt
	 * @param id IdNummer des Projektes
	 */
	@Override
	public void deleteProject(int id) {
		
		for(String[] proj : projectList){
			if(proj[0].equals(Integer.toString(id))){
				projectList.remove(proj);
				break;
			}
		}
		
	}
	/**
	 * gibt den höchsten nicht benutzten Id züruck
	 * @return integer der offenen ID
	 */
	@Override
	public int getHightestUnasginedId() {
		int bigNum = 0;
		if(projectList.size() != 0){
		
		for(String[] stg : projectList){
			if(Integer.parseInt(stg[0]) > bigNum){
				bigNum = Integer.parseInt(stg[0]);
			}
		}
		}
		if(bigNum != 0){
			bigNum += 1;
		}
		return bigNum;
	}

}
