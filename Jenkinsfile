pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
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
            sh 'mvn test'
            
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
