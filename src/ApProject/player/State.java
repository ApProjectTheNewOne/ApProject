package src.ApProject.player;

public class State {
    private int gil = 1000;
    private Inventory inventory;

    State(int gil, Inventory inventory){
        this.gil = gil;
        this.inventory = inventory.copy();
    }

    void getState(int gil, Inventory inventory){
        gil = this.gil;
        inventory = this.inventory;
    }
}
