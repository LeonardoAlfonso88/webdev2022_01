package com.webdev.solid3.ISP;

import java.util.List;

public interface ModifyUserInformation {

    public void saveUser(String name);
    public void updateUser(String name);
    public void deleteUser(String identification);
}
