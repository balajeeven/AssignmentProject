#!groovy

//stage 'setJAVA_HOME'
//node {

    // env.JAVA_HOME = "C:\\Program Files\\Java\\jdk1.8.0_66"
  //   env.JAVA_HOME = "C:\\Program Files (x86)\\Java\\jdk1.8.0_11"
  //   echo env.JAVA_HOME

//}
stage 'Checkout_AssignmentProject'
node {
git 'https://github.com/exorcist007/AssignmentProject.git'
}
stage 'build_AssignmentProject'
node{
    bat 'gradle build --info'
}
stage 'PublishArtifact'
node{
    bat 'gradle artiPub --info'
}
stage 'Checkout_Moderator_template'
node {
git 'https://github.com/exorcist007/ModeratorTemplate1.1-1.git'
}
stage 'build_Moderator_template'
node{
    bat 'gradle build --info'
}
tage name: 'Production', concurrency: n
ode {
 echo 'Production server looks to be alive'
 echo "Deployed to production"
}
