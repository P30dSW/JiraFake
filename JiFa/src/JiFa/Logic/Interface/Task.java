/**
 * Interface für Projekt
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Logic.Interface;

public interface Task {
	/**
	 * getter für Id
	 * @return Id
	 */
	public int getId();
	/**
	 * setter für Id
	 * @param id Id vom Task
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
	 * getter für den TaskName
	 * @return String der TaskName
	 */
	public String getName();
	/**
	 * setter für den TaskName
	 * @param name TaskName als String
	 */
	public void setName(String name);
	/**
	 * getter für den Wichtigkeit eines Tasks
	 * @return die Wichtigkeit als Integer
	 */
	public int getImportance();
	/**
	 * setter für den Wichtigkeit eines Tasks
	 * @param imp Wichtigkeit als Integer
	 */
	public void setImportance(int imp);
	/**
	 * getter für den Verantworlichen
	 * @return String vom Namen der Verantwortlichen
	 */
	public String getAsignee();
	/**
	 * setter für den Verantworlichen
	 * @param asg String vom Namen der Verantwortlichen
	 */
	public void setAsignee(String asg);
}
