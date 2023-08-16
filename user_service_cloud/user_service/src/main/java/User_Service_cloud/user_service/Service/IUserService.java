package User_Service_cloud.user_service;

import tutorial.user_service.Enity.User;
import tutorial.user_service.Modelo.Bike;
import tutorial.user_service.Modelo.Car;

import java.util.List;

public interface IUserService {

    public List<User>getAll();

    public User getUser(int id);

    public User saveUser(User user);

    public List<Car> getCars(int userId);
    public List<Bike> getBike(int userId);
}
