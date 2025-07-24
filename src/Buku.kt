class Buku {

    val bukuClassicName = mutableListOf("The Stranger", "Notes From the Underground")
    val bukuRomanceName = mutableListOf("The Notebook", "La La Land", "Five Feet Apart")
    val genre = mutableListOf("classic", "romance")
    val genreBuku = mutableMapOf("classic" to bukuClassicName, "romance" to bukuRomanceName)

    fun searchBuku(dataUser: Profile?) {
        val inputSearchBook = checkFilterList("CARI BUKU", "GENRE", genre)
        val chooseGenre = genre.filter { it == inputSearchBook }
        for (i in chooseGenre) {
            println("\nAnda Memilih $i!\n")
//        }
//        println("gacor")
//        val listBook = genreBuku.filter { (value) ->
//            value.contains(inputSearchBook)
//        }
//        for ((index, value) in listBook){
//            println("${index + 1}")
//        }
//        for (i in goToBook) {
//            println("ada $i")
//        }


        }
    }
}