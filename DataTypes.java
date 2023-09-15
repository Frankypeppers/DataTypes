public class DataTypes
{
    public static void main(String[] args) {
        int i;
        double f = 2.5;
        boolean flag = true;
        
        i = 10;
        f += i;
        flag = !flag;
        System.out.println(++i);
        System.out.println(f);
        System.out.println(flag);
        System.out.println(" ");
        String String1 = "This is a string";
        String String2 = String1;
        String String3 = "I am also a string";
        boolean stringsEqual = String1.equals(String3);
        System.out.println(String1);
        System.out.println(String2);
        System.out.println(String3);
        System.out.println(stringsEqual);
        System.out.println(" ");
        
        
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo","Foxtrot"};
        for  (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.println(strArray[iterate]);
        }
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
        }
        System.out.println(" ");
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
            if (iterate < strArray.length-1) {
                System.out.print("-");
            }
        }
    }
}