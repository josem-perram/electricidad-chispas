package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Factura;
import com.iesam.chispas.domain.models.Item;

import java.util.List;
import java.util.TreeMap;

public class FacturaDataStore {

    private static FacturaDataStore instance = null;

    private TreeMap<Integer, Factura> dataStore = new TreeMap<>();

    public void guardar(Factura factura) {
        dataStore.put(factura.getCodFactura(), factura);
    }

    public void eliminar(Factura factura) {
        dataStore.remove(factura.getCodFactura());
    }

    public List<Factura> getAll() {
        return dataStore.values().stream().toList();
    }

    public Factura findById(Integer codigo) {
        return dataStore.get(codigo);
    }

    public static FacturaDataStore getInstance() {
        if (instance == null) {
            instance = new FacturaDataStore();
        }
        return instance;
    }
}
