pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/simoesferrao-kevin-unilu/JUnit-Pipeline-Example.git'
                // Build the application
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run the tests
                bat 'mvn test'
            }
        }
    }
}