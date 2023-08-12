/* groovylint-disable MethodReturnTypeRequired */
/* groovylint-disable-next-line MethodReturnTypeRequired */
/* groovylint-disable-next-line NoDef */
def call(String name, String dayOfWeek) {
    sh "echo Hi ${name}, Today is ${dayOfWeek}"
}
