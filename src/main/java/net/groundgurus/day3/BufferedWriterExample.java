void main() throws IOException {
    String homeDir = System.getProperty("user.home");
    String file = homeDir + File.separator + "example.txt";
    try (
            var fos = new FileOutputStream(file);
            var bw = new BufferedWriter(new OutputStreamWriter(fos))
    ) {
        bw.write("Hello World");
    }
}