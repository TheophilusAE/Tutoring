/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoring.pkg1;
 
abstract class Animal {
    //Abstrack Method
    public abstract void makesound ();
    
    public void eat () {
        System.out.println("Hewan ini makan nasi padang");
    }
}

class dog extends Animal {
    @Override
    public void makesound () {
        System.out.println("mengaung");
    }
    
    @Override
    public void eat () {
        System.out.println("makan mie");
    }
}

public class Tutoring1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal dog = new dog ();
        dog.makesound();
        dog.eat();
    }
    
}
