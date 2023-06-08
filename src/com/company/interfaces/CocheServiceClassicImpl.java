package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando Coche Clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche() {
        System.out.println("Destruyendo Coche");
    }


}
