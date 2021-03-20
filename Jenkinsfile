pipeline {
    agent any

    triggers{
        bitbucketPush()
    }
    
    stage ('Build') {
	steps {
		sh './gradlew clean build'
	}
 	}
}
