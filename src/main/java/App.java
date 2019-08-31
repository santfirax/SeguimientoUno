import java.util.Scanner;

public class App {
    private static Scanner scanner;

    public static void main(String... args) {
        scanner = new Scanner(System.in);
        String month;
        month = scanner.nextLine();
        Months actividadDosConArreglo = new ActividadDosConArreglo(month);
        actividadDosConArreglo.chooseMonth();
        Months actividadDosConSwitch = new ActividadDosConSwitch(month);
        actividadDosConSwitch.chooseMonth();

    }
}
