#!groovy

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Going to build my code now'
                sh "./gradlew clean assemble"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh "./gradlew clean test"
            }
        }
    }
}

