package User_Service_cloud.user_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tutorial.user_service.Enity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
}

