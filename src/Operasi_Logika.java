/**
 * @author RizkyKhapidsyah
 */
public class Operasi_Logika {

    public static void main(String[] args) {
        /*
         *  Operator Logika: Operasi yang bisa dilakukan kepada Boolean
         *  Operator Logika: OR, AND, XOR, Negasi     
         */

        boolean A, B, C;    //Deklarasi Variabel dengan Tipe Data: Boolean

        /* CONTOH 1: OR. Lambang: || (Vertical Bar) */
        System.out.println("===================================");
        System.out.println("CONTOH 1: Operasi OR, (Lambang: ||)");
        System.out.println("===================================");
        A = false;
        B = false;
        C = (A || B);
        System.out.println("A(" + A + ") || B(" + B + "), Hasil: " + C);
        A = false;
        B = true;
        C = (A || B);
        System.out.println("A(" + A + ") || B(" + B + "), Hasil: " + C);
        A = true;
        B = false;
        C = (A || B);
        System.out.println("A(" + A + ") || B(" + B + "), Hasil: " + C);
        A = true;
        B = true;
        C = (A || B);
        System.out.println("A(" + A + ") || B(" + B + "), Hasil: " + C + "\n\n");

        
        /* CONTOH 2: AND. Lambang: && (Double Ampersand) */
        System.out.println("===================================");
        System.out.println("CONTOH 2: Operasi AND, (Lambang: &&)");
        System.out.println("===================================");
        A = false;
        B = false;
        C = (A && B);
        System.out.println("A(" + A + ") && B(" + B + "), Hasil: " + C);
        A = false;
        B = true;
        C = (A && B);
        System.out.println("A(" + A + ") && B(" + B + "), Hasil: " + C);
        A = true;
        B = false;
        C = (A && B);
        System.out.println("A(" + A + ") && B(" + B + "), Hasil: " + C);
        A = true;
        B = true;
        C = (A && B);
        System.out.println("A(" + A + ") && B(" + B + "), Hasil: " + C + "\n\n");
        
        /* CONTOH 3: XOR atau Exclusive OR. Lambang: ^ */
        System.out.println("=================================================");
        System.out.println("CONTOH 3: Operasi XOR (Exclusive OR, (Lambang: ^)");
        System.out.println("=================================================");
        A = false;
        B = false;
        C = (A ^ B);
        System.out.println("A(" + A + ") ^ B(" + B + "), Hasil: " + C);
        A = false;
        B = true;
        C = (A ^ B);
        System.out.println("A(" + A + ") ^ B(" + B + "), Hasil: " + C);
        A = true;
        B = false;
        C = (A ^ B);
        System.out.println("A(" + A + ") ^ B(" + B + "), Hasil: " + C);
        A = true;
        B = true;
        C = (A ^ B);
        System.out.println("A(" + A + ") ^ B(" + B + "), Hasil: " + C + "\n\n");
        
        
        /* CONTOH 4: NOT atau Negasi (Flipping). Lambang: ! */
        System.out.println("====================================================");
        System.out.println("CONTOH 4: Operasi NOT (Negasi (Flipping), Lambang: !");
        System.out.println("====================================================");
        A = true;
        C = !A;
        System.out.println(A + " --> (!) = " + C + "\n\n");
    }
}
