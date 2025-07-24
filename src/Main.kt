fun main() {
    val startProgram = checkYesOrNo("Ingin masuk ke Program Manajemen Perpustakaan? ")
    if (!startProgram) {
        println("TERIMA KASIH!")
        return
    }

    while (true) {

        val user = Login().newAcc()
        val confirmAcc = checkYesOrNo("Buat Akun? (y/n) ")
        if (!confirmAcc) {
            println("=====LOGIN ULANG=====")
            continue
        } else {
            user?.success()
            Menu(user).toMenu()
            break
        }
    }
}

fun checkYesOrNo(text: String): Boolean {
    print(text)
    var choice = readln()
    while (!choice.equals("y", true) && !choice.equals("n", true)){
        println("ERROR INPUT! TOLONG MASUKKAN DENGAN BENAR!")
        print(text)
        choice = readln()
    }
    return choice.equals("y", true)
}

fun checkNullOrBlank(text: String): String {

    print("$text: ")
    var input = readln()
    while (input.isBlank() || input.length < 4){
        println("ERROR! TOLONG ${text.uppercase()} DENGAN BENAR! ")
        print("$text: ")
        input = readln()
    }
    println("BERHASIL!!")
    return input

}
fun checkPassword(text: String, dataUser: Profile?): Boolean{

    print(text)
    val password = readln()
    return password.equals(dataUser?.getSetPassword, false)

}



