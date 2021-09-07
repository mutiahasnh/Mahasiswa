import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int data = 0;
        String[] nama       = new String[30];
        int nim[]           = new int[15];
        String[] jurusan    = new String[10];
        int UTS[]           = new int[5];
        int UAS[]           = new int[5];
        double[] NilaiAkhir = new double[10];

        System.out.print("Masukan banyak data = ");
        data = in.nextInt();
        for(int i=1 ; 1<= data; i++){
            System.out.println("Data ke " + i +" ");
            System.out.print("Masukan NIM = ");
            nim[i] = in.nextInt();
            System.out.print("Masukan Nama = ");
            nama[i] = in.next();
            System.out.print("Masukan Jurusan = ");
            jurusan[i] = in.next();
            System.out.print("Masukan Nilai UTS = ");
            UTS[i] = in.nextInt();
            System.out.print("Masukan Nilai UAS = ");
            UAS[i] = in.nextInt();
            NilaiAkhir[i] = 0.7*UTS[i] + 0.3*UAS[i];
        }

        System.out.println("Banyak Data : " + data);
        for (int i=1; i<=data; i++){
            System.out.println(" Data Mahasiswa ke- " +i);
            System.out.println(" NIM      :" + nim[i]);
            System.out.println(" Nama     :" + nama[i]);
            System.out.println(" Jurusan  :" + jurusan[i]);
            System.out.println(" UTS      :" + UTS[i]);
            System.out.println(" UAS      :" + UAS[i]);
            System.out.println(" NilaiAkhir :" + NilaiAkhir[i]);
        }
    }
}

