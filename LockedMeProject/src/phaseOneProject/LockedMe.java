package phaseOneProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {
	static final String projectFiles="E:\\projectfiles";
	
	/**
	 * Lists all the menu
	 */
	public static void menuList() {
		System.out.println("----------------------------");
		System.out.println("\tWelcome to LockedMe.com");
		System.out.println("\tDevoloped By : Sachin Hegde");
		System.out.println("----------------------------");
		System.out.println("\t1.Display Files");
		System.out.println("\t2.Add a new File");
		System.out.println("\t3.Delete a File");
		System.out.println("\t4.Search File");
		System.out.println("\t5.Exit");
		System.out.println("----------------------------");
	}
	
	/**
	 * Display all the files in the folder
	 */
	public static void displayFiles() {
		File file = new File(projectFiles);

	    // returns an array of all files
	    File[] fileList = file.listFiles();

	    for(File fname : fileList) {
	      System.out.println("\t"+fname.getName());
	    }
	}
	
	/**
	 * takes files name and number of lines from the user and create the file
	 */
	public static void addFile() {
		try {
			Scanner sc=new Scanner(System.in);
			String fileName;
			System.out.println("\tEnter File Name to Add");
			fileName=sc.nextLine();
			
			int lineCnt;
			System.out.println("\tEnter Lines Count");
			lineCnt=Integer.parseInt(sc.nextLine());
		    
			FileWriter fw=new FileWriter(projectFiles+"\\"+fileName);
			
			for(int i=1;i<=lineCnt;i++) {
				System.out.println("\tEnter Line "+i+" content :");
				fw.write(sc.nextLine()+"\n");
			}
			System.out.println("\tFile Crated Successfuly");
			fw.close();
		}
		catch(Exception e) {
			System.out.println("\tThere is an error");
		}
		
	}
	
	/**
	 * takes files name and  from the user and delete the file if present
	 */
	public static void deleteFile() {
		try {
			Scanner sc=new Scanner(System.in);
			String fileName;
			ArrayList<String> allFiles=new ArrayList<String>();
			
			File folder = new File(projectFiles);

		    // returns an array of all files
		    File[] fileList = folder.listFiles();
		    if(fileList.length>0) {
		    	System.out.println("\tFiles List");
		    	for(File fname : fileList) {
				      System.out.println("\t"+fname.getName());
				      allFiles.add(fname.getName());
			    }
		    }
		    
			
			System.out.println("\tEnter File Name to be deleted");
			fileName=sc.nextLine();
			File f=new File(projectFiles+"\\"+fileName);
			if(allFiles.contains(fileName)) {
				f.delete();
				System.out.println("\tFile Deleted Successfuly");
			}
			else {
				System.out.println("\tFile Not exist");
			}
		}
		catch(Exception e) {
			System.out.println("There is an error");
		}
		
		
	}
	
	/**
	 * takes files name and  from the user and searches the file
	 */
	public static void seachFile() {
		
		try {
			Scanner sc=new Scanner(System.in);
			String fileName;
			
			ArrayList<String> allFiles=new ArrayList<String>();
			File folder = new File(projectFiles);
		    File[] fileList = folder.listFiles();
		    if(fileList.length>0) {
		    	
		    	for(File fname : fileList) {
		    		allFiles.add(fname.getName());
			    }
		    }
		    
			
			System.out.println("\tEnter File Name");
			fileName=sc.nextLine();
			File f=new File(projectFiles+"\\"+fileName);
			if(allFiles.contains(fileName)) {
				System.out.println("\tFile Present");
			}
			else {
				System.out.println("\tFile Not exist");
			}
		}
		catch(Exception e) {
			System.out.println("There is an error");
		}
	}
	
}
