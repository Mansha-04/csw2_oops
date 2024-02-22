public class interfaceVehicle {
    interface Vehicle {
        final int minwheels=2;
        public int getWheels();
        public void startEngine();
        public void stopEngine();
    }
    class Car implements Vehicle{
        int wheels;
        String type;
        public Car(int wheels,String type){
            this.wheels=wheels;
            this.type=type;
            System.out.println(type+"'s Constructor called");            
        }
        public int getWheels(){
            return wheels;
        }
        public void startEngine(){
            System.out.println(type+"Engine started");
        }
        public void stopEngine(){
            System.out.println(type+"Engine stopped");
        }

    }
    class Bike implements Vehicle{
        int wheels;
        String type;
        public Bike(int wheels,String type){
            this.wheels=wheels;
            this.type=type;
            System.out.println(type+"'s Constructor called");            
        }
        public int getWheels(){
            return wheels;
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
            Vehicle c1=new Car(4,"Maruti Swift");
            Vehicle b1=new Bike(2,"Royal Enfield");
            c1.startEngine();
            c1.stopEngine();
            b1.startEngine();
            b1.stopEngine();
        }
    }
}
