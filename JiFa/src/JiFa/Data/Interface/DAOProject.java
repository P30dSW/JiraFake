/**
 * DAO Interface f�r Projekten
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Data.Interface;

import java.util.ArrayList;

public interface DAOProject {
	/**
	 * erstellt eien Projekt
	 * @param data StringArray von PRojekt
	 */
	 public void createProject(String[] data);
	 /**
		 * �ndert einen Projekt
		 * @param data StringArray von PRojekt
		 * @param id id eines Projektes
		 */
	 public void editProject(String[] data, int id);
	 /**
		 * l�scht den Projekt
		 * @param id IdNummer des Projektes
		 */
	 public void deleteProject(int id);
	 /**
		 * gibt den gesuchen Projekt anhand eines id z�ruck 
		 * @params id idNummer des Projektes
		 * @retrun StringArray vom Projekt
		 */
	 public String[] getProject(int id);
	 /**
		 * gibt eine Liste von allen Proejkten z�ruck
		 * @return ArraList von Projekten StringArray
		 */
	 public ArrayList<String[]> getProjects();
	 /**
		 * gibt den h�chsten nicht benutzten Id z�ruck
		 * @return integer der offenen ID
		 */
	 public int getHightestUnasginedId();
}