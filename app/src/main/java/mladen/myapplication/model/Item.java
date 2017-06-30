package mladen.myapplication.model;

/**
 * Created by Mladen on 6/29/2017.
 */

public class Item {

    private Vest vest;
    private String title;
    private int type;

public Item(Vest vest){
    this.vest = vest;
    type = 0;
}

public Item(String title){
    this.title = title;
    type = 1;
}

    public Vest getVest() {
        return vest;
    }

    public void setVest(Vest vest) {
        this.vest = vest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
