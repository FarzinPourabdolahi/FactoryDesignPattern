package org.example.product.pizza;

import org.example.product.Product;

public interface Pizza extends Product {
    public void prepare();
    public void bake();
    public void cut();
    public void box();
}
