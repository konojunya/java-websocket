# Java Websocket

## Docker Image

https://hub.docker.com/r/konojunya/java-websocket/

## Development

1. `gradle war`
2. `docker build -t <image name> .`
3. `docker run -p 8080:8080 <image name>`
4. Open your browser http://localhost:8080/websocket
