package org.example.store;

import org.example.product.Product;
import org.example.product.pizza.Pizza;

import java.util.Objects;

public interface Store {
    public Product order(String type);
}
