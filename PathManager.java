import java.util.List;
import java.util.ArrayList;

public class PathManager {
    List<Path> paths;

    PathManager() {
        paths = new ArrayList<>();
    }

    void savePath(Path newPath) {
        paths.add(newPath);
    }

    Path removePath(int idx) {
        return paths.remove(idx);
    }
}
