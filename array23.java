import java.util.Scanner;
public class array23 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String[] mk = {
    "Pancasila",
    "Konsep Teknologi Informasi",
    "Critical Thinking dan Problem Solving",
    "Matematika Dasar",
    "Bahasa Inggris",
    "Dasar Pemrograman",
    "Praktikum Dasar Pemrograman",
    "Keselamatan dan Kesehatan Kerja"
};
int[] sks = {2, 2, 2, 3, 2, 3, 2, 2};
double[] nilaiAngka = new double[mk.length];
String[] nilaiHuruf = new String[mk.length];
double[] bobot = new double[mk.length];
double totalBobot = 0;
int totalSks = 0;
System.out.println("=== PERHITUNGAN IP SEMESTER ===");
    for (int i = 0; i < mk.length; i++) {
    System.out.print("Masukkan nilai untuk mata kuliah " + mk[i] + " : ");
    nilaiAngka[i] = input.nextDouble();
    if (nilaiAngka[i] > 80) {
        nilaiHuruf[i] = "A";
        bobot[i] = 4;
    }else if (nilaiAngka[i] > 73) {
        nilaiHuruf[i] = "B+";
        bobot[i] = 3.5;
    }else if (nilaiAngka[i] > 65) {
        nilaiHuruf[i] = "B";
        bobot[i] = 3;
    }else if (nilaiAngka[i] > 60) {
        nilaiHuruf[i] = "C+";
        bobot[i] = 2.5;
    }else if (nilaiAngka[i] > 50) {
        nilaiHuruf[i] = "C";
        bobot[i] = 2;
    }else if (nilaiAngka[i] > 39) {
        nilaiHuruf[i] = "D";
        bobot[i] = 1;
    } else {
                nilaiHuruf[i] = "E";
                bobot[i] = 0; }
    totalBobot += bobot[i] * sks[i];
    totalSks += sks[i]; }
        double ip = totalBobot / totalSks;
        System.out.println("\n--- HASIL KONVERSI NILAI ---");
        System.out.println("==============================================================");
        System.out.printf("%-40s %-10s %-10s %-10s\n",
                "Mata Kuliah", "Angka", "Huruf", "Bobot");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
        }
        System.out.println("==============================================================");
        System.out.printf("IP Semester : %.2f\n", ip);
        input.close();
    }
}