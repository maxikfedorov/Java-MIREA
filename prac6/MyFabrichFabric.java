package prac6;

public class MyFabrichFabric {
    public static void main(String[] args) {
        CarsFactory factory;
        factory = new ToyotaFactory();
        factory.createSedan();
    }
}

interface Sedan {}

interface Coupe {}

interface CarsFactory {
    Sedan createSedan();
    Coupe createCoupe();
}

 class ToyotaCoupe implements Coupe {
    public ToyotaCoupe() {
        System.out.println("Create ToyotaCoupe");
    }
}

 class ToyotaSedan implements Sedan {
    public ToyotaSedan() {
        System.out.println("Create ToyotaSedan");
    }
}

 class FordCoupe implements Coupe {
    public FordCoupe () {
        System.out.println("Create FordCoupe");
    }
}

 class FordSedan implements Sedan {
    public FordSedan() {
        System.out.println("Create FordSedan");
    }
}

class ToyotaFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new  ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}

class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new  FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}