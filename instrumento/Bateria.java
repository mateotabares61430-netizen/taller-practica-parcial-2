package instrumento;

class Bateria extends Instrumento {

    public Bateria(String nombre, String origen) {
        super(nombre, origen);
    }

    @Override
    public void tocar() {
        System.out.println("🥁 " + nombre + " marca el ritmo: boom-tss-boom-boom-tss");
    }
}
