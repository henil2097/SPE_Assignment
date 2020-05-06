pipeline
{
    environment
    {
        registry = "henil2097/spe_calculator"
        registryCredential = 'DockerHub'
        dockerImage = ''
    }
    agent any
    stages
    {
        stage('Git-Checkout')
        {
            steps
            {
                echo 'Pulling the Maven Git repo'
                git "https://github.com/henil2097/SPE_Assignment.git"
            }
        }

        stage("Clean the maven project")
        {
            steps
            {
                echo "Cleaning the project"
                sh "mvn clean"
            }
        }

        stage("Compile the maven project")
        {
            steps
                {
                    echo "Compiling the project"
                    sh "mvn compile"
                }
        }

        stage("Test the project")
         {
            steps
            {
                echo "Testing the project"
                    sh "mvn test"
            }
         }

        stage("Install the project")
        {
            steps
            {
                echo "Installing the project"
                sh "mvn install"
            }
        }

        stage('Build Image')
        {
            steps
            {
                script
                {
                  dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }

        stage('Push Image to DockerHub')
        {
            steps
            {
                script
                {
                    docker.withRegistry( '', registryCredential )
                    {
                        dockerImage.push()
                    }
                }
            }
        }

        stage('Deploy on Node'){
    	    steps
    	    {
                step
                ([
                $class: "RundeckNotifier",
                rundeckInstance: "rundeck",
                jobId: "b87572d8-348f-4a7c-bd6b-017842806392",
                includeRundeckLogs: true,
                shouldWaitForRundeckJob: true,
                shouldFailTheBuild: true,
                tailLog: true
                ])
    	    }
    	}
    }
}