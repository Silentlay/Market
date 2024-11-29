import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{

    private final ArrayList<Actor> queue = new ArrayList<>(); // очередь для покупателей
    private final List<Actor> exitActors = new ArrayList<>();// ушедшие покупатели



    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + "вошел в магазин.");
        takeInQueue(actor); // помещаю в очередь

    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList) {
            System.out.println(actor.getName() + "покинул магазин.");
        }

    }

    @Override
    public void update() {
        System.out.println("Магазин обновляет свое состояние.");
            while (!queue.isEmpty()){
                takeOrders(); // Принимает заказы
                giveOrders(); //отдает заказы
                releaseFromQueue(); // убираю из очереди

            }
            System.out.println("Очередь пуста.");
    }


    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + "добавлен в очередь.");


    }

    @Override
    public void takeOrders() {
        System.out.println(queue.get(0).getName() + "делает заказ.");
    }
    @Override
    public void giveOrders() {
       System.out.println(queue.get(0).getName() + "получил заказ.");
    }

    @Override
    public void releaseFromQueue() {
        Actor actor = queue.remove(0);
        exitActors.add(actor); // Ушедший покупатель добавляется в список ушедших
        System.out.println(actor.getName() + "удален из очереди.");
    }

}
