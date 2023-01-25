package baked;

import baked.Bakedable;

public class Pie implements Bakedable {
    @Override
    public void baked() {
        System.out.println("Пирогту биз кээде эле жейбиз");
    }

    @Override
    public String toString() {
        return "Pie{}";
    }
}
