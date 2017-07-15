# Spring Cloud Stream Demo
[Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) running [Spring Cloud Stream](http://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/) with [RabbitMQ](https://www.rabbitmq.com/).

### Install RabbitMQ message broker
This assumes you already have [docker](https://www.docker.com/) installed.

Start a RabbitMQ instance with docker:

`docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3.6.10-management`

On your browser go to <http://localhost:15672> and login with 'guest / guest'

### Applications
In order to trigger the message flow send a http post with `curl --data "message=Hello World" localhost:8080/message`.
You should be able to see 'Message: Hello World - 2017-07-15T16:38:28.667' on both applications

#### [rest-client](/rest-client)
Accept post requests and send a message to be proccessed.

#### [worker](/worker)
Responsible for processing messages and send back.
