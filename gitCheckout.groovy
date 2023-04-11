def call(Map gitparams){
    checkout([
        $class : 'GitSCM'
        branches: [{name: gitparams.branch}],
        userRemoteConfig: [{url: gitparams.url}]
    ])
}