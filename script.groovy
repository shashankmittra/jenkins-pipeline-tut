def buildApp(){
	echo "building"
}

def testApp(){
	echo "Testing"
}

def deployApp(){
	echo "deploy"
	echo "deploying - ${params.choice}"
}

return this