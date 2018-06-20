package JiFa.Data.DAO;

import java.util.ArrayList;

import JiFa.Data.Interface.DAOProject;

public class DAOProjectMockUp implements DAOProject {
	private ArrayList<String[]> projectList = null;
	public DAOProjectMockUp() {
		
		this.projectList = new ArrayList<String[]>();
	}

	@Override
	public void createProject(String[] data) {
		//String reihenfolge
		//Id, date, creator, description, name ,deadline 
		projectList.add(data);
		
	}

	@Override
	public void editProject(String[] data, int id) {
		//Test if works
		for(String[] proj : projectList){
			if(proj[0].equals(Integer.toString(id))){
				proj = data;
				break;
			}
		}
		
	}

	@Override
	public String[] getProject(int id) {
        String[] result = null;
		for(String[] proj : projectList){
			if(proj[0].equals(Integer.toString(id))){
				result = proj;
			}
		}
		return result;
	}

	@Override
	public ArrayList<String[]> getProjects() {
		return projectList;
	}

	@Override
	public void deleteProject(int id) {
		
		for(String[] proj : projectList){
			if(proj[0].equals(Integer.toString(id))){
				projectList.remove(proj);
				break;
			}
		}
		
	}

	@Override
	public int getHightestUnasginedId() {
		int bigNum = 0;
		if(projectList.size() != 0){
		
		for(String[] stg : projectList){
			if(Integer.parseInt(stg[0]) > bigNum){
				bigNum = Integer.parseInt(stg[0]);
			}
		}
		}
		if(bigNum != 0){
			bigNum += 1;
		}
		return bigNum;
	}

}
