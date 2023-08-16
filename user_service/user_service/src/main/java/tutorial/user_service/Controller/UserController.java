package tutorial.user_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tutorial.user_service.Enity.User;
import tutorial.user_service.Modelo.Bike;
import tutorial.user_service.Modelo.Car;
import tutorial.user_service.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService repoUser;

    @GetMapping
    public ResponseEntity<List<User>>traerTodo(){
        List<User>users=repoUser.getAll();
        if (users.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(users);
    }
    @GetMapping("{id}")
    public ResponseEntity<User> oneUser(@PathVariable("id") int id){
        User use=repoUser.getUser(id);
        if (use==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(use);
    }
    @PostMapping()
    public ResponseEntity<User> saveNew(@RequestBody User user){
        User newUser=repoUser.saveUser(user);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/cars/userid")
    public ResponseEntity<List<Car>> getCars(@PathVariable("userid") int userid){
        User user=repoUser.getUser(userid);
        if (user==null){
            return ResponseEntity.notFound().build();
        }
        List<Car> cars=repoUser.getCars(userid);
        return ResponseEntity.ok(cars);
    }
    @GetMapping("/bikes/userid")
    public ResponseEntity<List<Bike>> getBikes(@PathVariable("userid") int userid){
        User user=repoUser.getUser(userid);
        if (user==null){
            return ResponseEntity.notFound().build();
        }
        List<Bike> bikes=repoUser.getBike(userid);
        return ResponseEntity.ok(bikes);
    }
}
