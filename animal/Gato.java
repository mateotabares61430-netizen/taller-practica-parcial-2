package animal;

class Gato extends Animal {

    public Gato(String nombre) {
    super(nombre);    
    }


    @Override
    public String sonido() {
        return "Miau";

    }    
       
}
