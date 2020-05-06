node
{
    stage('Deploy on Node')
    {
        step([
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