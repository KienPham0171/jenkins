pipeline{
    agent any
	stages {
	    triggers {
            githubPush()
        }
		stage ("Compile") {
			steps{
				sh "mvn clean install"
			}
		}
		stage ("unit test") {
			steps{
				sh "mvn test"
			}
		}
	}
}
