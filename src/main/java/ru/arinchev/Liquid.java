package ru.arinchev;

// Чтобы изменить наименование класса везде надо нажать shift + f6 на наименование (изменится везде)

public class Liquid {
    int temp;
    static String type = "Лед";

    // конструктор, вызывается клавишами alt + insert
    public Liquid(int temp) {
        this.temp = temp;
    }

    /*public Liquid(int temp1) { -- Одинаковая запись (как сверху), для понимания работы конструктора
        temp = temp1;
    }*/

    int getTemp () {
        return temp;
    }

    void sayType (){
        System.out.println(type);
    }
}
