def newGit(repo){
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,aapname)
{
  echo "${ip,appname}"
  
  
  sh 'scp /home/ubuntu/.jenkins/workspace/declarative pipeline/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war'
}
