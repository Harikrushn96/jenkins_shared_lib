def call(String hubUser, String project, String imgTag){
    sh """
    docker build -t ${hubUser}/${project} .
    docker tag ${hubUser}/${project} ${hubUser}/${project}:${imgTag}
    docker tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}