pipeline{

		agent any
		
		stages{
		
			stage('Compile Stage'){
			
				steps{
					withMaven(maven : 'maven_3.6.0'){
						bat 'mvn clean compile'
					}
				}
			
			}

			stage('Testing Stage'){
				steps{
					withMaven(maven : 'maven_3.6.0'){
						bat 'mvn test'
					}
				}
			
			}
			
			stage('Artifact'){
				steps{
					archive 'target/*.war'
				}
			}
			
			stage('Deployment Stage'){
				steps{
					withMaven(maven : 'maven_3.6.0'){
						bat 'echo %cd%'
						echo "Successfully Deploy"
					}
				}
			
			}
		
		}

}