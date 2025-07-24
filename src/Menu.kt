class Menu(private var dataUser: Profile?) {

    val listMenu = mutableListOf(
        "profil",
        "keluar",
        "cari buku",
        "tambah buku",
        "hapus buku"
    )
    val buku = Buku()
    fun toMenu() {
        while (true) {
            print("\n=====MENU=====\n1.PROFIL\n2.CARI BUKU\n3.TAMBAH BUKU\n4.HAPUS BUKU\n5.KELUAR\nPilih: ")
            val chooseMenu = readln().lowercase()

            if (listMenu.any {it == chooseMenu}){
                val printFromInput = listMenu.filter { it == chooseMenu}
                for (i in printFromInput){
                    println("Anda Memilih $i\n")
                }
                when(chooseMenu){
                    "profil"  -> {
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
                    "cari buku" -> {
                        buku.searchBuku()
                    }
                    "tambah buku" -> {
                        buku.tambahBuku()
                    }
                    "hapus buku" ->{
                        buku.hapusBuku()
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