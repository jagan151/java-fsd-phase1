package com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lockedme {
	public Scanner inputs = new Scanner(System.in);
	public String dirName="C:\\Users\\Admin\\OneDrive\\Desktop\\Virtualkeys";
	public File dir=new File(dirName);

	public void sortfile() {
		System.out.println("Files in the directory:");
        String FileExt="";
        for(File SourceFile:dir.listFiles()) {
       	 String filename=SourceFile.getName();
       	 FileExt=filename.substring(filename.lastIndexOf(".")+1);
       	 if(FileExt.equalsIgnoreCase("txt")) {
       		 System.out.println(filename);
       	 }
        }
	}
	public void addfile() {
		System.out.print("Enter the name of file: ");
        String fileName = inputs.nextLine();
        fileName = fileName + ".txt";
        dir.mkdir();
        File file = new File(dir,fileName);
       try {
       if(file.exists()) {
        	System.out.println("File already exists...Try again");
        	addfile();
        	        }
        else {
        	file.createNewFile();
            System.out.println("File created");
        	System.out.println(file.getAbsolutePath());

        }
	}
       catch(Exception e) {}
	}
	public void delfile() {
		 System.out.print("Enter the file name to be deleted: ");
	        String delFile = inputs.nextLine();
	        delFile = delFile + ".txt";
	        File del = new File(dir,delFile);
	        if(del.exists()) {
	        del.delete();
	        System.out.println(delFile+" File deleted");}
	        else {
	        	System.out.println("File not Found...Tryagain");
	        	delfile();
	        }
	}
	public  void searchfile() {
		System.out.println("Enter a file name to be searched:");
        String SerFile = inputs.nextLine();
        SerFile = SerFile + ".txt";
        String[] flist = dir.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
            for (String Sername : flist) {
                if (Sername.equalsIgnoreCase(SerFile)) {
                    System.out.println(Sername + " found");
                    flag = 1;
                }
            }
        }

        if (flag == 0) {
            System.out.println("File Not Found....Try Again");
            searchfile();
        }
	}
	public void closeapp() {
		System.out.println("Closing your application....Thank You");
	}
	public void menu1() {
		  while(true) {
	      System.out.println("List of activities:");
	      String acti= "1.See current files in the directory\n2.File Handling operations\n3.Close the application";
	      System.out.println(acti);
	      String choice="Enter your choice 1,2or 3 here:";
	      System.out.println(choice);
	      int opt=inputs.nextInt();
	      if(opt==1||opt==2||opt==3) {
	      switch(opt) {
	      case 1:
	    	  sortfile();
	          break;
	      case 2:
	        menu2();
	    	break;
	      case 3:
	    	  closeapp();
	    	  System.exit(0);
	    	  break;
	      default:
	    	  System.out.println("You have made an invalid choice");
	    	  break;
	      }
	      }
	      }
	}
	public void menu2() {
		//Scanner inputs = new Scanner(System.in);
		while(true) {
		System.out.println("List of operations in filehandling:");
 	   System.out.println("Enter\n '1' for Adding a file\n '2' for Delete a file\n '3' for searching a file\n'4' for closing file handling operations" );
 	   int opt1=inputs.nextInt();
 	   if(opt1==1||opt1==2||opt1==3||opt1==4)
 	   {
 	   switch(opt1) {
 	   case 1:
 		  addfile();
 		   break;
 	   case 2:
 		   delfile();
 		   break;
 	   case 3:
 		   searchfile();
 		   break;
 	   case 4:
 		   menu1();
 		   break;
 		default:
 			System.out.println("Invalid Option.Try Again");
 			break;
 	     }
 	   }
		}
	}

public static void main(String[] args) throws IOException{
	  Lockedme lm=new Lockedme();
	  System.out.println("\n\tLOCKED ME APPLICATION");
	  System.out.println("\n**************************************\n");
	  System.out.println("\nDeveloper details:");
	  System.out.println("\n jagan\n\n");
	  System.out.println("\tWelcome to TheDesk \n");
      System.out.println("**************************************");
	  lm.menu1();
}
}


