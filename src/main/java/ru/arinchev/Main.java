package ru.arinchev;

public class Main {

    static SubZero subZero = new SubZero();

    public static void main(String[] args) {
        Ice ice = new Ice(80);

        ice.sayType();
        ice.iceType().iceType().iceType();

        Liquid.type = "Смена типа";

        ice.sayType();

        int tempIce = ice.getTemp();
        System.out.println(tempIce);

        System.out.println(ice.temp);
        subZero.zamorozka(ice);
        System.out.println(ice.temp);
        System.out.println(ice.name);
    }
}
