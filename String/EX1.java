package String;

public class EX1 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "";
        boolean check2= s1.isEmpty();
        boolean check1=s2.isEmpty();
        System.out.println(check1);
        System.out.println(check2);

        String s3 = new String("  Hello World  ");
        String s4=s3.trim();
        System.out.println(s4);

        String s5 = "Hello World";
        String s6 = "hello world";
        boolean i1 = s5.equals(s6);
        System.out.println(i1);
        boolean i2=s5.equalsIgnoreCase(s6);
        System.out.println(i2);
        String s7 = "Hello, World";
        String [] mang=s7.split(", ");
        for(String str:mang){
            System.out.println(str);
        }
        String s10=".beoqua ";
        String s11=".beoqua cl";
        boolean check=s11.contains(s10);
        if(check){
            System.out.println("Có .beoqua trong chuỗi");
        } else {
            System.out.println("Không tìm thấy  trong chuỗi");}

       String s12=".beoqua ";
        String s13=".beoqua cl";
        String s14=s12.concat(s13);
        System.out.println(s14);

        String s15=s12.toUpperCase();
        System.out.println(s15);
        String s16=s15.toLowerCase();
        System.out.println(s16);

        String s17="Học học nữa học mãi";
        s17=s17.replaceAll("Học học nữa học mãi","neww");
        System.out.println(s17);
        System.out.println(s17.length());
    }
}
