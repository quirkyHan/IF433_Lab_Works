package oop_00000144521_AbrahamNieveroNathanael.week05

fun main(){
    val dosen1 = Dosen("Pak Anton", "144521")
    val admin1 = Admin("Pak Ararar")

    val daftarPegawai: List<pegawai> = listOf(dosen1, admin1)

    println("--- Aktivitas Pegawai ---")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("Terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
    }
}