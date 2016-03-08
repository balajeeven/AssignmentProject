#!groovy

stage 'setJAVA_HOME'
node {

     env.JAVA_HOME = "C:\\Program Files\\Java\\jdk1.8.0_66"
  //   env.JAVA_HOME = "C:\\Program Files (x86)\\Java\\jdk1.8.0_11"
     echo env.JAVA_HOME
}

//1
stage 'clone_AssignmentProject'
node {
git 'https://github.com/exorcist007/AssignmentProject.git'
}



//2
stage 'build_AssignmentProject'
node{
  if(isUnix()){
  sh 'gradle build --info'
    
  }
  else{
    bat 'gradle build --info'
  }
}

//3
stage 'Publish-Artifact'
node{
   if(isUnix()){
    sh 'gradle publish --info'
  }
  else{
   bat 'gradle publish --info'
}
}
//4
stage 'Sonar-report'
node{
     if(isUnix()){
          sh 'gradle sonarqube --info'
     }else{
          bat 'gradle sonarqube --info'
     }
}

//5
stage 'JaCoCo-Coverage-report'
node{
     if(isUnix()){
          sh 'gradle jacoco --info'
     }else{
          bat 'gradle jacoco --info'
     }
}


//6
stage 'Clone_Moderator_template'
node {
git 'https://github.com/exorcist007/ModeratorTemplate1.1-1.git'
}




//7
stage 'Build_Moderator_template'
node{
  if(isUnix()){
  sh 'gradle build --info'
    
  }
  else{
    bat 'gradle build --info'
  }
}
//8
stage 'send-mail'
node{
     mail bcc: 'asinha161@gmail.com', body: 'Please check out the jenkins file build', cc: 'asinha161@hotmail.com', charset: '', from: '', mimeType: 'text/plain', replyTo: '', subject: 'JENKINS-FILE build', to: 'asinha161@gmail.com'
}
