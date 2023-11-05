package de.ait;

import de.ait.model.Camera;
import de.ait.model.CameraRoll;
import de.ait.model.ColorCameraRoll;

public class Client {
        public static void main(String[] args) {
            Camera camera = new Camera();
            CameraRoll cameraRoll = new ColorCameraRoll();
            camera.setCameraRoll(cameraRoll);
            camera.doPhotograph();
        }
    }
