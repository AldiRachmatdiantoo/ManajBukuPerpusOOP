class Buku {

    val bukuClassicName = mutableListOf("the stranger", "notes from the underground")
    val bukuRomanceName = mutableListOf("the notebook", "la la land", "five Feet apart")
    val genre = mutableListOf("classic", "romance")

    fun searchBuku() {
        val inputSearchBook = checkFilterList("CARI BUKU", "GENRE", genre)
        println("ANDA MEMILIH ${inputSearchBook.uppercase()}")
        when (inputSearchBook) {
            "classic" -> classicList()
            "romance" -> romanceList()
        }
    }

    fun classicList() {
        println("\n=====CLASSIC BOOKS=====")
        for ((index, i) in bukuClassicName.withIndex()) {
            println("${index + 1}.$i")
        }
        print("Ketik apapun untuk kembali: ")
        readln()

    }

    fun romanceList() {
        println("\n=====ROMANCE BOOKS=====")
        for ((index, i) in bukuRomanceName.withIndex()) {
            println("${index + 1}.$i")
        }
        print("Ketik apapun untuk kembali: ")
        readln()
    }

    fun tambahBuku() {
        val addBookCheck = checkFilterList("TAMBAH BUKU", "GENRE", genre)
        println("ANDA MEMILIH ${addBookCheck.uppercase()}")

        when (addBookCheck) {
            "classic" -> inputTambahBuku(bukuClassicName)
            "romance" -> inputTambahBuku(bukuRomanceName)
        }
    }

    fun hapusBuku(){
        val deleteBook = checkFilterList("HAPUS BUKU", "GENRE", genre)
        println("ANDA MEMILIH ${deleteBook.uppercase()}")
        when(deleteBook){
            "classic" -> {
                val genreType = "CLASSIC"
                inputHapusBuku(genreType, bukuClassicName)
            }
            "romance" -> {
                val genreType = "ROMANCE"
                inputHapusBuku(genreType, bukuRomanceName)
            }
        }

    }
    fun inputHapusBuku(genryType: String, list: MutableList<String>){
        while (true){
            val deleteBook = checkFilterList(genryType, "BUKU YANG INGIN DIHAPUS", list)
            val checkDeleteBook = checkYesOrNo("Ingin Menghapus $deleteBook? ")
            if (!checkDeleteBook){
                continue
            } else {
                println("BERHASIL MENGHAPUS ${deleteBook.uppercase()}!")
                list.remove(deleteBook)
                print("Ketik apapun untuk kembali: ")
                readln()
                break

            }
        }
    }
    fun inputTambahBuku(list: MutableList<String>){

        while (true) {
            val newBook = checkNullOrBlank("Masukkan Judul Buku")
            val checkBookInput = checkYesOrNo("Ingin menambahkan $newBook? ")
            if (!checkBookInput){
                continue
            } else{
                println("BERHASIL MENAMBAHKAN ${newBook.uppercase()}!")
                list.add(newBook)
                print("Ketik apapun untuk kembali: ")
                readln()
                break
                }
            }
        }

    }

