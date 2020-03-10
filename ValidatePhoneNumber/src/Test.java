public class Test {
    private static PhoneNumber phoneNumber;
    public static final String[] validPhoneNumber = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[] {" (a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();

        for (String number:validPhoneNumber){
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Phone Number is " + number +" is valid: "+ isvalid);
        }

        for (String number:invalidPhoneNumber){
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Phone number is " + number +" is valid: "+ isvalid);
        }
    }
}
