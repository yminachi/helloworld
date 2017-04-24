#!groovy

pipeline {
    agent any

    stages {
        docker.withRegistry("https://311142959634.dkr.ecr.us-east-1.amazonaws.com/microservice-test", "ecr:us-east-1:SOMEID") {
            stage("Gradle Build") {
                steps {
                    echo "Building Gradle..."
                    sh "./gradlew clean build"
                }
            }

            sh "git rev-parse HEAD > .git/commit-id"
            def commit_id = readFile('.git/commit-id').trim()
            println "commit : ${commit_id}"

            stage "Build Docker"
            def app = docker.build "helloworld"

            stage "Deploy Docker"
            app.push "${commit_id}"
        }
    }
}