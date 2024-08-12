package String;public class EX2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Hello World");
        sb.append(" Ronaldo");
        System.out.println(sb);
        sb.insert(1,"EEEÊ");
        System.out.println(sb);
        sb.replace(1,5,"ssss");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(1,9);
        System.out.println(sb);
        System.out.println(sb.length());



    }
}
