package animal;

class Perro extends Animal {

    public Perro(String nombre) {
    super(nombre);    
    }


    @Override
    public String sonido() {

        return "guau";

    }
    
}
