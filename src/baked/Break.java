package baked;

public class Break implements Bakedable{

    @Override
    public void baked() {
        System.out.println("Нан жашообуздагы эн керектуу азык");
    }

    @Override
    public String toString() {
        return "Break{}";
    }
}
