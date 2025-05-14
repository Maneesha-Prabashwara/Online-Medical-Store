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
    // Use this Gson instance everywhere
    private final Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateAdaptory())
            .setPrettyPrinting()
            .create();

    public List<T> readAll() {
        try (Reader reader = new FileReader(file)) {
            Type listType = TypeToken.getParameterized(List.class, typeParameterClass).getType();
            List<T> dataList = gson.fromJson(reader, listType);
            return dataList != null ? dataList : new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void writeAll(List<T> dataList) {
        try (Writer writer = new FileWriter(file)) {
            gson.toJson(dataList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
