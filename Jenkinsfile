#!groovy

pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                echo "Building..."
                sh "./gradlew clean build"
            }
        }

        stage("Test") {
            steps {
                echo "Testing..."
                sh "./gradlew test"
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