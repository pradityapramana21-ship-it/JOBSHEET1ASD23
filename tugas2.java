import java.util.Scanner;
public class tugas2 {
public static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
    for (int i = 0; i < n; i++) {
    System.out.println("\nJadwal ke-" + (i + 1));
    System.out.print("Nama Mata Kuliah : ");
    jadwal[i][0] = sc.nextLine();
    System.out.print("Ruang : ");
    jadwal[i][1] = sc.nextLine();
    System.out.print("Hari : ");
    jadwal[i][2] = sc.nextLine();
    System.out.print("Jam : ");
    jadwal[i][3] = sc.nextLine(); } }
public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
    for (int i = 0; i < n; i++) {
        System.out.printf("%-25s %-20s %-10s %-15s\n",
        jadwal[i][0],
        jadwal[i][1],
        jadwal[i][2],
        jadwal[i][3]); } }
public static void cariHari(String[][] jadwal, int n, String hari) {
boolean ada = false;
System.out.println("\nJadwal pada hari " + hari + " :");
    for (int i = 0; i < n; i++) {
        if (jadwal[i][2].equalsIgnoreCase(hari)) {
        System.out.println(jadwal[i][0] + " | " +
        jadwal[i][1] + " | " +
        jadwal[i][3]); ada = true; } }
        if (!ada) { System.out.println("Tidak ada jadwal di hari tersebut."); } }
public static void cariMatkul(String[][] jadwal, int n, String matkul) {
    boolean ketemu = false;
    for (int i = 0; i < n; i++) {
        if (jadwal[i][0].equalsIgnoreCase(matkul)) {
            System.out.println("\nDetail Jadwal:");
            System.out.println("Mata Kuliah : " + jadwal[i][0]);
            System.out.println("Ruang       : " + jadwal[i][1]);
            System.out.println("Hari        : " + jadwal[i][2]);
            System.out.println("Jam         : " + jadwal[i][3]);
    ketemu = true; } }
    if (!ketemu) {
        System.out.println("Mata kuliah tidak ditemukan."); } }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah jadwal kuliah: ");
    int n = Integer.parseInt(sc.nextLine());
    String[][] jadwal = new String[n][4];
    inputJadwal(jadwal, n, sc);
    tampilSemua(jadwal, n);
    System.out.print("\nCari jadwal berdasarkan hari: ");
    String hariCari = sc.nextLine();
    cariHari(jadwal, n, hariCari);
System.out.print("\nCari jadwal berdasarkan nama mata kuliah: ");
    String mkCari = sc.nextLine();
    cariMatkul(jadwal, n, mkCari);
        sc.close(); } }