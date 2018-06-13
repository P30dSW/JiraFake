package JiFa.Data.Interface;

import java.util.ArrayList;

public interface DAOTask {
public void createTask(String[] data, int projectId);
public void editTask(String[] data ,int id);
public void deleteTask(int id);
public String[] getTask(int id);
public ArrayList<String[]> getTasks();
}
