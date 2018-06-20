package JiFa.Logic.Interface;

import java.util.Date;

public interface Project {
	public int getId();
	public void setId(int id);
	public Date getDate();
	public void setDate(Date date);
	public String getCreator();
	public void setCreator(String creator);
	public String getDescription();
	public void setDescription(String description);
	public String getName();
	public void setName(String name);
	public Date getDeadline();
	public void setDeadline(Date date);
	public void addTask(Task tsk);
	public void removeTask(Task tsk);
}
