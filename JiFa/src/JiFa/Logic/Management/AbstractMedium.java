/**
 * Abstrakte Klasse für Projekt und Task
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Logic.Management;


public abstract class AbstractMedium {
	private int id;
	private String date;
	private String creator;
	private String description;
	private String name;
	
	/**
	 * getter für Id
	 * @return Id
	 */
	public int getId() {
		return id;
	}
	/**
	 * setter für Id
	 * @param id Id vom Medium
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * getter der erstellungsdatum
	 * @return String als Datum (DD.MM.YYYY)
	 */
	public String getDate() {
		return date;
	}
	/**
	 * Setter für erstellungsdatum
	 * @param date datum (DD.MM.YYYY)
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * getter für den ersteller 
	 * @return String vom ErstellerName
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * stter für den Ersteller
	 * @param creator String der Erstellername
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * getter für den Beschreibung
	 * @return String der Beschreibung
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * setter für den Beschreibung
	 * @param description Beschreibung als String
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * getter für den MediumName
	 * @return String der MediumName
	 */
	public String getName() {
		return name;
	}
	/**
	 * setter für den MediumName
	 * @param name MediumName als String
	 */
	public void setName(String name) {
		this.name = name;
	}

}
