/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoring2;
//Parent
class Animal {
    public void makesound (){
        System.out.println("This animal sounds like");
    }
    
    public void eat () {
        System.out.println("This Animal Eat");
    }
    
    public void eat (String food) {
        System.out.printf("This Animal Eat %s",food);
    }
}

//Child 1
class cat extends Animal {
    public void makesound (){
        System.out.println("This animal sounds like :  Meoww");
    }
    
    //Override
    public void eat (String food) {
        System.out.printf("This Animal Eat %s\n\n",food);
    }
}

//Child2
class ajg extends Animal {
    public void makesound (){
        System.out.println("This animal sounds like :  Woof");
    }
    
    //Overload
    public void eat(String food, int quantity) {
        System.out.println("Dog eats " + quantity + " units of " + food);
    }
}

/**
 *
 * @author asus
 */
public class Tutoring2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ajg dog = new ajg ();
       Animal cat = new cat ();
       
       cat.makesound();
       cat.eat("Ikan");
       
       dog.makesound();
       dog.eat("bone", 2);
//       dog.eat("Tulang", 2);
    }
    
}
