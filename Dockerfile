FROM eclipse-temurin:25-jdk
COPY text.txt /text.txt
COPY src/main/java/org/fungover/Demo.java /Demo.java
ENTRYPOINT ["java", "/Demo.java"]