/**
 * Interface für Projekt
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Logic.Interface;

public interface Project {
	/**
	 * getter für Id
	 * @return Id
	 */
	public int getId();
	/**
	 * setter für Id
	 * @param id Id vom Projekt
	 */
	public void setId(int id);
	/**
	 * getter der erstellungsdatum
	 * @return String als Datum (DD.MM.YYYY)
	 */
	public String getDate();
	/**
	 * Setter für erstellungsdatum
	 * @param date datum (DD.MM.YYYY)
	 */
	public void setDate(String date);
	/**
	 * getter für den ersteller 
	 * @return String vom ErstellerName
	 */
	public String getCreator();
	/**
	 * setter für den Ersteller
	 * @param creator String der Erstellername
	 */
	public void setCreator(String creator);
	/**
	 * getter für den Beschreibung
	 * @return String der Beschreibung
	 */
	public String getDescription();
	/**
	 * setter für den Beschreibung
	 * @param description Beschreibung als String
	 */
	public void setDescription(String description);
	/**
	 * getter für den PRojektName
	 * @return String der ProjektName
	 */
	public String getName();
	/**
	 * setter für den Projektname
	 * @param name Projektname als String
	 */
	public void setName(String name);
	/**
	 * getter für den Deadline
	 * @return String vom Deadline Datum (DD.MM.YYYY)
	 */
	public String getDeadline();
	/**
	 * setter für den Dealine
	 * @param date dealine datum (DD.MM.YYYY)
	 */
	public void setDeadline(String date);
	/**
	 * kann einen Task hinzufügen
	 * @param tsk TaskOjekt
	 */
	public void addTask(Task tsk);
	/**
	 * kann einen Task entfernen
	 * @param tsk TaskObjekt
	 */
	public void removeTask(Task tsk);
}
