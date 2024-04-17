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
class pri{
private String password;
    public void show()
    {
        System.out.println(this.password);
    }
    public String getpassword()
    {
     return this.password;
    }
    public void setpassword(String pass)
    {
        this.password=pass;
    }
    
}
//only access in class
//by using getter and setter use private outside class
public class Private_modifire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pri p1=new pri();
        p1.setpassword("khushi1234");
        System.out.println(p1.getpassword());
    }
    
}
