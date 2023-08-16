package tutorial.bike_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tutorial.bike_service.Entity.Bike;
import tutorial.bike_service.Repository.IBikeRepository;
import tutorial.bike_service.Service.IBikeService;

import java.util.List;

@RestController
public class BikeController {

    @Autowired
    private IBikeService repoBike;

    @GetMapping("/bikes/traer")
    public ResponseEntity<List<Bike>>allBike(){
        List<Bike> bi= repoBike.listBike();
        if (bi.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(bi);
    }
    @GetMapping("/bikes/traer/´{id}")
    public ResponseEntity<Bike>OneBi(@PathVariable Long id){
        Bike bis=repoBike.oneBike(id);
        if (bis==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(bis);
    }
    @PostMapping("/bikes/crear")
    public ResponseEntity<Bike>saveBi(@RequestBody Bike bike){
        Bike bi=repoBike.saveBike(bike);
        return ResponseEntity.ok(bi);
    }
}
