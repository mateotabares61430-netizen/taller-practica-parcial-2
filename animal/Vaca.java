package animal;

class Vaca extends Animal {

public Vaca(String nombre) {
    super(nombre);    
    }


    @Override
    public String sonido() {
        return "Muuu";
    }
    
}
