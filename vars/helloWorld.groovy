def call (String name,String dayOfWeek) {
    sh 'echo Hello World'
    sh 'echo $(name), Today is $(dayOfWeek)'
}