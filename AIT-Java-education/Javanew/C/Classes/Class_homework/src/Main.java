public class Main {
    public static void main(String[] args) {
////Создайте несколько счетов,
// создайте массив из счетов,
// распечатайте список счетов.
        MyDate today = new MyDate(23, 8, 1982);
        Person nameRuslan = new Person("Ruslan", "Kochkin", today);
        Account clientRuslan = new Account("12345678910", nameRuslan, 30.15, new MyDate(20, 5, 2012));
        //-------------------
        MyDate today1 = new MyDate(2, 7, 1993);
        Person nameIrina = new Person("Irina", "Kuznetsova",today1);
        Account clientIrina = new Account("12345678910", nameIrina, 30.80, new MyDate(20, 5, 2012));
        //---------------------
        Account []accounts = {clientRuslan, clientIrina};
        System.out.println(clientRuslan.toString());
        System.out.println(clientIrina);

        clientRuslan.incomeTransaction(3000);
        System.out.println(clientRuslan);

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].incomeTransaction(5000);
        }
        System.out.println(clientIrina);
        System.out.println(clientRuslan);
        sendMoney(accounts);
        System.out.println(clientRuslan);

        }
        public static void sendMoney(Account[]  accounts){
            for (int i = 0; i < accounts.length; i++) {
                accounts[i].incomeTransaction(1000);
            }
        }
    }


