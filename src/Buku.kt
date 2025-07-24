class Buku {

    val bukuClassicName = mutableListOf("The Stranger", "Notes From the Underground")
    val bukuRomanceName = mutableListOf("The Notebook", "La La Land", "Five Feet Apart")
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
        searchBuku()
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

