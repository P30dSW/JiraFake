/**
 * Klasse für den Lokaen Speichern von Projekten
 * Erbt von DAOProject
 * @author Winkler, Grigoletti, Szeszak
 * @version 1.0
 */
package JiFa.Data.DAO;

import java.util.ArrayList;
import java.io.*;

import JiFa.Data.Interface.DAOProject;

public class BCDAOProject implements DAOProject {
	
	/**
	 * Erstellt einen Projekt und seipchert esasdgasdg
	 * @param data StringArray von einen Projekt
	 */
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
		    //clears file 
	    	  try {
	 	        File file = new File("resources/project.ser");
	 	       if(file.exists()){
	 	    	  file.delete(); 
	 	       }
	 	      file.createNewFile();
	 	       
	 	      } catch (IOException i) {
	 	         i.printStackTrace();
	 	         return;
	 	      }
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
	
	/**
	 * Man gibt einen Projekt ein mit einen Ähnlichen Id und es erstetzt den im Speicher
	 * @param data StringArray vom Project
	 * @param id idNummer vom Projekt
	 */
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
		
	
	/**
	 * Gibt einen Projekt anhand des id zurück
	 * @param id idNummer des Projektes
	 * @return StringArray von Projekt
	 */
	@Override
	public String[] getProject(int id) {
		ArrayList<String[]> projList = null;
		String[] result = null ;
		File fil = new File("resources/project.ser");
		if( fil.length() == 0){
			String[] dummy = null;
			return dummy;
			
		}else{
			
		
		
		try {
	         FileInputStream fileIn = new FileInputStream("resources/project.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         projList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	         
	      }
	      
	      for(String[] stg : projList){
	    	  if(stg[0].equals(Integer.toString(id))){
	    		  result = stg;
	    		  break;
	    	  }
	      }
	      return result;
	      }
	}
	/**
	 * Gibt alle Projekten in einer ArrayList von Strings zurück
	 * @return ArrayList von Projekten
	 */
	@Override
	public ArrayList<String[]> getProjects() {
		ArrayList<String[]> projList = null;
		File fil = new File("resources/project.ser");
		if( fil.length() == 0){
			ArrayList<String[]> dummy = null;
			return dummy;
			
		}else{
			
		}
	      try {
	         FileInputStream fileIn = new FileInputStream("resources/project.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         projList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	         
	      }
	      
		return projList;
	}

	/**
	 * Löscht einen Projekt anhand der id
	 * @param id idNummer des Projektes
	 */
	@Override
	public void deleteProject(int id) {
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

	/**
	 * gibt den nächsten mit besetzten ProjektID zurück
	 * @return den nicht besetzten Id
	 */
	@Override
	public int getHightestUnasginedId() {
		ArrayList<String[]> projList = null;
		int highestNum = 0;
		File fil = new File("resources/project.ser");
		if( fil.length() != 0){
			
	      try {
	         FileInputStream fileIn = new FileInputStream("resources/project.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         projList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	      }
	      
	      for(String[] stg : projList){
	    	  if(Integer.parseInt(stg[0]) > highestNum){
	    		  highestNum = Integer.parseInt(stg[0]);
	    	  }
	      }
	      highestNum += 1;
		}  
		return highestNum;
	}
	
	

}
