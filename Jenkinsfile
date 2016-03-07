#!groovy

//stage 'setJAVA_HOME'
//node {

    // env.JAVA_HOME = "C:\\Program Files\\Java\\jdk1.8.0_66"
  //   env.JAVA_HOME = "C:\\Program Files (x86)\\Java\\jdk1.8.0_11"
  //   echo env.JAVA_HOME

//}

//1
stage 'Checkout_AssignmentProject'
node {
git 'https://github.com/exorcist007/AssignmentProject.git'
}



//2
stage 'build_AssignmentProject'
node{
    bat 'gradle build --info'
}

stage 'eclipse-artifact'
node{
    bat 'gradle eclipse --info'
}

//3
stage 'PublishArtifact'
node{
    bat 'gradle bitwise --info'
}



//4
stage 'Checkout_Moderator_template'
node {
git 'https://github.com/exorcist007/ModeratorTemplate1.1-1.git'
}




//5
stage 'build_Moderator_template'
node{
    bat 'gradle build --info'
}
