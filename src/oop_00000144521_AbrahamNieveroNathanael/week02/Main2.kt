package oop_00000144521_AbrahamNieveroNathanael.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan judul buku: ")
    val judul = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val nama = scanner.nextLine()

    print("Lama meminjam: ")
    var dur = scanner.nextInt()

    if (dur < 0){
        dur = 1
    }

    val Loan = Loan(judul, nama, dur)

    println("Judul buku ${Loan.bookTitle}")
    println("Nama peminjam ${Loan.borrower}")
    println("Durasi meminjam: ${Loan.loanDuration} hari")
    println("Total denda = Rp${Loan.calculateFine()}")
}