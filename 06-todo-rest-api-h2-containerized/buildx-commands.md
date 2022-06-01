# /Ranga/git/01.udemy-course-repos/deploy-spring-boot-aws-eb/06-todo-rest-api-h2-containerized
```
docker buildx build \
--platform linux/amd64,linux/arm64 \
-t in28min/todo-rest-api-h2:1.0.0.RELEASE \
--push \
.
```