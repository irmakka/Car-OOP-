public class Main {
   public static void main(String[] args) {
           //Declaring objects object referrer left part , allocating space from Heap right part.
           Car car=new Car();
           Car car1=new  Car();
           // Giving value to attributes
           car.Marka="BMW";
           car1.Marka="Mercedes";
           car.Model="i4";
           car1.Model="C Class";
           car.Color="Red";
           car1.Color="Black";
           car.Cost=930000;
           car1.Cost=4000000;
           car.Speed=100;
           car1.Speed=100;
           car.Deacrese(50);
           car1.Increment(50);
           car.printMethod();
           car1.printMethod();
      //could have used constructor

   }

}
