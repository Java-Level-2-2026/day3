void main() throws IOException {
    // try-with-resources
    try (var fis = new FileInputStream("src/main/java/net/groundgurus/day3/FISExample.java")) {
        int data = fis.read();
        while (data != -1) {
            IO.print((char) data);
            data = fis.read();
        }
    }
}