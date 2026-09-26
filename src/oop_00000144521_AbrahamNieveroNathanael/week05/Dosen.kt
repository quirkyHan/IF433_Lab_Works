package oop_00000144521_AbrahamNieveroNathanael.week05

class Dosen(nama: String, val nidn: String): pegawai(nama){
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RKRPS.")
    }
    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}