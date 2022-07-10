import java.util.Scanner;

public class ChickenGoatRanchMain {

    public static void main(String[] args) {
        int heads, legs;
        int chickenCount, goatCount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the # of heads and legs you found in our farm today");
        System.out.print("Enter head count: ");
        heads = input.nextInt();
        System.out.print("Enter leg count: ");
        legs = input.nextInt();
        if(legs%2 != 0)
            System.out.println("Error: Anatomically Impossible");
        chickenCount = chickens(heads, legs); //needed to make function static
        if (chickenCount == -1) return;
        goatCount =  goats(heads, legs);
        if(goatCount == -1) return;
        if(heads != chickenCount + goatCount)
            System.out.println("Error: Anatomically Impossible");
        if(legs != 2*chickenCount + 4*goatCount)
            System.out.println("Error: Anatomically Impossible");
        assert legs > heads : " Anatomically Impossible";
        System.out.printf("That's a total of %d chickens and %d goats\n", chickenCount, goatCount);
    }

    public static int chickens(int heads, int legs) {
        int chickens = 2*heads - legs/2;
        if(2*heads < legs/2) {
            System.out.println("Anatomically Impossible");
            chickens = -1;
        }
        System.out.println(chickens);
        return chickens;
    }

    public static int goats(int heads, int legs) {
        int goats = legs/2 - heads;
        if(legs/2 < heads) {
            System.out.println("Anatomically Impossible");
            goats = -1;
        }
        System.out.println(goats);
        return goats;
    }
}
