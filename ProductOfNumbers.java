import java.util.*;

class ProductOfNumbers {
    List<Integer> ProductList;

    public ProductOfNumbers() {
        ProductList = new ArrayList<>();
        ProductList.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            ProductList = new ArrayList<>();
            ProductList.add(1);
        } else {
            ProductList.add(ProductList.get(ProductList.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int size = ProductList.size() - 1;
        if (k > size) {
            return 0;
        } else {
            return ProductList.get(size) / ProductList.get(size - k);
        }
    }
}