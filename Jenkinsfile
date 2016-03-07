#!groovy

stage 'setJAVA_HOME'
node {

    // env.JAVA_HOME = "C:\\Program Files\\Java\\jdk1.8.0_66"
     env.JAVA_HOME = "C:\\Program Files (x86)\\Java\\jdk1.8.0_11"
     echo env.JAVA_HOME

}
stage 'Checkout_AssignmentProject'
node {
git 'https://github.com/exorcist007/AssignmentProject.git'
stage 'build'
bat 'gradle build'
}
stage 'Checkout_Moderator_template'
node {
git 'https://github.com/exorcist007/ModeratorTemplate1.1-1.git'
stage 'build'
bat 'gradle build'
}
stage name: 'Production', concurrency: 1
node {
 echo 'Production server looks to be alive'
 echo "Deployed to production"
}
