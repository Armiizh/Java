public abstract class Animals {
    final String type,movement,name;
    protected Animals(String type, String name, String movement) {
        this.type = getType();
        this.movement = getMovement();
        this.name = getName();
    }
    protected String getType() {
        return getClass().getSimpleName();
    }
    protected abstract String getMovement();
    protected abstract String getName();
    public String toString() {
        return getType()+" по кличке " + getName()+ " " +getMovement();
    }
}
