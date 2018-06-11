pipeline {
    agent any
   
    stages {
        stage('build') {
            steps {
                sh ''' echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
                '''
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