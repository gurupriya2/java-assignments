public class Digit {
    public class Digit {
        public static void word (String a){
            Map<Character,String>digit=new HashMap<Character,String>(){{
                put('1', "one");
                put('2', "two");
                put('3', "three");
                put('4', "four");
                put('5', "five");
                put('6', "six");
            }}

            for(char num : a.toCharArray()){
                System.out.println(digit.get(num));
            }
            public static void main(String[] args){
                String a= "546";
                word(a);
            }
        }
    }
}
