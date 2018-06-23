package JiFa.Logic.Interface;

import java.util.Date;

public interface Task {
	public int getId();
	public void setId(int id);
	public String getDate();
	public void setDate(String date);
	public String getCreator();
	public void setCreator(String creator);
	public String getDescription();
	public void setDescription(String description);
	public String getName();
	public void setName(String name);
	public int getImportance();
	public void setImportance(int imp);
	public String getAsignee();
	public void setAsignee(String asg);
}
