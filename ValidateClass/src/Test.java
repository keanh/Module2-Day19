public class Test {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] { "C0318G", "A0432M","C03$3G"};
    public static final String[] invalidClass = new String[] { "M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String class1: validClass){
            boolean isvalid =classExample.validate(class1);
            System.out.println("Class is " + class1 +" is valid: "+ isvalid);
        }

        for (String class2: invalidClass){
            boolean isvalid = classExample.validate(class2);
            System.out.println("Class is " + class2 +" is valid: "+ isvalid);
        }
    }
}
