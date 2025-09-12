package tp5.e6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Santiago Nievas", "11-2233-4455");
        Mesa mesa12 = new Mesa(12, 4);

        Reserva r1 = new Reserva(
                LocalDate.of(2025, 9, 12),
                LocalTime.of(20, 30),
                cli,
                mesa12
        );

        System.out.println(r1);

        // Otra reserva con otra mesa (demuestra la agregación)
        Mesa mesa5 = new Mesa(5, 2);
        Reserva r2 = new Reserva(LocalDate.now(), LocalTime.of(21, 0), cli, mesa5);
        System.out.println(r2);
    }
}