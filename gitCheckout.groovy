def call(Map stageParams){
    checkout([
        $class : 'GitSCM'
        branches: [[name: stageParams.branch]],
        userRemoteConfig: [[url: stageParams.url]]
    ])
}