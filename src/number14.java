import java.util.Scanner;
public class number14 {
    public static void main(String[] arg){
        String course[]={"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score[]={95,88,76,62,55};
        String sub;
        Scanner sc=new Scanner(System.in);
        int i;

        while(true){
            System.out.print("과목이름>>");
            sub= sc.next();
            if(sub.equals("그만"))
                break;
            for(i=0;i< course.length;i++){
                if(course[i].equals(sub)){
                    System.out.println(course[i]+"의 점수는"+score[i]);
                    break;
                }
            }
            if(i==course.length)
                System.out.println("없는과목입니다.");
        }
        sc.close();
    }

}
