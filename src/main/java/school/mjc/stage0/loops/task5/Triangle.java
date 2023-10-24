package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++){
            for (int j = 1; j <=i; j++){
                if (j != i) System.out.print("8");
                else System.out.println("8");
            }
        }
    }
}
