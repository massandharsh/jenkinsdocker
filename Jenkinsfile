pipeline{
    agent any
    tools{
        maven "maven"
    }
    stages{
       //CI
       stage("SCM checkout"){
        steps{
            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '1edb40b7-e3ea-4d72-937c-6b1a59604b99', url: 'https://github.com/massandharsh/CI-CD.git']])
        }
       }
       stage("Build Process"){
           steps{
               bat "mvn clean install"
           }
       }

       //CD
       stage("Build Image"){
            steps{
                bat "docker build -t kratos2/jenkins-docker:1.0 ."
            }
       }


    }
}


//SCM checkout
//build
//deploy War
//EMAIl