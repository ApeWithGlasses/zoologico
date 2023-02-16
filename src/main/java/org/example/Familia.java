package org.example;

public class Familia {


    private String dad = "Dinosaurin";
    private String mom = "Tiburosin";
    Animal son;

    public Familia() {

    }

    public Familia(String dad, String mom) {
        this.dad = dad;
        this.mom = mom;
    }

    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papa es: "+this.dad+
                        "\nLa mama es: "+this.mom+
                            "\nEl hijo es: "+this.son.getName()
        );

    }

    public void tenerHijo(String name){

        if(this.dad!=null){

            Animal son= new Animal();
            son.setName(name);
            son.setWeight(1);
            double random = Math.random();
            if(random<0.5){
                son.setGender("F");
            }else{
                son.gender="M";
            }
            this.son=son;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
