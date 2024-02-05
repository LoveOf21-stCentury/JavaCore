FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./ ./src
RUN javac -sourcepath ./src -d ./out ./src/test/Test.java
RUN java -classpath ./out test.Test
RUN javadoc -d ./doc -sourcepath ./src -cp ./out -subpackages test
