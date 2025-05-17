package org.example.onlinemedicalstore.Interfaces;

import org.example.onlinemedicalstore.Classes.Supplier;

import java.util.List;

public interface ISupplierFileHandler {
    void writeSupplierToFile (Supplier supplier);
    List<Supplier> readSupplierFromFile();

}
