public class Rueda implements Disco{

    private String nombre;

    private String material;

    public Rueda(String nombre, String material) {
        this.nombre = nombre;
        this.material = material;
    }

    @Override
    public void giro() {
        System.out.println("La rueda esta girando");
    }

    @Override
    public void infoDisco() {
        System.out.println("Esta es una rueda y su nombre es: " + nombre +
                " y esta hecho con este material: " + material);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
