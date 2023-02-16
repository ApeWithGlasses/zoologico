package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        animal1.setName("Cebra");
        animal1.setGender("F");


        Animal animal2 = new Animal();
        animal2.setName("Caballo");
        animal2.setGender("M");


        animal1.findPartner(animal2);


        Familia familia = new Familia();


        familia.tenerHijo("Cebarallo");


        familia.imprimirFamilia();




    }
}