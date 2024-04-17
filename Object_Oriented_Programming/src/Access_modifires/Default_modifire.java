/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access_modifires;

/**
 *
 * @author khushi pandey
 */
class def{
    String name;
    public void show()
    {
        System.out.println(this.name);
    }
}
public class Default_modifire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        def d1=new def();
        d1.name="xing-xing";
        d1.show();
    }
    
}
