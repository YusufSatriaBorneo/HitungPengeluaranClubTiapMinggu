// Sebenernya ini program untuk pengeluaran Club, Perhari bukan keuntungan club tapi bisa sama aja


import java.util.Scanner;

// mengimpor Scanner ke program

public class KeuntunganClub{
    public static void main(String[] args){
        // deklarasi variabel
        String nama;
        double average;
        int totalhari = 7;
        int num1,num2,num3,num4,num5,num6,num7;
       

         // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("Siapakah Namamu?");
        nama = keyboard.next();

        System.out.println("Penghasilan Hari Senin ?");
        num1 = keyboard.nextInt();

        System.out.println("Penghasilan Hari Selasa ?");
        num2 = keyboard.nextInt();

        System.out.println("Penghasilan Hari Rabu ?");
        num3 = keyboard.nextInt();

        System.out.println("Penghasilan Hari Kamis ?");
        num4 = keyboard.nextInt();

        System.out.println("Penghasilan Hari Jumat ?");
        num5 = keyboard.nextInt();

        System.out.println("Penghasilan Hari Sabtu ?");
        num6 = keyboard.nextInt();

        System.out.println("Penghasilan Hari Minggu ?");
        num7 = keyboard.nextInt();

        // Mengatur Operasi Bilangan
        int hasil = num1 + num2 + num3 + num4 + num5 + num6 + num7;
        average = (double) hasil/totalhari;

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("Jawaban Yang Di Olah Oleh Komputer :");
        System.out.println("Nama mu adalah: " + nama);
        System.out.println("Total Penghasilan Mingguan Adalah: Rp." + hasil);
        System.out.println("Total Rata-Rata Mingguan Adalah: Rp." + average);
    }
}