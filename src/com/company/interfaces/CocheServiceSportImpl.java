package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando Coche Sport");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche() {
        System.out.println("Destruyendo Coche");
    }
}
