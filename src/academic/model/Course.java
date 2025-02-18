package academic.model;

/**
 * @author 12S23012 - Genesis Tombak Panjaitan
 * @author 12S23016 - Frank Niroy Siahaan
 */
public class Course {
    private final String id;
    private final String matkul;
    private final String sks;
    private final String nilai;

    public Course(String _id, String _matkul, String _sks, String _nilai) {
        this.id = _id;
        this.matkul = _matkul;
        this.sks = _sks;
        this.nilai = _nilai;
    }

    public String toString1() {
        return this.id + "|" + this.matkul + "|" + this.sks + "|" + this.nilai;
    }
}