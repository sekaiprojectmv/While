public class Aidil4 {
    public static void main(String[] args) {
        //Variabel z dengan nilai awal 5
        int z = 5;
        //Variabel spaces dengan nilai awal 0 yang digunakan untuk menentukan jumlah spasi
        int spaces = 0;
        //Variabel start dengan nilai awal 1
        int start = 1;
        //Memulai loop luar
        while (z > 0) {
            //Variabel s dengan nilai awal spaces
            int s = spaces;
            //Memulai loop dalam
            while (s > 0) {
                //Mencetak 2 spasi
                System.out.print("  ");
                //Nilai s akan berkurang 1
                s--;
            }
            //Variabel x dengan nilai awal start
            int x = start;
            //Memulai loop dalam
            while (x < start + z) {
                //Mencetak variabel x/angka
                System.out.print(x+" ");
                //Nilai x akan bertambah 1
                x++;
            }
            //Mencetak baris baru
            System.out.println();
            //Nilai spaces akan bertambah 2
            spaces += 2;
            //Nilai start akan bertambah 2
            start +=2;
            //Nilai z akan berkurang 2
            z -= 2;
        }
    }
}
