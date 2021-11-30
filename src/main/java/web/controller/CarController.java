package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarService;
import web.models.Car;

import java.util.List;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String showPage(Model model, @RequestParam(value = "count", required = false) Integer count) {
        CarService carService = new CarService();
        List<Car> cars = carService.getAllCars();
        if (count != null && count >= 2) {
            cars = carService.getCars(count);
        }
        model.addAttribute("cars", cars);
        return "carsList";
    }

}
