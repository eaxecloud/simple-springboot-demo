# simple-springboot-demo
This is a simplest spring boot project, just for practice Git, DevOps, etc. Free to use.

# How to use

## Download project 

`git clone https://github.com/eaxecloud/simple-springboot-demo.git `

You need install lombok library on your IDE, or remove @Data annotation and add setter and getter methods in xyz.fullstacks.demo.domain.User.java

## Run project

Example on STS.

Right click the project and show a context menu,  then choose Run AS > Spring Boot App menu.

You can change port in $PROJECT/src/main/resources/application.yml



## Access H2 database

Access `http://localhost:8001/h2` 

username：sa

password: 123456

The H2 database is initialize a table and insert 2 records in to the table when project start.



## Test project

1. Query all users

   Access URL `http://localhost:8001/user/` on Browser, PostMan, etc.

   OR  

   ```shell
   curl http://localhost:8001/user/
   ```

   Output sample:

   ```json
   [{"id":1,"name":"root","email":"root@email.com","age":20},{"id":2,"name":"Peter","email":"peter@email.com","age":22}]
   ```

2. Get user

   ```shell
   curl http://localhost:8001/user/1
   ```

   Sample ouput

   ```json
   {"id":1,"name":"root","email":"root@email.com","age":20}
   ```

3. Add user

   ```shell
   curl -H "Content-Type: application/json" -X POST -d '{"id":4,"name":"Tom","email":"tom@email.com","age":24}' "http://localhost:8001/user/"
   ```

   Remind, if you run the curl command and post JSON data on Window OS, please using below format

   ```shell
   curl -H "Content-Type:application/json;charset=UTF-8" -X POST -d "{"""id""":4,"""name""":"""Tom""","""email""":"""tom@email.com""","""age""":24}" "http://localhost:8001/user/"
   ```

   Otherwise, it will throw error like below, and add user fail.

   ```shell
   curl -H "Content-Type: application/json" -X POST -d '{"id":4,"name":"Tom","email":"tom@email.com","age":24}' "http://localhost:8001/user/"
   {"timestamp":"2021-11-24T04:23:44.871+00:00","status":400,"error":"Bad Request","path":"/user/"}
   ```

   

4. Update user

   ```shell
   curl -H "Content-Type:application/json" -X PUT -d "{"""id""":4,"""name""":"""Tom""","""email""":"""tom@email.com""","""age""":18}" "http://localhost:8001/user/"
   {"id":4,"name":"Tom","email":"tom@email.com","age":18}
   ```

   

5. Delete user

   ```shell
   curl -X DELETE http://localhost:8001/user/4
   ```

   
