public class KnightDriver {
    public static void main(String[] args) {

        Knight knight = new Knight();
        Stars stars = new Stars();

        //system output for knights attributes
        System.out.printf("Knight Name: %s\n", knight.name);
        System.out.printf("Knight Health: %d\n", knight.health);
        System.out.printf("Knight Battles: %d\n", knight.battles);
        System.out.printf("Knight Age: %d\n", knight.age);
        System.out.printf("Knight Gold: $%d\n", knight.gold);
        System.out.println();

        //loops through to print out stars
        for (int i = 0; i < stars.rows; i++) {
            for (int j = 0; j < stars.columns; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            if (i%2 == 0)
                System.out.print(" ");
        }

    }
}
