def call(String hubUser, String project, String imgTag){
    
    withCredentials([usernamePassword(
    credentialsId: 'dockerhub_credentials', 
    passwordVariable: 'passwd', 
    usernameVariable: 'user_name'
    
    )]) {
        sh "docker login -u '$user_name' -p '$passwd'"
    }
    sh """
    docker push ${hubUser}/${project}:${imgTag}
    docker push ${hubUser}/${project}:latest
    """
}

