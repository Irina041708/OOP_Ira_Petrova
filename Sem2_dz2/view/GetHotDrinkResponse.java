package Sem2_dz2.view;

public class GetHotDrinkResponse {
    private String error;
    private String name;
    private Integer price;

    public GetHotDrinkResponse(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    public GetHotDrinkResponse(String error) {
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    public char[] compareTo(GetHotDrinkResponse hotDrink) {
        return null;
    }
}
