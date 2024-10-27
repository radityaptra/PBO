import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mahasiswa student1 = new Mahasiswa("2315101025","Ditya");
        student1.printStudentDetails();
        
        System.out.print("Masukan jumlah matakuliah: ");
        int jumlahMatakuliah = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.print("Masukkan kode matakuliah: ");
            String code = sc.nextLine();
            
            System.out.print("Masukkan nama matakuliah: ");
            String name = sc.nextLine();
            
            Matakuliah matakuliah = new Matakuliah(code, name);
            student1.addMatakuliahObj(matakuliah);
        }
        student1.getMatakuliahObj();
    }
}