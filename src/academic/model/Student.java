package academic.model;

/**
 * @author 12S23012 - Genesis Tombak Panjaitan
 * @author 12S23016 - Frank Niroy Siahaan
 */
public class Student {
    private final String nim;
    private final String nama;
    private final String tahun;
    private final String prodi;

    public Student(String _nim, String _nama, String _tahun, String _prodi) {
        this.nim = _nim;
        this.nama = _nama;
        this.tahun = _tahun;
        this.prodi = _prodi;
    }

    public String toString2() {
        return this.nim + "|" + this.nama + "|" + this.tahun + "|" + this.prodi;
    }
}