import java.util.Scanner;
public class nim23 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Masukkan NIM kamu: ");
String nim = input.nextLine();
String duaDigit = nim.substring(nim.length() - 2);
int jumlah = Integer.parseInt(duaDigit);
if (jumlah < 10) {
jumlah = jumlah + 10; }
int angka = 1;
while (angka <= jumlah) {
if (angka == 10 || angka == 15) {
    angka++;
continue; }
    if (angka % 3 == 0) {
System.out.print("# "); } 
    else if (angka % 2 == 0) {
System.out.print(angka + " "); } 
    else {
System.out.print("* "); }
    angka++;  }
input.close(); }
}