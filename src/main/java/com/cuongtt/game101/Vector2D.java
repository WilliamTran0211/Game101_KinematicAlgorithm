package com.cuongtt.game101;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D() {
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector2D vector2D = (Vector2D) o;

        if (Double.compare(vector2D.x, x) != 0) return false;
        return Double.compare(vector2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public Vector2D add(Vector2D vectorB){
        this.x += vectorB.getX();
        this.y += vectorB.getY();

        return this;
    }

    public static Vector2D add(Vector2D vectorA, Vector2D vectorB){

        double tempX = vectorA.getX() + vectorB.getX();
        double tempY = vectorA.getY() + vectorB.getY();

        return new Vector2D(tempX, tempY);
    }

    public Vector2D sub(Vector2D vectorB){
        this.x -= vectorB.getX();
        this.y -= vectorB.getY();

        return this;
    }

    public static Vector2D sub(Vector2D vectorA, Vector2D vectorB){
        double tempX = vectorA.getX() - vectorB.getX();
        double tempY = vectorA.getY() - vectorB.getY();

        return new Vector2D(tempX, tempY);
    }

    public Vector2D mul(double cons){
        this.x *= cons;
        this.y *= cons;

        return this;
    }

    public static Vector2D mul(Vector2D oldVector, double cons){
        Vector2D newVector = new Vector2D();

        newVector.setX(oldVector.getX()*cons);
        newVector.setY(oldVector.getY()*cons);

        return newVector;

    }

    public static Vector2D asVector2D(double angle){
        return new Vector2D(Math.sin(angle), Math.cos(angle));
    }

    public void normalize(){
        double lengthSquared = Math.sqrt( Math.pow(this.x, 2) + Math.pow(this.y, 2));

        this.x = this.x / lengthSquared;
        this.y = this.y / lengthSquared;
    }

    public static Vector2D normalize(Vector2D v) {
        double lenghtSquared = Math.sqrt( Math.pow(v.getX(), 2) + Math.pow(v.getY(), 2) );

        return new Vector2D(v.getX() / lenghtSquared, v.getY() / lenghtSquared );
    }

}
