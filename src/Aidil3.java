public class Aidil3 {
    public static void main(String[] args) {
        //Variabel z dengan nilai awal 5
        int z = 5;
        //Variabel spaces dengan nilai awal 0 yang digunakan untuk menentukan jumlah spasi
        int spaces = 0;
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
            //Variabel x dengan nilai awal z
            int x = z;
            //Memulai loop dalam
            while (x > 0) {
                //Mencetak nilai x
                System.out.print("x ");
                //Nilai s akan berkurang 1
                x--;
            }
            //Mencetak baris baru
            System.out.println();
            //Nilai spaces akan bertambah 2
            spaces += 2;
            //Nilai z akan berkurang 2
            z -= 2;
        }
    }
}
