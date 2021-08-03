public class Drone {
    Motor frontl1, frontl2, backr1, backr2;
    PathManager manager;

    Drone() {
        manager = new PathManager();
        frontl1 = new Motor();
        frontl2 = new Motor();
        backr1 = new Motor();
        backr2 = new Motor();
    }

    void moveForward(int speed) {
        // front slows down
        frontl1.setSpeed(speed / 2);
        frontl2.setSpeed(speed / 2);
        backr1.setSpeed(speed);
        backr2.setSpeed(speed);
    }

    void moveBackward(int speed) {
        // front slows down
        frontl1.setSpeed(speed);
        frontl2.setSpeed(speed);
        backr1.setSpeed(speed / 2);
        backr2.setSpeed(speed / 2);
    }

    void moveLeft(int speed) {
        frontl1.setSpeed(speed / 2);
        frontl2.setSpeed(speed);
        backr1.setSpeed(speed / 2);
        backr2.setSpeed(speed);
    }

    void moveRight(int speed) {
        frontl1.setSpeed(speed);
        frontl2.setSpeed(speed / 2);
        backr1.setSpeed(speed);
        backr2.setSpeed(speed / 2);
    }

    void moveUp(int incrementor) {
        frontl1.increaseSpeed(incrementor);
        frontl2.increaseSpeed(incrementor);
        backr1.increaseSpeed(incrementor);
        backr2.increaseSpeed(incrementor);
    }

    void moveDown(int decrementor) {
        frontl1.decreaseSpeed(decrementor);
        frontl2.decreaseSpeed(decrementor);
        backr1.decreaseSpeed(decrementor);
        backr2.decreaseSpeed(decrementor);
    }

    Path recreatePath(Point start, Path p) {
        Path recreatedPath = new Path();

        recreatedPath.addPoint(start);
        Point nextPoint = start;
        for (int i = 0; i < p.size() - 1; i++) {
            Point pi = p.getPoint(i);
            Point vector = pi.getVectorToNext(p.getPoint(i + 1));
            nextPoint = nextPoint.nextPoint(vector);
            recreatedPath.addPoint(nextPoint);
        }
        return recreatedPath;
    }

    Path createPath() {
        Path p = new Path();
        for (int i = 0; i < 1000; i++) {
            p.addPoint(getPoint());
        }

        return p;
    }

    Point getPoint() {
        return new Point(0, 0, 0);
    }
}
