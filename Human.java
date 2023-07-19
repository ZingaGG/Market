public class Human extends Actor{

    public Human(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    String getName(String name){
        return super.getName();
    }

    @Override
    String getName() {
        return super.getName();
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    public void setMakeOrder(boolean status) {
        
    }

    @Override
    public void setTakeOrder(boolean status) {
        
    }
    
}
