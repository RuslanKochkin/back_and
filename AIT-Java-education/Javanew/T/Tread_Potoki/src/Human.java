public class Human extends Thread {
    private final CreditCard creditCard;
    private String name;

    public Human(CreditCard creditCard, String name) {
        this.creditCard = creditCard;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (creditCard) { //обьект синхронизации в скобках/ чтобы патоки не смешивались
                System.out.println(name + " Проверяет есть ли деньги...?");
                if (creditCard.getAmount() > 0) {
                    System.out.println(name + "идет покупать");
                    if (creditCard.buy(10)) {
                        System.out.println(name + " Купил!");
                    } else {
                        System.out.println(name + ": ээээ.....");
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    return;
                }
            }
        }
    }
}

