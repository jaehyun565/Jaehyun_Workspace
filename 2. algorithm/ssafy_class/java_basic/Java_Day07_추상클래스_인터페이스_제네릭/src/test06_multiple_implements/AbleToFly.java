package test06_multiple_implements;

public interface AbleToFly {
    void fly();
    
    default void print() {
        System.out.println("날아요.");
    }
}
