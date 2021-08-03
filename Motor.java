public class Motor {
    private int speed;
    private int limit = 500;

    int getSpeed() {
        return this.speed;
    }

    Motor() {
        speed = 0;
    }

    void setSpeed(int newSpeed) {
        if (newSpeed > this.limit && newSpeed < 0)
            return;
        this.speed = newSpeed;
    }

    void increaseSpeed(int incrementor) {
        this.setSpeed(this.speed + incrementor);
    }

    void decreaseSpeed(int decrementor) {
        this.setSpeed(this.speed - decrementor);
    }

}
