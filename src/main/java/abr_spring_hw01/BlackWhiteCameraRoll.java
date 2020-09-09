package abr_spring_hw01;

import org.springframework.stereotype.Component;

@Component("blackWhiteCameraRoll")
public class BlackWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("save a black-white photo");
    }
}
