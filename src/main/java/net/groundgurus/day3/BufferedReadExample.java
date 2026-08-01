void main() throws IOException {
    // try-with-resources
    try (
        var fis = new FileInputStream("src/main/java/net/groundgurus/day3/FISExample.java");
        var br = new BufferedReader(new InputStreamReader(fis))
    ) {
        String data = br.readLine();
        while (data != null) {
            IO.println(data);
            data = br.readLine();
        }
    }
}