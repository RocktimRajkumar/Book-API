pipeline{

		agent any
		
		stages{
		
			stage('Compile Stage'){
			
				steps{
					withMaven(maven : 'maven_3.6.0'){
						bat 'mvn clean compile package'
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

			stage('Deployment Stage'){
				steps{
					withMaven(maven : 'maven_3.6.0'){
						bat 'copy %cd%\target\target\*.war  C:\app\apache-tomcat-8.0.53-windows-x64\apache-tomcat-8.0.53\webapps\'
						echo "Successfully Deploy"
					}
				}
			
			}
		
		}

}