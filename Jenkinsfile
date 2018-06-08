pipeline {
    agent { docker { image 'maven:3.3.3' } }

    stages {
        stage('build') {
            steps {
                def mvn_version = 'M3' withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) { //sh "mvn test" }
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