package tutorial.car_service.Service;

import tutorial.car_service.Entity.Car;

import java.util.List;

public interface ICarService {

    public List<Car> listCar();
    public Car getCar(Long id);
    public Car saveCar(Car car);
}
