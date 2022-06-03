public class Main {
    public static void main(String[] args) {
        Enemy ork = new Enemy();
        ork.name="EvilDarkLord";
        ork.life=8;
        ork.role="enemy";


        Hero hobbits = new Hero();
        hobbits.name="GoodAngelSaviour";
        hobbits.life=10;
        hobbits.role="hero";

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose your character: Hero or Enemy");
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("Hero")) {
            System.out.println("Choose your characters name");
            hobbits.name = scan.nextLine();
            System.out.println("Enter your character's strength: ");
            hobbits.life = scan.nextInt();
            Random random = new Random();
            int rand = random.nextInt(10);
            ork.life = rand;
        } else if (choice.equalsIgnoreCase("Enemy")) {
            System.out.println("Choose your characters name: ");
            ork.name = scan.nextLine();
            System.out.println("Enter your character's strength: 1-10");
            ork.life = scan.nextInt();
            Random random = new Random();
            int rand = random.nextInt(10);
            hobbits.life = rand;
        } else {
            System.out.println("ERROR!!!!");
            System.exit(0);
        }

            System.out.println("First fight: " + ork.name + " vs " + hobbits.name);

            if (ork.life > hobbits.life) {
                System.out.println("The Enemy won");
            } else if (ork.life < hobbits.life) {
                System.out.println("The Good has won");
            } else {
                System.out.println("Nobody won");
            }

    }
}