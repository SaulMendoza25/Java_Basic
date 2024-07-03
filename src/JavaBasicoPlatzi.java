import javax.print.attribute.standard.JobKOctets;
import java.math.BigInteger;

public class JavaBasicoPlatzi {
    public static void main(String[] args) {
        System.out.println("");
        BigInteger hugeNumeric = new BigInteger("8498493849");
        System.out.println((Object) hugeNumeric.getClass().getSimpleName());
        byte dato =  3;
       short dato1 = 3434;
        char dato2 = 41;
        char igualdad='3';

        int  dato3=  343443199;
        long dato4=  343910393;
        float dato5= 343433194;
        double dato6= 394930400.341233132123112;
        System.out.println(dato + "\n" +dato1+"\n"+ dato2
                +"\n"+dato3 + "\n" + dato4 + "\n" +  dato5 + "\n" + dato6 + "\n" + igualdad);
    }
}
