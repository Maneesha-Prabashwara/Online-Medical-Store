package org.example.onlinemedicalstore.Interfaces;

import org.example.onlinemedicalstore.Classes.Admin;

import java.util.List;

public interface IAdminFileHandler {
    void saveAdmin(Admin admin) ;

    List<Admin> getAllAdmins();
}
