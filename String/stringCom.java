public class stringCom{
    public static void main(String[] args){

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println("comapre string: " + s1.equals(s2));

        //String add
        StringBuilder input1 = new StringBuilder();
        input1.append(s1);
        System.out.println(input1);

        //Reverse String
        input1 = input1.reverse();
        System.out.println(input1);

        //contact
        System.out.println(s1.concat(s2));
    }
}