package oop_00000144521_AbrahamNieveroNathanael.week02

class Student (val name: String, val nim: String, var major: String, var gpa: Double = 0.0){
    init{
        if(nim.length != 5){
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("Log: Objek student $name berhasil dialokasikan di memory.")
        }
    }
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated", gpa = 0.0) {
        println("Log: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}
