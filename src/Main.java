public class Main {
    public static void main(String[] args) {
        CD cd = new CD("sony", "20 GB",
                "Bienvenido a este disco", "CD-ROM");
        DiscoDuro discoDuro = new DiscoDuro("Seagate", "500 GB",
                "Bienvenido al disco duro", "SSD");

        cd.giro();

        cd.guardarDatos("Esto es una prueba");

        cd.leerDatos();

        cd.infoAlmacenamiento();

        discoDuro.giro();

        discoDuro.guardarDatos("Esto es para probar");

        discoDuro.leerDatos();

        discoDuro.infoAlmacenamiento();

        //¿Si tienes clases de las que heredas se aplicarían a LP y BlueRay? Si es así, extiende las nuevas
        //clases. Si no es así, ¿deberías modificarla o ampliar una clase abstracta diferente?

        //En el caso de blueRay puede extender a CD,
        // en el caso del vinilo hay que hacer otra clase aparte que implemente tambien a dispositivos de almacenamiento.

        //Esta conclusión es si en el vinilo se pueden guardar datos que no sean solo música.
        //En cuyo caso habría que hacer una clase completamente diferente.


        BlueRay blueRay = new BlueRay("panasonic", "30 GB",
                "Bienvenido a este disco BlueRay", "BD-R");

        blueRay.giro();

        blueRay.guardarDatos("Esto es para el blueRay");

        blueRay.leerDatos();

        blueRay.infoAlmacenamiento();

        DiscoVinilo discoVinilo = new DiscoVinilo("Stateside", "650 MB",
                "Bienvenido al antiguo vinilo", "LP");

        discoVinilo.giro();

        discoVinilo.guardarDatos("Esta música pertenece a Melendi");

        discoVinilo.leerDatos();

        discoVinilo.infoAlmacenamiento();

        //¿Qué pasa con las ruedas y los frisbees? También son discos giratorios, pero no se utilizan para
        //el almacenamiento de datos. ¿Cómo entrarían en este modelo de clases?

        //Yo creo que habría que hacerle una interfaz aparte a la cual implementan los dos, tanto frisbee como rueda,
        //y solo tendrían los metodos giro y infoDisco.

        Frisbee frisbee = new Frisbee("Decathlon", "Plástico");

        frisbee.giro();

        frisbee.infoDisco();

        Rueda rueda = new Rueda("Michelin", "Goma");

        rueda.giro();

        rueda.infoDisco();

        //Analiza ahora el ejercicio completo desde el punto de vista que plantean los principios SOLID, si
        //los conoces. ¿Se cumplen todos? Elabora un breve informe con tus razones.

        //Yo creo que sí, ya que yo creo que el contenido que tiene este proyecto esta bien
        // sintetizado y no puesto variables o métodos innecesarios, tiene una escalabilidad sencilla,
        // y se puede entender su funcionalidad con solo mirar su código.

    }
}