node
{
    def registry = "henil2097/spe_calculator"
    def registryCredential = 'DockerHub'
    def dockerImage = ''

    stage('Git-Checkout')
    {
        echo 'Pulling the Maven Git repo'
        git "https://github.com/henil2097/SPE_Assignment.git"

    }

    stage("Clean the maven project")
    {
        echo "Cleaning the project"
        sh "mvn clean"
    }

    stage("Compile the maven project")
    {
        echo "Compiling the project"
        sh "mvn compile"
    }

    stage("Test the project")
    {
        echo "Testing the project"
        sh "mvn test"
    }

    stage("Install the project")
    {
        echo "Installing the project"
        sh "mvn install"
    }

    stage('Build Image')
    {
        dockerImage = docker.build registry + ":$BUILD_NUMBER"
    }

    stage('Push Image to DockerHub')
    {
        docker.withRegistry( '', registryCredential )
        {
            dockerImage.push('latest')

        }
    }

    stage('Deploy on Node')
    {
        step([
            $class: "RundeckNotifier",
            rundeckInstance: "rundeck",
            jobId: "e27f1095-bcec-4d38-8fc9-fa516e747119",
            includeRundeckLogs: true,
            shouldWaitForRundeckJob: true,
            shouldFailTheBuild: true,
            tailLog: true
        ])
    }
}