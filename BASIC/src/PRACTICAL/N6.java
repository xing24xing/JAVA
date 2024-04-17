/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;
interface animal{
    int eyes=2;
    public void walk();}
interface herbivore{}
class horse1 implements animal,herbivore{
    public void walk() {
        System.out.println("walk on for legs");}}
public class N6 {
       public static void main(String[] args) {
        // TODO code application logic here
        horse1 h1=new horse1();
        h1.walk();}}