/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access_modifires;

class Public{
    public String name;
    public void show()
    {
        System.out.println(this.name);
    }
}
/**
 *
 * @author khushi pandey
 */
public class public_modifire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Public p1=new Public();
        p1.name="khushi";
        p1.show();
    }
    
}
