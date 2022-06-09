package Factorymethod;

public class Bike extends ToyProduct {
    @Override
    public void prepare() {
        System.out.println("Preparing bike");
    }
}

/*
Шаблонът Factorymethod, от самото наименование означава фабрика. Във фабфриките се произвеждат различни видове стоки.
Във случая в програмирането Factorymethod се използва създаване на обекти. ВВъв случая създаваме обектите
"кукла" и "колело". За целта създаваме класове като toyFactory, WheelsFactory
 */