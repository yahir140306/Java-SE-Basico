public class IncrementDecremet {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--;
        System.out.println(lives); //3

        lives++;
        System.out.println(lives); //4

        // prefija
        // gana un regalo por ganar una vida
        /* int gift = 100 + lives++; // postfijo
        System.out.println(gift);
        System.out.println(lives); //5
        */
        int  gitf1 = 100 + ++lives; // prefijo
        System.out.println(gitf1);
        System.out.println(lives);

    }
}
