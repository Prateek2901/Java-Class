    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package equals;

    /**
     *
     * @author prateek
     */
    public class EQUALS{
    public static void main (String [] args) {
    Moof one = new Moof(8);
    Moof two = new Moof(8);
    if (one.equals(two)) {
    System.out.println("one and two are equal");
    }
    System.out.println(one.equals(two));
    }
    }
    class Moof {
    private int moofValue;
    Moof(int val) {
    moofValue = val;
    }
    public int getMoofValue() {
    return moofValue;
    }
    
    @Override
    public boolean equals(Object o) {
    if ((o instanceof Moof) && (((Moof)o).getMoofValue()
    == this.moofValue)) {
    return true;
    } else {
    return false;
    }
    }
    }
