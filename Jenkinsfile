#!groovy

node('jenkins-slave') {

    def app
    def tag

    docker.withRegistry("https://311142959634.dkr.ecr.us-east-1.amazonaws.com/microservice-test", "ecr:us-east-1:AWSCREDENTIALS") {
        stage("Pull Code") {
            echo "Pulling the Code"
            checkout scm
        }

        stage("Gradle Build") {
            echo "Building Gradle..."
            sh "./gradlew clean build"

            sh "git rev-parse HEAD > .git/commit-id"
            tag = readFile('.git/commit-id').trim().substring(0, 12)
            println "tag : ${tag}"
        }

        stage("Build Docker") {
            app = docker.build "311142959634.dkr.ecr.us-east-1.amazonaws.com/microservice-test"
        }

        stage("Publish Docker") {
            app.push "${tag}"
        }

        stage("Run deployment job") {
            build job: 'pegasus-infra stack deploy', parameters: [[
                $class: 'StringParameterValue',
                name: 'ECR_HELLOWORLD_IMAGE_TAG',
                value: "${tag}"
            ]]
        }
    }
}
