public class DiscoDuro implements DispositivosAlmacenamiento{

    private String nombre;

    private String capacidadAlmacenamiento;

    private String contenido;

    private String tipoDeDisco;

    private final String TIPO_DE_LECTURA = "cabezal magnético";

    public DiscoDuro(String nombre, String capacidadAlmacenamiento, String contenido, String tipoDeDisco) {
        this.nombre = nombre;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.contenido = contenido;
        this.tipoDeDisco = tipoDeDisco;
    }

    @Override
    public void giro() {
        System.out.println("CDs del disco duro girando");
    }

    @Override
    public void guardarDatos(String datos) {
        contenido += " " + datos;
        System.out.println("El disco duro ha guardado estos datos: " + datos);
    }

    @Override
    public void leerDatos() {
        System.out.println("Contenido: Los datos que tiene el disco duro son: " + contenido + ", y lo lee mediante: " + TIPO_DE_LECTURA);
    }

    @Override
    public void infoAlmacenamiento() {
        System.out.println("Su nombre es: " + nombre + ", su capacidad de almacenamiento es: " + capacidadAlmacenamiento
                + ", su contenido es: " + contenido + ", y su tipo de disco es: " + tipoDeDisco);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTipoDeDisco() {
        return tipoDeDisco;
    }

    public void setTipoDeDisco(String tipoDeDisco) {
        this.tipoDeDisco = tipoDeDisco;
    }

    public String getTIPO_DE_LECTURA() {
        return TIPO_DE_LECTURA;
    }
}
