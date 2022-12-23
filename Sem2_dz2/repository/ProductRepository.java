package Sem2_dz2.repository;

import Sem2_dz2.entityes.Product;
import Sem2_dz2.entityes.ProductNameEnum;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private ArrayList<Product> products = new ArrayList<>();

    public List<Product> getAndDeleteProductByNames(List<Sem2_dz2.entityes.ProductNameEnum> list) {

        ArrayList<Product> answer = new ArrayList<>();

        for (ProductNameEnum name : list) {
            Product productByName = null;
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    productByName = product;
                    break;
                }
            }
            if (productByName == null) return new ArrayList<>();
            answer.add(productByName);
        }
        for (Product product : answer) products.remove(product);
        return answer;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
