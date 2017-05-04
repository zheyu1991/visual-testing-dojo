pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                //sh 'npm install'
                //sh 'selenium-standalone install'
                sh 'open selenium-standalone start'
            }
        }

        stage('test') {
            steps {
                sh 'npm run test'
            }
        }
    }
}