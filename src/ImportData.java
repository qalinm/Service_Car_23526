import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ImportData {
    public List<Car> importCars(String Filename) {
        List<Car> cars = new ArrayList<>();
        try {
            File file = new File("src/car_list_c8.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 4) {
                    String company = data[0].trim();
                    String model = data[1].trim();
                    int year = Integer.parseInt(data[2].trim());
                    int yearStop = Integer.parseInt(data[3].trim());
                    Car car = new Car(company, model, year, yearStop);
                    cars.add(car);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Błąd podczas wczytywania pliku: " + e.getMessage());
        }
        return cars;
    }
}


//test pull request