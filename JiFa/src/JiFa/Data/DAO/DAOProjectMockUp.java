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
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getProject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String[]> getProjects() {
		// TODO Auto-generated method stub
		return null;
	}

}
