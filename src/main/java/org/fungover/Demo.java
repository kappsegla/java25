void main() throws IOException {
    IO.println("Hello World");
    Files.lines(Path.of("text.txt")).forEach(System.out::println);
    String input = IO.readln("Enter some text: ");
    IO.println(input);
}