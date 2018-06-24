/**
 * Klasse vom Projektobjekt
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Logic.Management;

import java.util.ArrayList;
import java.util.Date;

import JiFa.Logic.Interface.Project;
import JiFa.Logic.Interface.Task;

public class BCProject extends AbstractMedium implements Project  {
private String deadLine;
private ArrayList<Task> taskList = null;

public BCProject(){
	taskList = new ArrayList<Task>();
}

/**
 * kann einen Task hinzufügen
 * @param tsk Objekt Task
 */
@Override
public void addTask(Task tsk) {
	taskList.add(tsk);
	
}

/**
 * entfernt einen Task von der Liste
 * @param tsk Taskobjekt
 */
@Override
public void removeTask(Task tsk) {
	taskList.remove(tsk);
	
}
/**
 * getter für den Deadline
 * @return String vom Deadline Datum (DD.MM.YYYY)
 */
@Override
public String getDeadline() {
	
	return deadLine;
}
/**
 * setter für den Dealine
 * @param date dealine datum (DD.MM.YYYY)
 */
@Override
public void setDeadline(String date) {
	deadLine = date;
	
}


}
