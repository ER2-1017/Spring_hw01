package abr_spring_hw01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("abr_spring_hw01")
public class AppConfig {

    @Bean(name = "camera")
    public Camera camera(CameraRoll cameraRoll){
        return new CameraImpl(cameraRoll);
    }
}
