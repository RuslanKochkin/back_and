package de.ait.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(name="blackAndWhiteCamera")
    public Camera cameraBlackAndWhite(@Qualifier("BlackAndWhiteCameraRoll") CameraRoll cameraRoll) {
        Camera camera = new Camera();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
    @Bean(name="colorCamera")
    public Camera cameraColor(@Qualifier("ColorCameraRoll") CameraRoll cameraRoll) {
        Camera camera = new Camera();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }

}
