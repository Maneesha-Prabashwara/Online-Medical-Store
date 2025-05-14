package org.example.onlinemedicalstore.Utils;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import org.example.onlinemedicalstore.Classes.Customer;
import org.example.onlinemedicalstore.Classes.Supplier;
import org.example.onlinemedicalstore.Classes.User;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericCRUD<T > {
    private final Class<T> typeParameterClass;
    private final File file;


    public GenericCRUD(Class<T> typeParameterClass, String filePath) {
        this.typeParameterClass = typeParameterClass;
        this.file = new File(filePath);
    }
    