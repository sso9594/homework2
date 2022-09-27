import java.util.Scanner;
public class number6 {
    public static void main(String[] args){
        int [] unit={50000,10000,1000,500,100,50,10,1};
        Scanner sc=new Scanner(System.in);
        int charge;
        System.out.println("금액을 입력하시오>>");
        charge=sc.nextInt();

        for(int i=0;i< unit.length;i++){
            System.out.println(unit[i]+"짜리 : "+charge/unit[i]+"개");
            charge=charge%unit[i];

        }

    }
}
