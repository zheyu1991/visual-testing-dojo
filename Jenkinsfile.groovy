pipeline {
    agent any


    stages {
        stage('build') {
            steps {
                checkout([
                        $class : 'GitSCM',
                        branches: [[name: '*/master']],
                        uerRemoteConfigs: [[url:"https://github.com/zheyu1991/visual-testing-dojo"]]
                ])
                sh 'npm install gemini '
                sh 'npm install selenium-standalone'
                sh 'selenium-standalone install'
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