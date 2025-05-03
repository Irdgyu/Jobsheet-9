import java.util.Scanner;

public class MainSurat06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat06 stack = new StackSurat06(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat06 surat = new Surat06(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat berhasil diterima.");
                    break;

                case 2:
                    Surat06 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                        System.out.println("Jenis Izin: " + diproses.jenisIzin + ", Durasi: " + diproses.durasi + " hari");
                    }
                    break;

                case 3:
                    Surat06 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari " + terakhir.namaMahasiswa);
                    } else {
                        System.out.println("Belum ada surat.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    if (stack.cariSurat(cari)) {
                        System.out.println("Surat dari " + cari + " ditemukan.");
                    } else {
                        System.out.println("Surat dari " + cari + " tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
