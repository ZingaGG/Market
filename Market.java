import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private final List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }


    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил заказ");
            }
        }
        
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
       for (Actor actor : queue) {
            if(!actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " Вышел из очереди");
            }
       }
        releaseFromMarket(releasedActors);
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " Встал в очередь");
        this.queue.add(actor);
        
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал заказ");
            }
        }
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " Вошел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " Вышел из магазина");
            queue.remove(actors);
        }
        
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
    
}
