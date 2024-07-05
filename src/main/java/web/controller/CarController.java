package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImpl;

@Controller
public class CarController {

    private final CarsServiceImpl carsService;

    @Autowired
    public CarController(CarsServiceImpl carsDaoListImpl) {
        this.carsService = carsDaoListImpl;
    }

    @GetMapping(value = "/cars")
    public String printInfoCar(ModelMap model, @RequestParam(name = "count", defaultValue = "100",
            required = false) Integer count) {
        model.addAttribute("carInfo", carsService.getAnyCarByCount(count));
        return "car/carInfo";
    }
}
