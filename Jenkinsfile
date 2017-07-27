pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build started'
      }
    }
    stage('Test') {
      steps {
        parallel(
          "Test": {
            echo 'Test started'
            
          },
          "Unit test": {
          try{
            sh 'mvn test'
            }catch(e){
            }
          }
        )
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deployed'
        junit(allowEmptyResults: true, testResults: '**/target/*-reports/*.xml')
      }
    }
  }
}