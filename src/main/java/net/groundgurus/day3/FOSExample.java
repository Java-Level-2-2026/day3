void main() throws IOException {
    // TODO create a text file in the home directory of the current user???
    // Windows -> C:/Users/username
    // Linux/Mac -> /Users/username
    String homeDir = System.getProperty("user.home");

    // Path separator
    // Windows -> \
    // Linux/Mac -> /
//    System.getProperty("path.separator");
    String file = homeDir + File.separator + "example.txt";
    try (var fos = new FileOutputStream(file)) {
        fos.write(118); // letter 'v'
    }
}