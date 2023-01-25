package baked;

public class Bun implements Bakedable{
    @Override
    public void baked() {
        System.out.println("Булочка жаш балдардын суйуктуу тамагы деп эсептесек болот");
    }

    @Override
    public String toString() {
        return "Bun{}";
    }
}
