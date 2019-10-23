package com.cuongtt.game101;

public class Kinematic {
    private Vector2D position;
    private double orientation;
    private Vector2D velocity;
    private double rotaion;

    public Kinematic() {
    }

    public Kinematic(Vector2D position, float orientation, Vector2D velocity, float rotaion) {
        this.position = position;
        this.orientation = orientation;
        this.velocity = velocity;
        this.rotaion = rotaion;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    public double getRotaion() {
        return rotaion;
    }

    public void setRotaion(float rotaion) {
        this.rotaion = rotaion;
    }
}
