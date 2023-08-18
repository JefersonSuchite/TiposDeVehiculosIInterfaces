public class Vehiculos implements VehiculoAereos, VehiculosMaritimos, VehiculosTerrestres {

    @Override
    public String jet() {
        return "Un tipo de avión impulsado por motores de reacción. La creación de estos aviones generó grandes cambios en la industria aeronáutica ya que permitieron volar más alto y con una autonomía más amplia.";
    }

    @Override
    public String naveEspacial() {
        return "Un tipo de cohete diseñado y empleado específicamente para el transporte de carga útil desde la superficie terrestre al espacio exterior.";
    }

    @Override
    public String avion() {
        return "Un vehículo, provisto de alas y uno o varios motores, capaz de desplazarse por el aire.";
    }

    @Override
    public String acorazado() {
        return "Auque de guerra de gran tonelaje, fuertemente blindado y artillado con una batería principal compuesta por cañones de gran calibre. Los acorazados son más grandes y están mejor armados y blindados que los cruceros y los destructores.";
    }

    @Override
    public String ferry() {
        return "Embarcación que realiza alternativamente el mismo recorrido entre dos puntos; especialmente la de grandes dimensiones destinada al transporte de cargas pesadas o pasajeros.";
    }

    @Override
    public String submarino() {
        return "Un navío o buque capaz de navegar sobre la superficie del agua o debajo del agua.\nUsualmente usado para ambito militar y de investigacion.";
    }

    @Override
    public String automovil() {
        return "Un vehículo motorizado de cuatro ruedas diseñado principalmente para el transporte de personas y carga.";
    }

    @Override
    public String Autobus() {
        return "Un vehículo de transporte público diseñado para transportar a un gran número de pasajeros de un lugar a otro. Suele tener un cuerpo alargado y espacioso con capacidad para múltiples pasajeros.";
    }

    @Override
    public String ambulancia() {
        return "Un vehículo de emergencia especialmente equipado para el transporte rápido y seguro de personas enfermas o heridas hacia centros médicos.";
    }
    public void mostrarTerrestres() {
        System.out.println("Automóvil: " + automovil());
        System.out.println("Autobús: " + Autobus());
        System.out.println("Ambulancia: " + ambulancia());
    }

    public void mostrarAereos() {
        System.out.println("Jet: " + jet());
        System.out.println("Nave Espacial: " + naveEspacial());
        System.out.println("Avión: " + avion());
    }

    public void mostrarMarinos() {
        System.out.println("Acorazado: " + acorazado());
        System.out.println("Ferry: " + ferry());
        System.out.println("Submarino: " + submarino());
    }
}
