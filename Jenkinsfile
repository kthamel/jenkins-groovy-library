pipeline {
    agent any

    stages {
        stage('Stage_1') {
            steps {
                withGroovy {
                        sh 'groovy --version'        
                }
            }
        }

        stage('Stage_2') {
            steps {
                script {
                    echo "This is stage 2"
                    def branchName = "${env.BRANCH_NAME}"

                    if(branchName == "main")
                        println("Deploying to Prod")

                    else if(branchName == "develop")
                        println("Deploying to Dev")
                }
            }
        }
    }
}
