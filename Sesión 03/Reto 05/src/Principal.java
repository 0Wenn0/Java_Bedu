public class Principal {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P123456");
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento con objeto Pasajero
        vuelo1.reservarAsiento(pasajero1);
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelar reserva
        vuelo1.cancelarReserva();
        System.out.println(vuelo1.obtenerItinerario());

        // Reservar nuevamente con nombre y pasaporte
        vuelo1.reservarAsiento("Mario Gonzalez", "P789012");
        System.out.println(vuelo1.obtenerItinerario());
    }
}
