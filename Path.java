import java.util.List;
import java.util.ArrayList;

public class Path {
    private List<Point> points;

    Path() {
        points = new ArrayList<>();
    }

    void addPoint(Point newPoint) {
        points.add(newPoint);
    }

    int size() {
        return this.points.size();
    }

    Point getPoint(int idx) {
        if (idx < 0 || idx >= this.size())
            return null;

        return this.points.get(idx);
    }
}
