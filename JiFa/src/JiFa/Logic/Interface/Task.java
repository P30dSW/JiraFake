/**
 * Interface f�r Projekt
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Logic.Interface;

public interface Task {
	/**
	 * getter f�r Id
	 * @return Id
	 */
	public int getId();
	/**
	 * setter f�r Id
	 * @param id Id vom Task
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
	 * getter f�r den TaskName
	 * @return String der TaskName
	 */
	public String getName();
	/**
	 * setter f�r den TaskName
	 * @param name TaskName als String
	 */
	public void setName(String name);
	/**
	 * getter f�r den Wichtigkeit eines Tasks
	 * @return die Wichtigkeit als Integer
	 */
	public int getImportance();
	/**
	 * setter f�r den Wichtigkeit eines Tasks
	 * @param imp Wichtigkeit als Integer
	 */
	public void setImportance(int imp);
	/**
	 * getter f�r den Verantworlichen
	 * @return String vom Namen der Verantwortlichen
	 */
	public String getAsignee();
	/**
	 * setter f�r den Verantworlichen
	 * @param asg String vom Namen der Verantwortlichen
	 */
	public void setAsignee(String asg);
}
