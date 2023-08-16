package tutorial.bike_service.Service;

import tutorial.bike_service.Entity.Bike;

import java.util.List;

public interface IBikeService {

    //Metodo para traer todas las Bike

    public List<Bike> listBike();

    //Metodo para traer una sola Bike

    public Bike oneBike(Long id);

    //Metodo para guardar una Bike

    public Bike saveBike(Bike bike);



}
