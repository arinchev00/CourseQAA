package ru.arinchev;

// extends - помогает присвоить класс к какому либо значению (Весь чай - жидкость)

public class Ice extends Liquid {

    public Ice(int temp) {
        super(temp);
    }

    Ice iceType () {
        if (temp < 0) {
            System.out.println("Еще лед");
        }
        else if (temp >= 100) {
            System.out.println("Стал паром");
        }
        else {
            System.out.println("Стал жидкостью");
        }
        return this;
    }
}
