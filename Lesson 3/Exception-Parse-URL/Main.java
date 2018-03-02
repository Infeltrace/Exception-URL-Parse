public class Main {

    public static void main(String[] args) {

        try {
            methodArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("Произошла ошибка :)");
//            e.printStackTrace();
        }
        try{
            someMethodForException(-1);
        }catch (MyException e) {
            System.out.println("Произошла ошибка :)");
//            e.printStackTrace();
        }

        methodOutOfBounds();
        methodNullPointerExeption();
        methodFormatExeption();

        try {
            System.out.println(ParseAnalogy.parseInt("534778"));
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }

        try {
            URL.dissection("param1=value1&param2=value2&param3=value3");
        }catch (Exception e){
//            e.printStackTrace();
        }
    }

    private static void methodOutOfBounds() {

        int arr[] = new int[5];
        try {
            arr[6] = 6;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Произошла ошибка :)");
//           e.printStackTrace();
        }
    }

   private static void methodFormatExeption(){
         try {
             int temp = Integer.parseInt("dfhdgfh");
         }catch (NumberFormatException e){
             System.out.println("Произошла ошибка :)");
//             e.printStackTrace();
         }
    }

   private static void methodNullPointerExeption(){
        String string = null;
        try {
            string.getBytes();
        }catch (NullPointerException e){
            System.out.println("Произошла ошибка :)");
//            e.printStackTrace();
        }
    }

    private static void methodArithmeticException() throws ArithmeticException{
        System.out.println(Math.floorDiv(1, 0));
    }

    private static void someMethodForException(int number) throws MyException {

        if(number >= 0) System.out.println("OK");
        else throw new MyException();
    }

}
