open class Profile(private var username: String?, private var password: String?, private var email: String?){

    var getSetUname: String?
        get() = username
        set(value) {
            username = value
        }
    var getSetPassword: String?
        get() = password
        set(value) {
            password = value
        }
    var getSetEmail: String?
        get() = email
        set(value) {
            email = value
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