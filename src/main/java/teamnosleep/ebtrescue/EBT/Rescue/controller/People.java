package teamnosleep.ebtrescue.EBT.Rescue.controller;

import java.io.*;
import java.net.*;

public class People{
    private String Name;
    private String Age;

    public String getName(){
        return Name;
    }
    public String getAge(){
        return Age;
    }
    public void setName(String nam){
        Name = nam;
    }
    public void setAge(String a){
        Age = a;
    }
}