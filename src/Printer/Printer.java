package Printer;

public class Printer {
	private double toner;
	private int pagesPrinted;
	private boolean duplexPrinter;
	
	public Printer(double toner, boolean duplexPrinter) {
		if(toner > 0 && toner <= 100) {
			this.toner = toner;
		}
		this.pagesPrinted = 0;
		this.duplexPrinter = duplexPrinter;
	}
	
	public void fillToner(double num) {
		double fill = num / (100 - toner);
		
		if(fill > 1) {
			fill = (fill - 1) * (100 - toner);
			toner = 100d;
			System.out.println("toner is full with " + fill + " left over.");
		} else {
			toner += num;
			System.out.println("toner partly filled to " +toner+" percent.");
		}
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(duplexPrinter) {
			pagesToPrint = (pages / 2) + (pages % 2);
			pagesPrinted += pagesToPrint;
			System.out.println("Printing in duplex mode " +pagesToPrint+ " pages.");
			return pagesToPrint;
		} else {
			pagesPrinted += pages;
			return pagesToPrint;
		}
	}

	public double getToner() {
		return toner;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}


	public boolean isDuplexPrinter() {
		return duplexPrinter;
	}
	
}
