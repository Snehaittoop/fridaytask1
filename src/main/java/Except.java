public class Except {
    static void avg(){
        try {
            throw new ArithmeticException("sneha");

        }catch (ArithmeticException e){
            System.out.println("exception caught");
        }
    }
    public static void main(String[] args) {
        avg();

    }
}
