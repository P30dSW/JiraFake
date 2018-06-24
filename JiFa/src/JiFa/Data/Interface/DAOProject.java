/**
 * DAO Interface für Projekten
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
		 * ändert einen Projekt
		 * @param data StringArray von PRojekt
		 * @param id id eines Projektes
		 */
	 public void editProject(String[] data, int id);
	 /**
		 * löscht den Projekt
		 * @param id IdNummer des Projektes
		 */
	 public void deleteProject(int id);
	 /**
		 * gibt den gesuchen Projekt anhand eines id züruck 
		 * @params id idNummer des Projektes
		 * @retrun StringArray vom Projekt
		 */
	 public String[] getProject(int id);
	 /**
		 * gibt eine Liste von allen Proejkten züruck
		 * @return ArraList von Projekten StringArray
		 */
	 public ArrayList<String[]> getProjects();
	 /**
		 * gibt den höchsten nicht benutzten Id züruck
		 * @return integer der offenen ID
		 */
	 public int getHightestUnasginedId();
}