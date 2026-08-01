import org.apache.commons.io.FileUtils;

void main() {
    var file = new File(System.getProperty("user.home"), "example.txt");
    try {
        List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
        lines.forEach(IO::println);
    } catch (IOException e) {
        e.printStackTrace(System.err);
    }
}