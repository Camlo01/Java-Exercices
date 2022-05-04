
public class Lasagna {

    private int remainingMinutesInOven;
    private int preparationTimeInMinutes;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int tiempoEnCocinar = 40;
        return tiempoEnCocinar;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int tiempoPasado) {
        int minutosTotales = expectedMinutesInOven();
        int tiempoFaltante = minutosTotales - tiempoPasado;
        return tiempoFaltante;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int capas) {

        int tiempoExtra = (capas * 2);

        return tiempoExtra;

    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timeSpend) {

        int total = (preparationTimeInMinutes(layers) + timeSpend);

        return total;

    }

}
