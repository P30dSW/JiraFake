/**
 * Klasse vom Taskobjekt
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Logic.Management;

import JiFa.Logic.Interface.Task;

public class BCTask extends AbstractMedium implements Task{
private int importance;
private String asingee;
	/**
	 * getter für den Wichtigkeit eines Tasks
	 * @return die Wichtigkeit als Integer
	 */
	@Override
	public int getImportance() {
		return importance;
	}
	/**
	 * setter für den Wichtigkeit eines Tasks
	 * @param imp Wichtigkeit als Integer
	 */
	@Override
	public void setImportance(int imp) {
		importance = imp;
		
	}
	/**
	 * getter für den Verantworlichen
	 * @return String vom Namen der Verantwortlichen
	 */
	@Override
	public String getAsignee() {
		return asingee;
	}
	/**
	 * setter für den Verantworlichen
	 * @return String vom Namen der Verantwortlichen
	 */
	@Override
	public void setAsignee(String asg) {
		asingee = asg;
	}


	

}
