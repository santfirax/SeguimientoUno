import java.util.Arrays;
import java.util.List;

public class ActividadDosConArreglo implements Months {
    private List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
    private final String month;

    public ActividadDosConArreglo(String month) {
        this.month = month;
    }


    @Override
    public void chooseMonth() {
        int numberOfMonth = Integer.valueOf(month);
        numberOfMonth = --numberOfMonth;
        try {
            System.out.println(months.get(Integer.valueOf(numberOfMonth)));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El numero de mes ingresado no existe");
        }
    }
}
