package test06_multiple_implements;

public interface AbleToSwim {
    void swim();
    
    default void print() {
        System.out.println("수영해요.");
    }
    
    static void info() {
    	System.out.println("팩트)다.");
    }
}
