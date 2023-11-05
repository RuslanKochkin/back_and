public class Main {
    public static void main(String[] args) {
        CreditCard card =new CreditCard(1000);
        Human husband = new Human(card, "Муж");
        Human wife = new Human(card, "Жена");

        husband.start();
        wife.start();
    }
}