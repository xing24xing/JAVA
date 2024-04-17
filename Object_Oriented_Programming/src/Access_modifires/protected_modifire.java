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
class protect{
protected String password;
    public void show()
    {
        System.out.println(this.password);
    }
}
public class protected_modifire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        protect p1=new protect();
        p1.password="khushi123";
        p1.show();
    }
    
}
