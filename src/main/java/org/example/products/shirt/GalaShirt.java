package org.example.products.shirt;

import org.example.products.Shirt;

//autor Imanol Sanchez Taneco

public class GalaShirt  implements Shirt {
    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa gala -- Tiene mangas largas ? ->Si");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa gala -- Tiene botones? ->Si");
        return true;
    }
}
