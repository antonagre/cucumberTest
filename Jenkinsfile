pipeline{

    agent any

    stages {

    stage ('Test Stage') {

            steps {

                withMaven(maven: '3.6.3') {
                    sh 'mvn test'

                }

            }
        }
    }
}
