/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//get 3rd bit(pos=2)of package bit_manipulation;
//method 1.cal bitmask 2.operation and

/**
 *
 * @author khushi pandey
 */
public class Bit_manipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        int pos=3;
        int bitmask=1<<pos;
        if((bitmask & n)==0)
        {
            System.out.println("bit is zero");
        }
        else
        {
            System.out.println("bit is one");
        }
    }
    
}
