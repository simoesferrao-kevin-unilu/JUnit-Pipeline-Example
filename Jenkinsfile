pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Get the code from github
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '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', url: 'https://github.com/simoesferrao-kevin-unilu/JUnit-Pipeline-Example.git']]])
            }
        }
        stage('Build') {
            steps {
                // Build the application
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run the tests
                sh 'mvn test'
            }
        }
    }
}