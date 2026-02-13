import java.util.Scanner;
public class HitungNilaiMahasiswa23 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("=== PROGRAM MENGHITUNG NILAI AKHIR ===");
System.out.print("Nilai Tugas  : ");
double tugas = input.nextDouble();
System.out.print("Nilai Kuis   : ");
double kuis = input.nextDouble();
System.out.print("Nilai UTS    : ");
double uts = input.nextDouble();
System.out.print("Nilai UAS    : ");
double uas = input.nextDouble();
System.out.println("-----------------------------------------");

double[] nilai = {tugas, kuis, uts, uas};
boolean valid = true;
    for (double n : nilai) {
    if (n < 0 || n > 100) {
    valid = false;
break;
}
}
if (!valid) {
System.out.println("Input nilai tidak valid!");
} else {
double nilaiAkhir = (tugas * 20 / 100.0) + (kuis * 20 / 100.0) + (uts * 30 / 100.0) + (uas * 30 / 100.0);
String huruf;
if (nilaiAkhir >= 81) {
    huruf = "A";
} else if (nilaiAkhir >= 74) {
    huruf = "B+";
} else if (nilaiAkhir >= 66) {
    huruf = "B";
} else if (nilaiAkhir >= 61) {
    huruf = "C+";
} else if (nilaiAkhir >= 51) {
    huruf = "C";
} else if (nilaiAkhir >= 40) {
    huruf = "D";
} else {
    huruf = "E";
}
String status = (nilaiAkhir >= 55) ? "LULUS" : "TIDAK LULUS";
    System.out.println("Nilai Akhir : " + nilaiAkhir);
    System.out.println("Nilai Huruf : " + huruf);
    System.out.println("Status      : " + status);
}
        input.close();
}
}