package org.example;

import org.example.products.Shirt;
import org.example.products.Shoe;
import org.example.products.Trousers;

public interface ClothesFactory {

    //Crear objetos ( instancias ) tanto zapatos,camisa y pantalones
    Shoe createShoes();
    Shirt createShirt();
    Trousers craftTrousers();


}
