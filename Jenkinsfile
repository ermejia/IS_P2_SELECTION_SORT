pipeline{
    agent any
    stages{
        stage("Upload Artifact"){
                    environment{
                        MAVEN_HOME = '/usr/share/maven'
                    }
            steps{
                echo "-------Uploading Artifact--------"
            
                rtMavenDeployer (
                    id:'IS_P2_SELECTION_SORT',
                    serverId: 'artifactory',
                    releaseRepo: 'SelectionSort',
                    snapshotRepo: 'SelectionSort',
                )
                rtMavenRun(
                    pom: 'pom.xml',
                    goals: 'install',
                    deployerId: 'IS_P2_SELECTION_SORT'
                )

                    echo "-----Deploying Finished-----"
            }
        }
        stage ("Artifactory Information") {
            steps{
                rtPublishBuildInfo (
                    serverId: "artifactory"
                )
            }
        }
    }
}