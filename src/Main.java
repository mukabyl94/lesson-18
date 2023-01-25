public class Main {
    public static void main(String[] args) {

        Swimable[] swimables = {
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
        };
        for(Swimable swimable: swimables){
            if(swimable.getClass().getName().equals("Duck")){
                swimable.swim();
            }
            else if(swimable instanceof Turtle){
                swimable.swim();
            }
            else{
                swimable.swim();
            }
        }
    }
}