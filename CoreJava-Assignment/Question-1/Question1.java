abstract class Animal{
   //abstract method
   public abstract void sound();
}

interface Vehical{
    public void tires();
    public void engine();
}

class Bike implements Vehical{

    //implementing methods in interface
    public void tires(){
        System.out.println("Bike has 2 tires");
    }

    public void engine(){
        System.out.println("Engine started");
    }
}


//Dog class extends Animal class
class Dog extends Animal {

   // own implementation of abstract method in child class
   public void sound(){
	System.out.println("Dog is barking!!!!");
   }

   public static void main(String args[]){
	Animal dog = new Dog();
	dog.sound();

    Bike myBike= new Bike();
    myBike.tires();
    myBike.engine();
   }
}