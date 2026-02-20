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

script {

git branch: 'main', url: 'https://github.com/adithi2000/scientific-calculator-miniproj.git'

}

}

}


stage('Debug workspace') {

steps {

sh 'ls -l'

}

}


stage('Maven build') {
 steps {
 sh "docker run --rm -v ${WORKSPACE}:/app -w /app maven:3.9.6-eclipse-temurin-17 mvn clean package"
}
}
 
stage('Build Docker image') {
}
steps {
}
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


}

}
