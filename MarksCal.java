import java.util.Scanner;
public class MarksCal {
    public static void main(String[] args) throws Exception {
        Double m1,m2,m3,m4,m5;
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade calculator");
        System.out.print("Enter the marks for Language:");
        m1 = sc.nextDouble();
        if(m1<=100){
            System.out.print("Enter the marks for English:");
            m2 = sc.nextDouble();
            if(m2<=100){
                System.out.print("Enter the marks for mathematics:");
                m3 = sc.nextDouble();
                if(m3<=100){
                    System.out.print("Enter the marks for Science:");
                    m4 = sc.nextDouble();
                    if (m4<=100) {
                        System.out.print("Enter the marks for Social:");
                        m5 = sc.nextDouble();
                        sc.close();
                        Double sum = m1+m2+m3+m4+m5;
                        Double avg = sum/5;
                        System.out.println("The Total of your marks is:"+sum);
                        System.out.println("The Percentage of your marks is:"+avg+"%");
                        if(avg<=20){
                            grade="U";
                            System.out.print("Your grade is:"+grade);
                        }else if(avg<=40&&avg>20){
                            grade="B";
                            System.out.print("Your grade is:"+grade);
                        }else if(avg<=60&&avg>40){
                            grade="B+";
                            System.out.print("Your grade is:"+grade);
                        }else if(avg<=80&&avg>60){
                            grade="A";
                            System.out.print("Your grade is:"+grade);
                        }else{
                            grade="A+";
                            System.out.print("Your grade is:"+grade);
                        }
                        

                    }
                }
            }
        } else {
            System.out.println("Invalid Input.Please Re-run the program and Enter marks in the range of 0 to 100");
        }
    }
}     
