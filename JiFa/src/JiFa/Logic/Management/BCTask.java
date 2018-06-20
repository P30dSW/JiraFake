package JiFa.Logic.Management;

import JiFa.Logic.Interface.Task;

public class BCTask extends AbstractMedium implements Task{
private int importance;
private String asingee;
	@Override
	public int getImportance() {
		return importance;
	}

	@Override
	public void setImportance(int imp) {
		importance = imp;
		
	}

	@Override
	public String getAsignee() {
		return asingee;
	}

	@Override
	public void setAsignee(String asg) {
		asingee = asg;
	}

	

}
