/**
 * Abstrakte Klasse f�r Projekt und Task
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
	 * getter f�r Id
	 * @return Id
	 */
	public int getId() {
		return id;
	}
	/**
	 * setter f�r Id
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
	 * Setter f�r erstellungsdatum
	 * @param date datum (DD.MM.YYYY)
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * getter f�r den ersteller 
	 * @return String vom ErstellerName
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * stter f�r den Ersteller
	 * @param creator String der Erstellername
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * getter f�r den Beschreibung
	 * @return String der Beschreibung
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * setter f�r den Beschreibung
	 * @param description Beschreibung als String
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * getter f�r den MediumName
	 * @return String der MediumName
	 */
	public String getName() {
		return name;
	}
	/**
	 * setter f�r den MediumName
	 * @param name MediumName als String
	 */
	public void setName(String name) {
		this.name = name;
	}

}
