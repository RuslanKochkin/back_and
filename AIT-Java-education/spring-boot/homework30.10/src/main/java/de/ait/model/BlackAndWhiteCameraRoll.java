package de.ait.model;

import org.springframework.stereotype.Component;

@Component("BlackAndWhiteCameraRoll")
public class BlackAndWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("+1 black-white image");
    }
}
