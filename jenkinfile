pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('stage1') {
            steps {
                echo 'stage1'
            }
        }
        stage('stage2') {
            steps {
                bat 'dir'
                bat 'D:'
                bat 'cd D:/Siri/Softwares/'
                bat 'cd /d D:\\Siri\\Softwares && dir'

                bat 'dir'
                bat 'echo %cd%'
               bat '''
                    if not exist test (
                        echo Folder does not exist. Creating...
                        mkdir test
                    ) else (
                        echo Folder already exists. Skipping creation.
                    )
                    '''
                bat 'echo This is sample text. >example.txt'
            }
        }
    }
}
