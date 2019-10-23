package com.cuongtt.game101;

public class KinematicWandering {
    private Kinematic charater;
    private final double MAX_SPEED = 10;
    private final double MAX_ROTATION = Math.PI;

    public KinematicWandering() {
    }

    public KinematicWandering(Kinematic charater) {
        this.charater = charater;
    }

    public Kinematic getCharater() {
        return charater;
    }

    public void setCharater(Kinematic charater) {
        this.charater = charater;
    }

    public KinematicOutput getKinemacticOutput(){
        KinematicOutput kinematicOutput = new KinematicOutput();

        kinematicOutput.setLinear(Vector2D.asVector2D(this.charater.getOrientation()).mul(this.MAX_SPEED) );

        kinematicOutput.setAngular((Math.random()-Math.random())*this.MAX_ROTATION);

        return kinematicOutput;
    }
}
