pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Get the code from github
                git 'https://github.com/simoesferrao-kevin-unilu/JUnit-Pipeline-Example.git'
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