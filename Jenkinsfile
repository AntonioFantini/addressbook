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
        tool(name: 'maven', type: 'maven-3.3.9')
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