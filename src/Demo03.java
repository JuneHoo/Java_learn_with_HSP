public class Demo03 {
        public static void main(String[] args) {
            Integer int1 = new Integer(1);
            Integer int2 = new Integer(1);

            String str1 = new String("Hello World");
            String str2 = new String("Hello World");

            System.out.println(str1.hashCode());
            System.out.println(str2.hashCode());

            if(int1==int2){
                System.out.println("int1 == int2");
            }
            if(int1.equals(int2)){
                System.out.println("int1 equals int2");
            }

            if(str1==str2){
                System.out.println("str1 == str2");
            }
            if(str1.equals(str2)){
                System.out.println("str1 equals str2");
            }
        }
}
