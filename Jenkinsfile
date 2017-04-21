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

        stage("???") {
            steps {
                echo "..."
            }
        }

        stage("Unicorns") {
            steps {
                echo "Unicorns!"
            }
        }
    }
}