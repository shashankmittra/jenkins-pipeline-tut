def gv

pipeline{
	agent any

	parameters {
		string(name: 'Version', defaultValue: '', description: 'to set the description')
		choice(name: 'choice', choices: ['1', '2', '3'], description: 'to set choices')
		booleanParam(name: 'booleanParam', defaultValue: true, description: '')
	}

	stages {
		stage("init") {
			steps {
				script {
					gv = load "script.groovy"
				}
			}
		}
		stage("build") {
			steps {
				script {
					gv.buildApp()
				}
			}
		}
		stage("test") {
			steps {
				script {
					gv.testApp()
				}
			}
		}
		stage("deploy") {
			steps {
				script{
					gv.deployApp()
				}
			}
		}
	}
}
