package JiFa.Data.DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import JiFa.Data.Interface.DAOTask;

public class BCDAOTask implements DAOTask{

	@Override
	public void createTask(String[] data, int projectId) {
		String[] newStgArray = new String[7] ;
		for (int i = 0; i < 7; i++) {
			if(i == 7){
				newStgArray[i] = Integer.toString(projectId);
			}else{
				newStgArray[i] = data[i];
			}
		}
		
		File fil = new File("resources/task.ser");
		if( fil.length() == 0){
			ArrayList<String[]> newTskList = new ArrayList<String[]>();
			newTskList.add(newStgArray);
			
			//adds Arraylist to .ser
			try {
		         FileOutputStream fileOut = new FileOutputStream("resources/task.ser");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(newTskList);
		         out.close();
		         fileOut.close();
		      } catch (IOException i) {
		         i.printStackTrace();
		      }
			
		}else{
			//extracs the ArrayList
			ArrayList<String[]> tskList = null;
		      try {
		         FileInputStream fileIn = new FileInputStream("resources/task.ser");
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         tskList = (ArrayList<String[]>) in.readObject();
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
		      tskList.add(newStgArray);
		    //clears file 
	    	  try {
	 	        File file = new File("resources/task.ser");
	 	       if(file.exists()){
	 	    	  file.delete(); 
	 	       }
	 	      file.createNewFile();
	 	       
	 	      } catch (IOException i) {
	 	         i.printStackTrace();
	 	         return;
	 	      }
		      try {
			         FileOutputStream fileOut = new FileOutputStream("resources/task.ser");
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(tskList);
			         out.close();
			         fileOut.close();
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			
		}
		
	}

	@Override
	public void editTask(String[] data, int id) {
		ArrayList<String[]> tskList = null;
		
	      try {
	         FileInputStream fileIn = new FileInputStream("resources/task.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         tskList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	         return;
	      }
	      
	      for(String[] stg : tskList){
	    	  if(stg[0].equals(Integer.toString(id))){
	    		  tskList.remove(stg);
	    		  tskList.add(data);
	    		  break;
	    	  }
	      }
	      
	    	  //clears file 
	    	  try {
	 	        File fil = new File("resources/task.ser");
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
	 	         FileOutputStream fileOut = new FileOutputStream("resources/task.ser");
	 	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	 	         out.writeObject(tskList);
	 	         out.close();
	 	         fileOut.close();
	 	      } catch (IOException i) {
	 	         i.printStackTrace();
	 	      }
		
	}

	@Override
	public void deleteTask(int id) {
		ArrayList<String[]> tskList = null;
		
	      try {
	         FileInputStream fileIn = new FileInputStream("resources/task.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         tskList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	         return;
	      }
	      
	      for(String[] stg : tskList){
	    	  if(stg[0].equals(Integer.toString(id))){
	    		  tskList.remove(stg);
	    		  
	    		  break;
	    	  }
	      }
	     
	    	  //clears file 
	    	  try {
	 	        File fil = new File("resources/task.ser");
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
	 	         FileOutputStream fileOut = new FileOutputStream("resources/task.ser");
	 	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	 	         out.writeObject(tskList);
	 	         out.close();
	 	         fileOut.close();
	 	      } catch (IOException i) {
	 	         i.printStackTrace();
	 	      }
		
	}

	@Override
	public String[] getTask(int id) {
		ArrayList<String[]> tskList = null;
		String[] result = null ;
		File fil = new File("resources/task.ser");
		if( fil.length() == 0){
			String[] dummy = null;
			return dummy;
			
		}else{
			
		
		
		try {
	         FileInputStream fileIn = new FileInputStream("resources/task.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         tskList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	         
	      }
	      
	      for(String[] stg : tskList){
	    	  if(stg[0].equals(Integer.toString(id))){
	    		  result = stg;
	    		  break;
	    	  }
	      }
	      return result;
	      }
	}

	@Override
	public ArrayList<String[]> getTasks() {
		ArrayList<String[]> tskList = null;
		File fil = new File("resources/task.ser");
		if( fil.length() == 0){
			ArrayList<String[]> dummy = null;
			return dummy;
			
		}else{
			
		}
	      try {
	         FileInputStream fileIn = new FileInputStream("resources/task.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         tskList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	         
	      }
	      
		return tskList;
		
	}

	@Override
	public int getHightestUnasginedId() {
		ArrayList<String[]> tskList = null;
		int highestNum = 0;
		File fil = new File("resources/task.ser");
		if( fil.length() != 0){
			
	      try {
	         FileInputStream fileIn = new FileInputStream("resources/task.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         tskList = (ArrayList<String[]>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	      }
	      
	      for(String[] stg : tskList){
	    	  if(Integer.parseInt(stg[0]) > highestNum){
	    		  highestNum = Integer.parseInt(stg[0]);
	    	  }
	      }
	      highestNum += 1;
		}  
		return highestNum;
	}
	

}
