FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD helloworld-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]