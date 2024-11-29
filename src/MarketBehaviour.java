import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor); // Принять покупателя в магазин
    void takeInQueue(Actor actor); // поставить в очередь
    void releaseFromQueue(); // убрать из очереди
    void releaseFromMarket(List<Actor> actorList); // Удалить покупателя из магазина
    void update(); // Обновить состояние магазина

}
