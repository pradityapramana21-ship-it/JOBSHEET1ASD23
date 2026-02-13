public class fungsi23 {
public static int hitungPendapatan(int[] stok, int[] harga) {
int total = 0;
for (int i = 0; i < stok.length; i++) {
total += stok[i] * harga[i]; }
return total; }
public static String cekStatus(int pendapatan) {
    if (pendapatan > 1500000) {
        return "Sangat Baik";
    } else {
        return "Perlu Evaluasi"; } }
public static void main(String[] args) {
    String[] cabang = {
        "RoyalGarden 1",
        "RoyalGarden 2",
        "RoyalGarden 3",
        "RoyalGarden 4" };
    int[][] stok = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9} };
int[] harga = {75000, 50000, 60000, 10000};
System.out.println("=== LAPORAN PENDAPATAN ROYALGARDEN ===");
System.out.println("=======================================");
    for (int i = 0; i < cabang.length; i++) {
    int pendapatan = hitungPendapatan(stok[i], harga);
    String status = cekStatus(pendapatan);
System.out.println("Cabang : " + cabang[i]);
System.out.println("Total Pendapatan : Rp" + pendapatan);
System.out.println("Status : " + status);
System.out.println("---------------------------------------");}
}
}