package tutorial.car_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tutorial.car_service.Entity.Car;

@Repository
public interface ICarRepository extends JpaRepository<Car,Long> {
}
