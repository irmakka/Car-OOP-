public class Car {
         // attributes of objects 
         public String Marka,Model,Color;
         public int Cost,Speed;

         // methods of objects
         //Increasing the speed
         public void Increment(int increment){
               this.Speed=this.Speed+increment;
         }
        //Deacresing the speed
        public void Deacrese(int deacrese){
            this.Speed=this.Speed-deacrese;
        }
        // print method
        public void printMethod(){ 
            System.out.println(this.Marka+"  "+this.Model+ "  " +this.Color+"  "+this.Cost+"   " + this.Speed);
        }


    }
