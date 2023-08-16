package tutorial.bike_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tutorial.bike_service.Entity.Bike;

@Repository
public interface IBikeRepository extends JpaRepository<Bike,Long> {
}
