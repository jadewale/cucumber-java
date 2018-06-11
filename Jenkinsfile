pipeline {
    agent any
    tools {
        maven 'apache-maven-3.0.1'
    }
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