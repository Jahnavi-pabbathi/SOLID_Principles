package OpenClosedPrinciple.OpenClosedPrincipleCorrection;

public class PrinterApp {
    public void printer(String choice){

        Iprinter iprinter =null;
        if(choice.equals("Laser")){
            iprinter=new LaserPrinter();
        } else if (choice.equals("dot matrix")) {
            iprinter=new DotMatrixPrinter();
        }
        else if(choice.equals("solid")){
            iprinter=new SolidPrinter();
        }
        printData(iprinter);
    }

    public void printData(Iprinter iprinter) {
        iprinter.print();
    }
}
