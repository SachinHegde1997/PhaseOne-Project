package phaseOneProject;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int ch;
		do {
			LockedMe.menuList();
			System.out.println("\tEnter Your Choice : ");
			ch=Integer.parseInt(obj.nextLine());
			switch(ch) {
				case 1:LockedMe.displayFiles();
					break;
				case 2:LockedMe.addFile();
					break;
				case 3:LockedMe.deleteFile();
					break;
				case 4:LockedMe.seachFile();
					break;
				case 5:System.exit(0);
					break;
				default:System.out.println("Invalid Option");
					break;
			}
		}
		while(ch>0);
		
		obj.nextLine();
		obj.close();

	}

}
