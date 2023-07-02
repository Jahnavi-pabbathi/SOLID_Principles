package OpenClosedPrinciple.OpenClosedPrincipleCorrection;

public class Demo extends PrinterApp {


    public static void main(String[] args) {
        //This is client code and we need not modify our code everytime we need a new printer
        //we can simply add one more class that implements our interface
        //open closed principle is open to extension but close to modification
        String choice="Laser";
        PrinterApp pa = new PrinterApp();
        pa.printer(choice);
    }
}
