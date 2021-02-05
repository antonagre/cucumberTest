<<<<<<< HEAD
pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {

                withMaven(maven: 'maven_3_5_0') {
                    sh 'mvn clean install'

                }

            }
        }
    stage ('Test Stage') {

            steps {

                withMaven(maven: 'maven_3_5_0') {
                    sh 'mvn test'

                }

            }
        }


        stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }

    }

=======
pipeline {
  agent any
  stages {
    stage('') {
      steps {
        sh 'mvn test'
      }
    }

  }
>>>>>>> 962c1427d2c56f44d9e62e24673ee81e0972ccaa
}