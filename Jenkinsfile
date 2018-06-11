pipeline {
    agent { docker { image 'maven:3.3.9' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
            always {
                echo 'This will always run'
            }
            success {
                echo 'This will run only if successful'
            }
     }
}