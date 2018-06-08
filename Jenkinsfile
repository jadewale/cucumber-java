pipeline {
  
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