#!groovy

node {
    def commit_id
    def app

    docker.withRegistry("https://311142959634.dkr.ecr.us-east-1.amazonaws.com/microservice-test", "ecr:us-east-1:SOMEID") {
        stage("Pull Code") {
            echo "Pulling the Code"
            checkout scm
        }

        stage("Gradle Build") {
            echo "Building Gradle..."
            sh "./gradlew clean build"

            sh "git rev-parse HEAD > .git/commit-id"
            commit_id = readFile('.git/commit-id').trim()
            println "commit : ${commit_id}"
        }

        stage("Build Docker") {
            app = docker.build "311142959634.dkr.ecr.us-east-1.amazonaws.com/microservice-test"
        }

        stage("Deploy Docker") {
            app.push "${commit_id}"
        }
    }
}