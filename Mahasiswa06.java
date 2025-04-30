public class Mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa06(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
