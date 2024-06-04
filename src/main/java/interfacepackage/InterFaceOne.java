package interfacepackage;

public interface InterFaceOne {

    public void interfaceTest1();
    public int getNumber(int number);

    default void helloMethod(){
        System.out.println("Hello");
    }
}
