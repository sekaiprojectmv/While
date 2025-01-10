public class Aidil2 {
    public static void main(String[] args) {
        //Variabel z dengan nilai awal 0
        int z = 0;
        //Memulai loop luar
        while (z < 3) {
            //Variabel x dengan nilai awal 1
            int x = 1;
            //Memulai loop dalam
            while (x < 6 - 2 * z) {
                //Outout nilai angka tanpa pindah baris
                System.out.print(x+" ");
                //Nilai x akan bertambah 1
                x++;
            }
            //Mencetak baris baru
            System.out.println();
            //Nilai z akan bertambah 1
            z++;
        }
    }
}
