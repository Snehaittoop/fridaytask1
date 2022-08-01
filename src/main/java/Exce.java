public class Exce {
    public static void main(String[] args) {
        try {
            int [] myNumber={1,2,3,4};
            System.out.println(myNumber[10]);
        }catch (Exception e){
            System.out.println("something wrong");
        }finally {
            System.out.println("try catch finished");
        }
    }
}
