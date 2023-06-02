import java.util.Scanner;
public class daireFormulProgrami {
    public static void main(String[] args) {

//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//
//Alan Formülü : π * r * r;
//
//Çevre Formülü : 2 * π * r;
//
//Ödev
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360

    double r, 𝜋;

    Scanner input = new Scanner(System.in);

        System.out.print("dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        𝜋 = 3.14;

        double daireninAlani, daireninCevresi;

        daireninCevresi = 2 * 𝜋 * r;
        daireninAlani = 𝜋 * r * r;

        System.out.println("dairenin alanı:" + daireninAlani);
        System.out.println("dairenin çevresi: " + daireninCevresi);

        double daireDilimininAlani, 𝛼;

        System.out.print("daire diliminin merkez açısı: ");
        𝛼 = input.nextDouble();

        daireDilimininAlani = (𝜋 * (r*r) * 𝛼) / 360;

        System.out.println("daire diliminin alanı: " + daireDilimininAlani);






    }
}
