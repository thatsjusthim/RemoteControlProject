
public class RemoteControlApp; {
	
	import java.util.Scanner; 
	
	public static @ main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("To begin, please turn on the remote by pressing the ON button.");
		System.out.print();
		Scanner scanner;
		String button = scanner.next();
		
		switch (button) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				
				
		 scanner.close(); }
		  
	}
			private static void turnOn() {
		    System.out.println("TURNING ON...");

		  }

			private static void turnOff() {
		    System.out.println("TURNING OFF...");
		  }

			public static void pressButton() {
		    System.out.println("BOOP!");
		  }

			public static void error() {
		    System.out.println("Command not recognized.");
		  }
		}

