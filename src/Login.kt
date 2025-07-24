class Login(){

    fun newAcc(): Profile? {
        println("\n=====LOGIN=====")
        val username = checkNullOrBlank("Masukkan Username")
        val password = checkNullOrBlank("Masukkan Password")
        val email = checkNullOrBlank("Masukkan Email")
        val fixedEmail = "$email@gmail.com"
        return Profile(username, password, fixedEmail)
    }
}