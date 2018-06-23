package JiFa.Data.DAO;

import java.util.ArrayList;
import java.io.*;

import JiFa.Data.Interface.DAOProject;

public class BCDAOProject implements DAOProject {

	@Override
	public void createProject(String[] data) {
		//if the file is empty it adds a new arraylist, if not, then it extracts the list
		File fil = new File("resources/project.ser");
		if( fil.length() == 0){
			ArrayList<String[]> newProjList = new ArrayList<String[]>();
			newProjList.add(data);
			
			//adds Arraylist to .ser
			try {
		         FileOutputStream fileOut = new FileOutputStream("resources/project.ser");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(newProjList);
		         out.close();
		         fileOut.close();
		      } catch (IOException i) {
		         i.printStackTrace();
		      }
			
		}else{
			//extracs the ArrayList
			ArrayList<String[]> projList = null;
		      try {
		         FileInputStream fileIn = new FileInputStream("resources/project.ser");
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         projList = (ArrayList<String[]>) in.readObject();
		         in.close();
		         fileIn.close();
		      } catch (IOException i) {
		         i.printStackTrace();
		         return;
		      } catch (ClassNotFoundException c) {
		         c.printStackTrace();
		         return;
		      }
			//adds and inserts it 
		      projList.add(data);
		      try {
			         FileOutputStream fileOut = new FileOutputStream("resources/project.ser");
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(projList);
			         out.close();
			         fileOut.close();
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			
		}

		
	}

	@Override
	public void editProject(String[] data, int id) {
		ArrayList<String[]> projList = null;
		
	      try {
	         FileInputStream fileIn = new FileInputStream("resources/project.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         projList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	         return;
	      }
	      
	      for(String[] stg : projList){
	    	  if(stg[0].equals(Integer.toString(id))){
	    		  projList.remove(stg);
	    		  projList.add(data);
	    		  break;
	    	  }
	      }
	    	  projList.size();
	    	  //clears file 
	    	  try {
	 	        File fil = new File("resources/project.ser");
	 	       if(fil.exists()){
	 	    	  fil.delete(); 
	 	       }
	 	       fil.createNewFile();
	 	       
	 	      } catch (IOException i) {
	 	         i.printStackTrace();
	 	         return;
	 	      }
	    	  
	    	  //adds to file
	    	  try {
	 	         FileOutputStream fileOut = new FileOutputStream("resources/project.ser");
	 	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	 	         out.writeObject(projList);
	 	         out.close();
	 	         fileOut.close();
	 	      } catch (IOException i) {
	 	         i.printStackTrace();
	 	      }
	    	  
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

	@Override
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHightestUnasginedId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
