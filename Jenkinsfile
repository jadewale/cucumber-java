pipeline {
    agent { docker { image 'maven:3.3.3' } }
    tools {
            maven 'Maven 3.5.3'
       }
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