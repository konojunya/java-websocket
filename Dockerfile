FROM dayreiner/centos7-tomcat8
MAINTAINER konojunya <junya.developer@gmail.com>

ADD ./build/libs/websocket.war ./webapps

EXPOSE 8080 8009
