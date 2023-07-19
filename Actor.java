public abstract class Actor implements ActorBehaviour {
    protected String name;

    public boolean isMakeOrder(){
        return false;
    };
    public boolean isTakeOrder(){
        return false;
    };

    String getName(){
        return this.name;
    }

    public Actor (String name) {
        this.name = name;
    }
}

