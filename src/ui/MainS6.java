package ui;

import java.io.IOException;
import java.util.Scanner;

import model.Contries;
import model.ControllerModel;

public class MainS6 {
	public static final ControllerModel test=new ControllerModel();
	public static final Scanner sc= new Scanner(System.in);
	
	public static void main(String[]args) throws IOException {
		
		boolean continues2=true;
		while(conitnues2) {

			System.out.println("Select an option ");
			System.out.println("1:Add contry by console");
			System.out.println("2:Print contries");
			System.out.println("3:Load file");
			int answer= sc.nextInt();
			sc.nextLine();
			boolean continues=true;

			while(continues) {

				switch(answer) {

				case 1:
					Addconsole();
					continues=false;
				break;
				
				case 2:
					PrintArrays();
					continues=false;
				break;
				
				case 3:
					ImportData();
					continues=false;
				break;
				
				default:
					System.out.println("This option does not exist");
					continues=false;
				break;	
				}
			}
		}	
	}
	
	public static void Addconsole() {
		System.out.println("Write(Country;gold mens;silver mens;Bronce mens;gold womans;silver womans;bronze womans)");
		String answer=sc.nextLine();
		
		String[] parts= answer.split(";");
		
		String country=parts[0];
		int goldm=Integer.parseInt(parts[1]);
		int silverm=Integer.parseInt(parts[2]);
		int bronzem=Integer.parseInt(parts[3]);
		int goldf=Integer.parseInt(parts[4]);
		int silverf=Integer.parseInt(parts[5]);
		int bronzef=Integer.parseInt(parts[6]);
		
		
		Contries participant= new Contries(country,goldm,silverm,bronzem,goldf,silverf,bronzef);
		test.addCountry(participant);
		
	}
	
	public static void printArrays() {
		
	}

}
