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
    }
}