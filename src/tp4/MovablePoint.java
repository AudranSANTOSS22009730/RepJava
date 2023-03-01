package tp4;

public class MovablePoint extends Point {

    private static float xSpeed;
    private static float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

     public MovablePoint(float xSpeed, float ySpeed) {
        super(xSpeed, ySpeed);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super(xSpeed, ySpeed);
        ySpeed = 0.0f;
        xSpeed = 0.0f;
    }

    public float getXSpeed() {
        return xSpeed;

    }
    public void setX(float x) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public float[] setSpeed() {
        float[] result = new float[2];
        result[0] = xSpeed;
        result[1] = ySpeed;
        return result;
    }
    public String toString() {
        return "(" + getX() + "," + getY() + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
    
   
    }
}