package tutorial.car_service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorial.car_service.Entity.Car;
import tutorial.car_service.Repository.ICarRepository;

import java.util.List;

@Service

public class CarService implements ICarService{

    @Autowired
    private ICarRepository repoCar;
    @Override
    public List<Car> listCar() {
        List<Car>listCar=repoCar.findAll();
        return listCar;
    }

    @Override
    public Car getCar(Long id) {
        Car oneCar=repoCar.findById(id).orElse(null);
        return oneCar;
    }

    @Override
    public Car saveCar(Car car) {
        Car saveCars=repoCar.save(car);
        return saveCars;
    }
}
