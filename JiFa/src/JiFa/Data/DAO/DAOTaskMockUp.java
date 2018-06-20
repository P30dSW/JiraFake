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
		//Id, date, creator, description, name ,importance, asignee, projectId
		String[] newStgArray = new String[7] ;
		for (int i = 0; i < 7; i++) {
			if(i == 7){
				newStgArray[i] = Integer.toString(projectId);
			}else{
				newStgArray[i] = data[i];
			}
		}
		taskList.add(newStgArray);
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

	@Override
	public int getHightestUnasginedId() {
		int bigNum = 0;
		if(taskList.size() != 0){
		
		for(String[] stg : taskList){
			if(Integer.parseInt(stg[0]) > bigNum){
				bigNum = Integer.parseInt(stg[0]);
			}
		}
		}
		
		return bigNum;
	}

}
