public class FunctionTest{

        String str="Hey How Are You?";
        public void indexex(){
            System.out.println(str.indexOf("Hey"));
        }
        public void containex(){
            System.out.println(str.contains("Hey"));
        }
        public void len(){
            System.out.println(str.length());
        }
        public void lowerc(){
            System.out.println(str.toLowerCase());
        }
        public void upperex(){
            System.out.println(str.toUpperCase());
        }

        public static void main(String[] args) {
            FunctionTest obj=new FunctionTest();
            obj.containex();
            obj.upperex();
            obj.lowerc();
            obj.len();
            obj.indexex();
        }
    }
