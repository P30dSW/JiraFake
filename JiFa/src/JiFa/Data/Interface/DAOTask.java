/**
 * DAO Inteface für Task
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Data.Interface;

import java.util.ArrayList;

public interface DAOTask {
	/**
	 * Erstellt einen Task und seipchert es
	 * @param data StringArray vom Task
	 * @param projectId IdNummer der zugewiesenden Project
	 */
public void createTask(String[] data, int projectId);
/**
 * Man gibt einen Task ein mit einen Ähnlichen Id und es erstetzt den im Speicher
 * @param data StringArray vom Task
 * @param id idNummer vom Task
 */
public void editTask(String[] data ,int id);
/**
 *Löscht einen Task anhand der id
 * @param id idNummer des Tasks
 */
public void deleteTask(int id);
/**
 * Gibt einen Task anhand des id zurück
 * @param id idNummer des Tasks
 * @return StringArray von Task
 */
public String[] getTask(int id);
/**
 * Gibt alle Task in einer ArrayList von Strings zurück
 * @return ArrayList von Tasks
 */
public ArrayList<String[]> getTasks();
/**
 * gibt den nächsten mit besetzten TaskID zurück
 * @return den nicht besetzten Id
 */
public int getHightestUnasginedId();
}
