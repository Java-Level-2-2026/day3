import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

void main() {
    try {
        Path path = Paths.get(System.getProperty("user.home"), "example.txt");
        List<String> lines = Files.readAllLines(path);
        lines.forEach(IO::println);
    } catch (IOException e) {
        e.printStackTrace(System.err);
    }
}