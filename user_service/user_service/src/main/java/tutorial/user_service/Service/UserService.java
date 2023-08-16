package tutorial.user_service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tutorial.user_service.Enity.User;
import tutorial.user_service.Modelo.Bike;
import tutorial.user_service.Modelo.Car;
import tutorial.user_service.Repository.IUserRepository;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository repoUser;

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<User> getAll() {
        List<User>listUser=repoUser.findAll();
        return listUser;
    }

    @Override
    public User getUser(int id) {
        User oneUser=repoUser.findById(id).orElse(null);
        return oneUser;
    }

    @Override
    public User saveUser(User user) {
        User guardar=repoUser.save(user);
        return guardar;
    }
    // Creo dos clases para poder usar los microservicios


    @Override
    public List<Car> getCars(int userId) {
        List<Car> car= restTemplate.getForObject("http://localhost:8081/cars/traer/"+
                userId, List.class);

        return car;
    }

    @Override
    public List<Bike> getBike(int userId) {
        List<Bike> bike= restTemplate.getForObject("http://localhost:8082/bikes/traer/"+
                userId, List.class);

        return bike;
    }
}
