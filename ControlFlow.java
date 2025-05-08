public class ControlFlow {

  private int nilai; // Variabel untuk menyimpan nilai yang akan dievaluasi

  // Constructor untuk menginisialisasi nilai
  public ControlFlow(int nilai) {
    this.nilai = nilai;
  }

  // Sub-materi: Pengondisian dengan if-else
  public String ifElse() {
    // Mengecek apakah nilai positif, negatif, atau nol
    if (nilai > 0) {
      return "Nilai adalah positif";
    } else if (nilai < 0) {
      return "Nilai adalah negatif";
    } else {
      return "Nilai adalah nol";
    }
  }

  // Sub-materi: Pengondisian dengan switch
  public String switchCase() {
    // Menggunakan switch untuk mengevaluasi sisa bagi nilai dengan 3
    switch (nilai % 3) {
      case 0:
        return "Dapat dibagi 3";
      case 1:
        return "Sisa 1 saat dibagi 3";
      case 2:
        return "Sisa 2 saat dibagi 3";
      default:
        return "Nilai tidak valid";
    }
  }

  // Sub-materi: Perulangan dengan for
  public String forLoop() {
    StringBuilder hasil = new StringBuilder();
    // Mengulang dari 1 hingga nilai untuk membentuk deret angka
    for (int i = 1; i <= nilai; i++) {
      hasil.append(i).append(" ");
    }
    return hasil.toString().trim(); // Menghapus spasi di akhir
  }

  // Getter dan Setter
  public int getNilai() {
    return nilai;
  }

  public void setNilai(int nilai) {
    this.nilai = nilai;
  }
}
