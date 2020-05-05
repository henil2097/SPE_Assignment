pipeline
{
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

    }
}