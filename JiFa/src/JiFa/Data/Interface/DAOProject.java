package JiFa.Data.Interface;

import java.util.ArrayList;

public interface DAOProject {
	 public void createProject(String[] data);
	 public void editProject(String[] data, int id);
	 public void deleteProject(int id);
	 public String[] getProject(int id);
	 public ArrayList<String[]> getProjects();
	 public int getHightestUnasginedId();
}