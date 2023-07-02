package OpenClosedPrinciple.OpenClosedPrincipleCorrection;

import OpenClosedPrinciple.OpenClosedPrincipleCorrection.Iprinter;

public class LaserPrinter implements Iprinter {
    @Override
    public void print() {
        System.out.println("printing from laser printer");
    }
}
