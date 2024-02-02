public class Frisbee implements Disco{

    private String nombre;

    private String material;

    public Frisbee(String nombre, String material) {
        this.nombre = nombre;
        this.material = material;
    }

    @Override
    public void giro() {
        System.out.println("El frisbee esta girando");
    }

    @Override
    public void infoDisco() {
        System.out.println("Este es un frisbee y su nombre es: " + nombre +
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
