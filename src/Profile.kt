open class Profile(private var username: String?, private var password: String?, private var email: String?){

    var getSetPassword: String?
        get() = password
        set(value) {
            password = value
        }

    fun success() {
        println("BERHASIL MEMBUAT AKUN")
    }

    fun display() {
        println("\n=====AKUN=====\nName: $username\nPassword: $password\nEmail: $email")
        print("Ketik apapun untuk kembali: ")
        readln()
    }
}