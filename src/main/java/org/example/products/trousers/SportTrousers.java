package org.example.products.trousers;

import org.example.products.Trousers;

public class SportTrousers implements Trousers {
    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones deprtivos -- Tienen  bolsillos? ->No");
        return false;
    }

    @Override
    public boolean getClosureType() {
        System.out.println("Pantalones deprtivos -- Tipo de cierre? ->Sin cierre");
        return false;
    }
}
