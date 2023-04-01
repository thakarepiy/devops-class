# Pull tomcat latest image compatible with jre11-alpine
FROM tomcat:latest-jre11-alpine
MAINTAINER satyam@gmail.com
# copy war file on to container
COPY ./target/devops-class*.jar  /usr/local/tomcat/webapps
EXPOSE  8080
USER devops
WORKDIR /usr/local/tomcat/webapps
CMD ["catalina.sh","run"]
