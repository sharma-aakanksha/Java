package admin.model;

public class User {
    private String userid;
    private String name;
    private String email;
    private String mobile;
    private Cart cart;

    public User(String name, String email, String mobile) {
        this.userid = String.valueOf(this);
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.cart = createCart();
    }
    public Cart createCart() {
        Cart cart = new Cart(String.valueOf(this));
        return cart;
    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getMobile() {return mobile;}
    public Cart getCart() {return cart;}

    public String getUserid() {
        return userid;
    }
}
