def call(String name,String dayOfWeek) {
    sh 'echo ${name}, Today is ${dayOfWeek}'
}