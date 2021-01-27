pipeline{
	agent any

	parameters {
		string(name: 'Version', defaultValue: '', description: 'to set the description')
		choice(name: 'choice', choices: ['1', '2', '3'], description: 'to set choices')
		booleanParam(name: 'booleanParam', defaultValue: true, description: '')
	}

	stages {
		stage("build") {
			steps {
				echo "build"
			}
		}
		stage("test") {
			when{
				expression{
					params.booleanParam == true
				}
			}
			steps {
				echo "test"
			}
		}
		stage("deploy") {
			steps {
				echo "deploy"
				echo "deploying - ${params.choice}"
			}
		}
	}
}