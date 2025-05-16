package org.example.onlinemedicalstore.FileHandlers;

import org.example.onlinemedicalstore.Classes.Admin;
import org.example.onlinemedicalstore.FileConfig.Config;
import org.example.onlinemedicalstore.Interfaces.IAdminFileHandler;

import java.util.List;

public class AdminFileHandler implements IAdminFileHandler
{

    private final String FILEPATH = Config.ADMINS.getPath();

    @Override
    public void saveAdmin(Admin admin) {


    }

    @Override
    public List<Admin> getAllAdmins() {
        return null;
    }
}