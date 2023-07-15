package dateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTime {

    public static void main(String[] args) {

        //obtengo fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual); //2023-07-14

        //obtengo fecha actual menos siete meses
        LocalDate fechaActualMenos7Meses = LocalDate.now().minusMonths(7);
        System.out.println(fechaActualMenos7Meses); //2022-12-14

        //obtengo fecha actual menos siete meses más dieciocho dias
        LocalDate fechaActualMenos5MesesMas18dias = LocalDate.now().minusMonths(7).plusDays(18);
        System.out.println(fechaActualMenos5MesesMas18dias); //2023-01-01

        //creo una fecha especifica
        LocalDate fechaMundialFutbol = LocalDate.of(2026, 6, 11);
        System.out.println(fechaMundialFutbol); //2026-06-11

        //calculo la diferencia en años entre la del mundial y la fecha actual
        System.out.println(fechaMundialFutbol.getYear() - fechaActual.getYear()); //3

        //calculo la diferencia en dias entre la del mundial y la fecha actual
        System.out.println(ChronoUnit.DAYS.between(fechaActual, fechaMundialFutbol)); //1063

        //calculo la diferencia en meses entre la del mundial y la fecha actual
        System.out.println(ChronoUnit.MONTHS.between(fechaActual, fechaMundialFutbol)); //34
    }
}
