class Menu(private var dataUser: Profile?) {

    val listMenu = mutableListOf(
        "profil",
        "koleksi buku",
        "tambah buku",
        "kembalikan buku",
        "pinjam buku",
        "keluar"
    )
    fun toMenu() {
        while (true) {
            print("\n=====MENU=====\n1.PROFIL\n2.KOLEKSI BUKU\n3.TAMBAH BUKU\n4.KEMBALIKAN BUKU\n5.PINJAM BUKU\n6.KELUAR\nPilih: ")
            val chooseMenu = readln().lowercase()

            if (listMenu.any {it == chooseMenu}){
                val printFromInput = listMenu.filter { it == chooseMenu}
                for (i in printFromInput){
                    println("Anda Memilih $i")
                }
                when(chooseMenu){
                    "profil" -> {
                        val passwordCheck = checkPassword("Password: ", dataUser)
                        if (!passwordCheck){
                            println("\nPASSWORD SALAH!\nKembali ke Menu..")
                            continue
                        }else {
                            dataUser?.display()
                        }
                    }
                    "keluar" -> {
                        println("TERIMA KASIH!")
                        break
                    }
                    else -> break
                }
            } else {
                println("FITUR YANG ANDA MAKSUD BELUM TERSEDIA!")
                continue
            }


        }
    }
}