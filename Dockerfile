FROM eclipse-temurin:25-jdk
COPY text.txt /text.txt
COPY target/classes/org/fungover/Main.class /app/org/fungover/Main.class
ENTRYPOINT ["java", "--class-path", "/app", "org.fungover.Main"]