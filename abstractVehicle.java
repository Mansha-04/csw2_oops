public class abstractVehicle {
    abstract class Vehicle {
        int wheels;
        String type;
        public Vehicle(int wheels,String type){
            this.wheels=wheels;
            this.type=type;
            System.out.println("Vehicle's Constructor called");
        }
        public int getWheels(){
            return wheels;
        }
        public abstract void startEngine();
        public abstract void stopEngine();
    }
    class Car extends Vehicle{
        public Car(int wheels,String type){
            super(wheels,type);
            System.out.println(type+"'s Constructor called");            
        }
        public void startEngine(){
            System.out.println(type+"Engine started");
        }
        public void stopEngine(){
            System.out.println(type+"Engine stopped");
        }

    }
    class Bike extends Vehicle{
        public Bike(int wheels,String type){
            super(wheels,type);
            System.out.println(type+"'s Constructor called");            
        }
        public void startEngine(){
            System.out.println(type+"Engine started");
        }
        public void stopEngine(){
            System.out.println(type+"Engine stopped");
        }
        
    } 
    public class Main{
        public static void main(String[] args) {
            Vehicle c1=new Car(4, "A");
            Vehicle b1=new Bike(2, "B");
            c1.startEngine();
            c1.stopEngine();
            b1.startEngine();
            b1.stopEngine();
        }
    }  
     
}
