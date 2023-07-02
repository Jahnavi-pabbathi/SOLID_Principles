package OpenClosedPrinciple.Ocp;

import OpenClosedPrinciple.Ocp.laserPrinter;

public class PrinterApp {
    //if we want to include one more printer then we have to modify this code every time
    public void printData(laserPrinter printer){
        printer.laserPrint();
    }
    public void printData(SolidPrinter printer){
        printer.laserPrint();
    }
}
