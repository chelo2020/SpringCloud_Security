package tutorial.car_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tutorial.car_service.Entity.Car;
import tutorial.car_service.Service.CarService;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService repoCar;

    @GetMapping("/cars/traer")
    public ResponseEntity<List<Car>> listCar(){
        List<Car>list=repoCar.listCar();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }
    @GetMapping("/cars/traer/{id}")
    public ResponseEntity<Car> unCar(@PathVariable Long id){
        Car car=repoCar.getCar(id);
        if (car==null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(car);
    }
    @PostMapping("/cars/craer")
    public ResponseEntity<Car> saveNew(@RequestBody Car car){
        Car car2=repoCar.saveCar(car);
        return ResponseEntity.ok(car2);
    }

}
