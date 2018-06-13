package JiFa.Data.DAO;

import java.util.ArrayList;

import JiFa.Data.Interface.DAOTask;

public class DAOTaskMockUp implements DAOTask{
	private ArrayList<String[]> taskList = null;
	public DAOTaskMockUp() {
		taskList = new ArrayList<String[]>();
	}

	@Override
	public void createTask(String[] data, int projectId) {
		//String reihenfolge
		//Id, date, creator, description, name ,importance, asignee
		taskList.add(data);
	}

	@Override
	public void editTask(String[] data, int id) {
		//Test if works
				for(String[] task : taskList){
					if(task[0].equals(Integer.toString(id))){
						task = data;
						break;
					}
				}
		
	}

	@Override
	public void deleteTask(int id) {
		for(String[] task : taskList){
			if(task[0].equals(Integer.toString(id))){
				taskList.remove(task);
			}
		}
		
	}

	@Override
	public String[] getTask(int id) {
		String[] result = null;
		for(String[] task : taskList){
			if(task[0].equals(Integer.toString(id))){
				result = task;
			}
		}
		return result;
	}

	@Override
	public ArrayList<String[]> getTasks() {
	
		return taskList;
	}

}
