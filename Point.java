public class Point {
    final private int x, y, z;

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point nextPoint(Point vector) {
        int newX = this.x + vector.x;
        int newY = this.y + vector.y;
        int newZ = this.z + vector.z;
        return new Point(newX, newY, newZ);
    }

    Point getVectorToNext(Point p2) {
        Point vector = new Point(p2.x - x, p2.y - y, p2.z - z);
        return vector;
    }
}
