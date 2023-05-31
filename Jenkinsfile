pipeline{
    agent any
	stages {
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
