pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Build the application
                bat 'mvn clean compile'
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