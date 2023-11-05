import java.util.ArrayDeque;
import java.util.Deque;

public class BeautySalon {
    private Deque<Client> clientsQueue;
    private Deque<Client> manicureQueue;
    private String title;

    private int capacity = 5; // вместимость салона

    public BeautySalon( String title) {
        this.clientsQueue = new ArrayDeque<Client>();
        this.manicureQueue = new ArrayDeque<Client>();
        this.title = title;
    }
    public boolean hasFreePlace(){
        return manicureQueue.size() + clientsQueue.size() < capacity;
    }
    public boolean signUp(Client client){
        if (hasFreePlace()){
            return clientsQueue.add(client);
        }
        return false;
    }
    public boolean signUpForManicure(Client client){
        if (hasFreePlace()){
            return manicureQueue.add(client);
        }
        return false;
    }
    public void treatNextClient(){
        if(!clientsQueue.isEmpty()){
            Client client = clientsQueue.poll();
            client.setHasHaircut(true);
            System.out.println("Клиент " + client.getName() + " подстрижен");
        } else {
            System.out.println("Клиентов в очереди нет");
        }
    }
    public void makeManicure(){
        if(!manicureQueue.isEmpty()){
            Client client = manicureQueue.poll();
            client.setHasManicure(true);
            System.out.println("Клиенту " + client.getName() + " сделан маникюр");
        } else {
            System.out.println("Клиентов в очереди нет");
        }
    }
}

