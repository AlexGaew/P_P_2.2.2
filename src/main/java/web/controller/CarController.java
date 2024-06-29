package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDaoListImpl;
import web.service.CarsServiceImpl;

@Controller
public class CarController {

    private final CarsServiceImpl carsService;

    @Autowired
    public CarController(CarsServiceImpl carsDaoListImpl) {
        this.carsService = carsDaoListImpl;
    }

    @GetMapping(value = "/cars")
    public String printInfoCar(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        if (count != null) {
            model.addAttribute("carInfo", carsService.getAnyCarByCount(Integer.parseInt(count)));
        } else if (count == null || Integer.parseInt(count) > 5) {
            model.addAttribute("carInfo", carsService.getAllCars());
        }
        return "car/carInfo";
    }


}
