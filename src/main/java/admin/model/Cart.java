package admin.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
    private String userid;
    private ArrayList<String> books;
    private HashMap<String,Integer> book_quantity;

    public Cart(String userid) {
        this.userid = userid;
    }

    public String getUserid() {
        return userid;
    }
}
