package com.cuongtt.game101;

public class KinematicSeek {
    private Kinematic charater;
    private Kinematic target;
    private final double MAX_SPEED = 10;

    public KinematicSeek() {
    }

    public KinematicSeek(Kinematic charater, Kinematic target) {
        this.charater = charater;
        this.target = target;
    }

    public Kinematic getCharater() {
        return charater;
    }

    public void setCharater(Kinematic charater) {
        this.charater = charater;
    }

    public Kinematic getTarget() {
        return target;
    }

    public void setTarget(Kinematic target) {
        this.target = target;
    }

    public double getMAX_SPEED() {
        return MAX_SPEED;
    }

    public KinematicOutput getKinematicOutput(){
        KinematicOutput kinematicOutput = new KinematicOutput();
        kinematicOutput.setLinear(new Vector2D().sub(this.target.getPosition(), this.getCharater().getPosition()));
        kinematicOutput.getLinear().normalize();
        kinematicOutput.getLinear().mul(MAX_SPEED);
        kinematicOutput.setAngular(0);

        charater.setOrientation(charater.getNewOrientation(charater.getOrientation(), kinematicOutput.getLinear()));

        return kinematicOutput;
    }
}
