package org.example.products.shoe;

import org.example.products.Shoe;

//autor Imanol Sanchez Taneco

public class GalaShoe implements Shoe {

    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos de gala -- Son zapatos elegantes? ->Si");
        return true;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatps de gala -- Son Zapatos para correr? ->No");
        return false;
    }
}
