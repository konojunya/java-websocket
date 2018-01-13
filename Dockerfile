FROM dayreiner/centos7-tomcat8
MAINTAINER konojunya <junya.developer@gmail.com>

RUN echo "<h1>hello from tomcat</h1>" > ./webapps/ROOT/index.jsp

EXPOSE 8080 8009
