public class Item{
    private double weight;
    private int cost;
    private StatModifiers itemStatMods;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public StatModifiers getItemStatMods() {
        return itemStatMods;
    }

    public void setItemStatMods(StatModifiers itemStatMods) {
        this.itemStatMods = itemStatMods;
    }
}