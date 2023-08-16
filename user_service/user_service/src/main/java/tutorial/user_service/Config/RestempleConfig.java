package tutorial.user_service.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import tutorial.user_service.Modelo.Car;

import java.util.List;

//En esta clase vamos a configurar para poder consumir dos servicios
@Configuration
public class RestempleConfig {

    @Bean
    public RestTemplate restTemplete(){
        return new RestTemplate();
    }


}
