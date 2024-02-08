FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./ ./src
RUN javac -sourcepath ./src -d ./out ./src/seminar1.test/Test.java
RUN java -classpath ./out seminar1.test.Test
RUN javadoc -d ./doc -sourcepath ./src -cp ./out -subpackages seminar1.test
