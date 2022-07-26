package Printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(33d, true);
		
		printer.fillToner(100);
		printer.printPages(5);
		System.out.println(printer.getPagesPrinted());
	}

}
