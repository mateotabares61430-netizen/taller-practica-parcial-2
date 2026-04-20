package instrumento;

class Piano extends Instrumento {

    public Piano(String nombre, String origen) {
        super(nombre, origen);
    }

    @Override
    public void tocar() {
        System.out.println("🎹 " + nombre + " presiona teclas: Do - Re - Mi - Fa - Sol");
    }
}