import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImportData importData = new ImportData();
        List<Car> cars = importData.importCars("car_list.txt");

        System.out.println("Lista wszystkich aut z numeracją:");
        displayCarListWithNumbering(cars);

        System.out.println("\nPodaj nazwę firmy (company) do filtrowania:");
        Scanner scanner = new Scanner(System.in);
        String filterCompany = scanner.nextLine();
        scanner.close();

        List<Car> filteredCars = filterCarsByCompany(cars, filterCompany);
        System.out.println("\nLista aut po filtrowaniu dla firmy " + filterCompany + ":");
        displayCarListWithNumbering(filteredCars);
    }


    private static void displayCarListWithNumbering(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + ": " + cars.get(i));
        }
    }

    private static List<Car> filterCarsByCompany(List<Car> cars, String company) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCompany().equalsIgnoreCase(company)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}




