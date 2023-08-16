package tutorial.bike_service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorial.bike_service.Entity.Bike;
import tutorial.bike_service.Repository.IBikeRepository;

import java.util.List;

@Service
public class BikeService implements IBikeService {

    @Autowired
    private IBikeRepository repoBike;

    @Override
    public List<Bike> listBike() {
        List<Bike> list=repoBike.findAll();
        return list;
    }

    @Override
    public Bike oneBike(Long id) {
        Bike bi=repoBike.findById(id).orElse(null);
        return bi;
    }

    @Override
    public Bike saveBike(Bike bike) {
        Bike bi1=repoBike.save(bike);
        return bi1;
    }
}
