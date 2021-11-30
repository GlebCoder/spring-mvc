package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", 3, "white"));
        cars.add(new Car("BMW", 7, "black"));
        cars.add(new Car("Mercedes", 600, "black"));
        cars.add(new Car("Hyundai", 721, "grey"));
        cars.add(new Car("Skoda", 44, "blue"));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars(int number) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            result.add(cars.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        CarService carService = new CarService();
        System.out.println(carService.getAllCars());
        System.out.println(carService.getCars(2));
    }
}
