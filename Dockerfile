FROM adoptopenjdk/maven-openjdk13

RUN mkdir -p /var/app/myblockchain-app/

WORKDIR /var/app


COPY / /var/app

RUN ls -la /var/app/

EXPOSE 8080

RUN cd /var/app/myblockchain-app/

RUN mvn install -f /var/app/myblockchain-vo/
RUN mvn install -f /var/app/myblockchain-entities/
RUN mvn install -f /var/app/myblockchain-app/

CMD [ "mvn", "exec:java", "-Dexec.mainClass=com.awsys.app.App", "-f", "/var/app/myblockchain-app/" ]