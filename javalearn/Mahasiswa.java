import java.util.ArrayList;

public class Mahasiswa extends Person{
    String nim;
    ArrayList matakuliah;
    ArrayList<Matakuliah> matakuliahObj = new ArrayList<>();
    public Mahasiswa(String nim,  String name) {
        this.nim = nim;
        this.nama = name;
        this.matakuliah = new ArrayList();
    }
    public void printStudentDetails() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
    }
      // Method to get the courses of the student
    public ArrayList getMatakuliah() {
        return matakuliah;
    }
    // Method to add a course to the student's course list
    public void addMatakuliah(String book) {
        matakuliah.add(matakuliah);
    }
 
    public void addMatakuliahObj(Matakuliah matakuliah){
        matakuliahObj.add(matakuliah);
    }
    public void getMatakuliahObj(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Matakuliah yang diambil:");
        for (Matakuliah item : matakuliahObj) {
            System.out.println("- kode: " + item.code + ", nama: " + item.name);
        }
    }
}