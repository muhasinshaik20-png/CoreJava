package com.info.HierarchicalInheritence;

class Ola {
    void ride() {
        System.out.println("Basic Ride Started");
    }
}

class OlaMini extends Ola {
    void miniFeatures() {
        System.out.println("Mini: AC + Comfortable seats");
    }
}

class OlaPrime extends Ola {
    void primeFeatures() {
        System.out.println("Luxury seats + Extra comfort");
    }
}

public class OlaMain {
    public static void main(String[] args) {
        OlaMini om = new OlaMini();
        om.ride();
        om.miniFeatures();

        OlaPrime op = new OlaPrime();
        op.ride();
        op.primeFeatures();
    }
}
