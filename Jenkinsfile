pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  tools { 
        maven 'maven-3.3.9' 
    }
  stages {
    stage('Build') {
      steps {
        echo 'Build started'
        echo 'PATH = ${PATH}'
        echo 'M2_HOME = ${M2_HOME}'
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
  environment {
    mvn = '/opt/apache-maven-3.3.9/bin'
  }
}
