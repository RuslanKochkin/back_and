package de.ait.model;

public class Camera {
    private CameraRoll cameraRoll;
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }
    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
        public CameraRoll getCameraRoll() {
        return cameraRoll;
    }
}
