#!groovy

pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                echo "Building..."
                ./gradlew clean build
            }
        }

        stage("Test") {
            steps {
                echo "testing"
            }
        }

        stage("??") {
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