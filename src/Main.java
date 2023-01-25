import baked.Bakedable;
import baked.Break;
import baked.Bun;
import baked.Pie;

public class Main {
    public static void main(String[] args) {

//        Swimable[] swimables = {
//                new Duck(),
//                new Duck(),
//                new Duck(),
//                new Duck(),
//                new Duck(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//        };
//        for(Swimable swimable: swimables){
//            if(swimable.getClass().getName().equals("Duck")){
//                swimable.swim();
//            }
//            else if(swimable instanceof Turtle){
//                swimable.swim();
//            }
//            else{
//                swimable.swim();
//            }
//        }

        Bakedable[] bakedables = {
                new Pie(),
                new Bun(),
                new Break()
        };
        for (Bakedable baked: bakedables) {
            if(baked instanceof Break){
                baked.baked();
            }else if(baked instanceof Bun){
                baked.baked();
            }else{
                baked.baked();
            }

        }
    }
}