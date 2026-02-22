pipeline {
agent any

triggers {
githubPush()
}

environment {
DOCKER_IMAGE_NAME = 'scientific-calculator'
DOCKERHUB_REPO = 'adithip/scientific-calculator'
}

stages {

stage('Checkout') {
steps {
git branch: 'main', url: 'https://github.com/adithi2000/scientific-calculator-miniproj.git'
}
}

stage('Debug workspace') {
steps {
sh 'pwd'
sh 'ls -l'
sh 'ls -R'
}
}

stage('Maven build') {
steps {
sh "docker run --rm -v /var/lib/docker/volumes/jenkin_home/_data/workspace/scientific-calculator-miniProj:/app -w /app maven:3.9.6-eclipse-temurin-17 mvn clean package"
}
}

stage('Build Docker image') {
steps {
script {
docker.build("${DOCKER_IMAGE_NAME}", ".")
}
}
}

stage('Push Docker image to hub') {
steps {
script {
docker.withRegistry('https://index.docker.io/v1/', 'DockerhubID') {
sh "docker tag ${DOCKER_IMAGE_NAME} ${DOCKERHUB_REPO}:latest"
sh "docker push ${DOCKERHUB_REPO}:latest"
}
}
}
}

stage('Run Ansible Playbook') {
steps {
sh 'ansible-playbook -i inventory deploy.yml'
}
}

stage('View logs'){
steps{
sh 'docker ps'
sh 'docker logs calculator || true'
}
}

}
post {
    success {
        mail to: 'adithip2000@gmail.com',
             subject: "Build SUCCESS: ${env.JOB_NAME}",
             body: "The build was successful."
    }

    failure {
        mail to: 'adithip2000@gmail.com',
             subject: "Build FAILED: ${env.JOB_NAME}",
             body: "The build failed. Please check Jenkins."
    }
}
}









































