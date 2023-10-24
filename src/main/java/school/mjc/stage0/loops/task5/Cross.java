package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++){
            for (int j = 1; j <=sideLength; j++) {
                if (i != (sideLength/2)+1){
                    if (j == sideLength) System.out.println(" ");
                    else if (j == (sideLength/2)+1) System.out.print("8");
                    else System.out.print(" ");
                }
                else {
                    if (j != sideLength) System.out.print("8");
                    else System.out.println("8");
                }
            }
        }

    }
}
