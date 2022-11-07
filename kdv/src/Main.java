import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double tutar,KdvOranı=0.18,KdvliTutar,Kdv;
        Boolean kdvDurumu;


        Scanner input=new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz:");
        tutar=input.nextDouble();

        kdvDurumu=(0<tutar)&&(1000>tutar);
        KdvOranı=kdvDurumu?0.18:0.08;

        Kdv=tutar * KdvOranı;
        KdvliTutar=tutar+Kdv;

        System.out.println("Kdv Orani:" +KdvOranı);
        System.out.println("Kdv'si:" +Kdv);
        System.out.println("Kdv'li Tutar:" +KdvliTutar);

    }
}