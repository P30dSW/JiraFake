/**
 * Interface f�r Projekt
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Logic.Interface;

public interface Project {
	/**
	 * getter f�r Id
	 * @return Id
	 */
	public int getId();
	/**
	 * setter f�r Id
	 * @param id Id vom Projekt
	 */
	public void setId(int id);
	/**
	 * getter der erstellungsdatum
	 * @return String als Datum (DD.MM.YYYY)
	 */
	public String getDate();
	/**
	 * Setter f�r erstellungsdatum
	 * @param date datum (DD.MM.YYYY)
	 */
	public void setDate(String date);
	/**
	 * getter f�r den ersteller 
	 * @return String vom ErstellerName
	 */
	public String getCreator();
	/**
	 * setter f�r den Ersteller
	 * @param creator String der Erstellername
	 */
	public void setCreator(String creator);
	/**
	 * getter f�r den Beschreibung
	 * @return String der Beschreibung
	 */
	public String getDescription();
	/**
	 * setter f�r den Beschreibung
	 * @param description Beschreibung als String
	 */
	public void setDescription(String description);
	/**
	 * getter f�r den PRojektName
	 * @return String der ProjektName
	 */
	public String getName();
	/**
	 * setter f�r den Projektname
	 * @param name Projektname als String
	 */
	public void setName(String name);
	/**
	 * getter f�r den Deadline
	 * @return String vom Deadline Datum (DD.MM.YYYY)
	 */
	public String getDeadline();
	/**
	 * setter f�r den Dealine
	 * @param date dealine datum (DD.MM.YYYY)
	 */
	public void setDeadline(String date);
	/**
	 * kann einen Task hinzuf�gen
	 * @param tsk TaskOjekt
	 */
	public void addTask(Task tsk);
	/**
	 * kann einen Task entfernen
	 * @param tsk TaskObjekt
	 */
	public void removeTask(Task tsk);
}
