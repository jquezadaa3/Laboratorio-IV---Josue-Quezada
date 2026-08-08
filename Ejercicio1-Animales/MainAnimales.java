abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public String getNombre() {
        return nombre;
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}

public class MainAnimales {
    public static void main(String[] args) {
        Animal[] animales = new Animal[2];
        animales[0] = new Perro("Firulais");
        animales[1] = new Gato("Michi");

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
