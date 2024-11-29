// Реализовать класс Market и все методы, которые он
// обязан реализовывать. Методы из интерфейса
// QueueBehaviour, имитируют работу очереди,
// MarketBehaviour – помещает и удаляет человека из очереди,
// метод update – обновляет состояние магазина (принимает и отдает заказы)

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor actor1 = new Actor("Андрей ");
        Actor actor2 = new Actor("Максим ");
        Actor actor3 = new Actor("Влад ");

        market.acceptToMarket(actor1);
        market.acceptToMarket(actor2);
        market.acceptToMarket(actor3);

        market.update();

        List<Actor> leavingActors = new ArrayList<>();
        leavingActors.add(actor1);
        leavingActors.add(actor2);
        leavingActors.add(actor3);

        market.releaseFromMarket(leavingActors);
    }
}