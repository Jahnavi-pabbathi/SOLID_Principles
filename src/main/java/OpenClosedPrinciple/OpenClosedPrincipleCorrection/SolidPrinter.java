package OpenClosedPrinciple.OpenClosedPrincipleCorrection;

import OpenClosedPrinciple.OpenClosedPrincipleCorrection.Iprinter;

public class SolidPrinter implements Iprinter {
    @Override
    public void print() {
        System.out.println("printing from solid printer");
    }
}
