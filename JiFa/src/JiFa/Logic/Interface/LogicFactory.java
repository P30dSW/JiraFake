/**
 * Sigleton Kalsse der Logicschicht
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Logic.Interface;

public class LogicFactory {
private static LogicFactory theInstance = null;
private static LogicManagement LogicInstance = null;

/**
 * Gibt den Instanz vom LogicFactory zurück
 * @return LogicFactory Objekt 
 */
public static LogicFactory getInstance(){
	if(theInstance == null){
		theInstance = new LogicFactory();
	}
	return theInstance;
}
/**
 * Gibt den Instanz vom LogicManagement zurück
 * @return LogicManagement Objekt 
 */
public static LogicManagement getLogicInstance(){
	if(LogicInstance == null){
		LogicInstance = new LogicManagement();
	}
	return LogicInstance;
}
}
