#!groovy

pipeline {
    agent any

    stages {
        stage("Gradle Build") {
            steps {
                echo "Building Gradle..."
                sh "./gradlew clean build"
            }
        }

        stage("Build Docker") {
            steps {
                echo "Build Docker Image"
                docker.build('helloworld')
            }
        }

        stage("Deploy Docker") {
            steps {
                echo "Deploy Docker Image"
                docker.withRegistry("https://311142959634.dkr.ecr.us-east-1.amazonaws.com/microservice-test", "ecr:us-east-1:SOMEID") {
                    docker.image('helloworld').push('latest')
                }
            }
        }
    }
}