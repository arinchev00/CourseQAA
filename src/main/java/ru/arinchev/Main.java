package ru.arinchev;

public class Main {
    public static void main(String[] args) {
        Ice ice = new Ice(80);

        ice.sayType();
        ice.iceType().iceType().iceType();

        Liquid.type = "Смена типа";

        ice.sayType();

        int tempIce = ice.getTemp();
        System.out.println(tempIce);
    }
}
