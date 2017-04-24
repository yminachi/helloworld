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
                echo "Building Docker Image"
                sh "./gradlew buildDocker"
            }
        }

        stage("Deploy Docker") {
            steps  {
                echo "Pushing Docker Image To ECR"
                sh "ci/push-to-ecr.sh"
            }
        }
    }
}