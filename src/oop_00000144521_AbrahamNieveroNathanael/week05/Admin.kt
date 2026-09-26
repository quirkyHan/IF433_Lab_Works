package oop_00000144521_AbrahamNieveroNathanael.week05

class Admin(nama: String): pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer dan melayani administrasi.")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}