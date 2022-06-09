package com.observer;

import Abstractfactory.AbstractFactory;
import Abstractfactory.FactoryProducer;
import Abstractfactory.Material;
import Command.Command;
import Command.MagicBoard;
import Decorator.*;
import Factorymethod.WheelsFactory;
import Factorymethod.ToyFactory;
import Factorymethod.ToyProduct;
import Factorymethod.PuppetFactory;
import Observer.Observer;
import Singleton.Singleton;
import Command.IneedWheelsCommand;
import Command.IneedPuppetsCommand;
import Command.MagicWordsBySantaClaus;
import Observer.Dwarves;
import Observer.DwarvesEmployees;

public class Main {

    public static void main(String[] args) {
        Singleton santaClaus = Singleton.getInstance(); // Singleton Pattern for creating Santa Claus
        santaClaus.postMessage("Santa Claus is ready for work. ");

        MagicBoard magicBoard = new MagicBoard();           // Command pattern for creating magic word, and  Santa's commands
        Command ineedWheelsCommand = new IneedWheelsCommand(magicBoard);
        Command ineedPuppetsCommand = new IneedPuppetsCommand(magicBoard);

        MagicWordsBySantaClaus words = new MagicWordsBySantaClaus();

        words.setCommand(ineedWheelsCommand);
        words.sayMagicWords();

        words.setCommand(ineedPuppetsCommand);
        words.sayMagicWords();

        System.out.println();

        Dwarves workerDwarf = new Dwarves();   // Използваме Шаблон Наблюдател
        Observer obs1 = new DwarvesEmployees("Dwarf 1");
        Observer obs2 = new DwarvesEmployees("Dwarf 2");
        Observer obs3 = new DwarvesEmployees("Dwarf 3");

        workerDwarf.hireDwarf(obs1);
        workerDwarf.hireDwarf(obs2);
        workerDwarf.hireDwarf(obs3);

        workerDwarf.hireDwarf("New dwarf is ready for work");
        workerDwarf.removeDwarf(obs1); // dwarf is fired - уволнено джудже
        workerDwarf.hireDwarf("Dwarf is ready for work: ");

        System.out.println("------------------------------------------");

        ToyFactory cheeseFactory = new WheelsFactory(); // Factory Method pattern

        ToyProduct wheel = cheeseFactory.produceProduct("BIKE");
        wheel = cheeseFactory.produceProduct("MOTORBIKE");


        ToyFactory puppetFactory = new PuppetFactory();
        ToyProduct puppet = puppetFactory.produceProduct("GIRL_PUPPET");
         puppet = puppetFactory.produceProduct("BOY_PUPPET");

        System.out.println("-------------------------------------------------");

        AbstractFactory materialFactory = FactoryProducer.getFactory("MATERIAL"); // AbstractFactory design pattern
        Material plastic = materialFactory.getMaterial("PLASTIC");
        plastic.produce();
        Material fabric = materialFactory.getMaterial("FABRIC");
        fabric.produce();

        System.out.println();

        Motorbike kawazaki = new Kawazaki();              // Decorator pattern
        kawazaki.create();

        Motorbike anotherKawazaki = new Kawazaki();
        Motorbike blueKawazaki = new GreenMotorbikeDecorator(anotherKawazaki);
        blueKawazaki.create();

        System.out.println();

        Motorbike suzuki = new Suzuki();              // Decorator pattern
        suzuki.create();

        Motorbike anotherSuzuki = new Suzuki();
        Motorbike blueSuzuki = new BlueMotorbikeDecorator(anotherSuzuki);
        blueSuzuki.create();

        System.out.println();

        Motorbike bmw = new BMWMotorbike();              // Decorator pattern
        bmw.create();

        Motorbike anotherBMW = new BMWMotorbike();
        Motorbike blueBMW = new BlueMotorbikeDecorator(anotherBMW);
        blueBMW.create();

        System.out.println("-----------------------------------------");


        Bike roadBike = new RoadBike(); //създаваме обект
        roadBike.create();

        Bike anotherRoadBike = new RoadBike();
        Bike blackRoadBike = new BlackBikeDecorator(anotherRoadBike);
        blackRoadBike.create();

        System.out.println();

        Bike electricBike = new ElectricBike(); //създаваме обект
        electricBike.create();

        Bike anotherElectricBike = new RoadBike();
        Bike blackElectricBike = new BlackBikeDecorator(anotherElectricBike);
        blackElectricBike.create();

        System.out.println();

        Bike mountainBike = new MountainBike(); //създаваме обект
        mountainBike.create();

        Bike anotherMountainBike = new RoadBike();
        Bike greenMountainBike = new GreenBikeDecorator(anotherMountainBike);
        greenMountainBike.create();

        System.out.println("==================================================");






    }

    }

