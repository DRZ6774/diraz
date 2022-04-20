package INTERVIEWQESTIONS7;

public class Q03_IFElse_Calısma {
    public static void main(String[] args) {
        /*
        Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        print Rock instead of number and for numbers which are a multiple of 5, print Star instead of the number.
        For numbers which are a multiple by of both 3 and 5, print RockStar instead of the number.
        ORNEK:
            INPUT     : 1 2 3 4 ..... 30
            OUTPUT : 1 2 Rock 4 Star Rock 7 8 Rock Star 11 Rock 13 14 RockStar...

 1'den 30'a kadar olan sayıları yazdıran,
 ancak 3'ün katı olan sayılar için sayı yerine Kaya yazdıran
ve 5'in katı olan sayılar için sayı yerine Yıldız yazdıran bir yöntem yazın.
Hem 3 hem de 5'in katı olan sayılar için sayı yerine RockStar yazdırın.
ÖRNEK: GİRDİ : 1 2 3 4 ..... 30 ÇIKTI : 1 2 Kaya 4 Yıldız Kaya 7 8 Kaya Yıldızı 11 Kaya 13 14 RockStar...
		 */



        for (int i = 1; i <=30 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("RockStar ");
            }else if(i%5==0){
                System.out.print("Yildiz  ");
            }else if(i%3==0){
                System.out.print("Kaya ");
            }else {
                System.out.print(i+" ");
            }

        }
    }
}
