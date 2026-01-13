package org.junit;

public class DatabaseConnection {
    boolean connection=false;

    public void connect(){
        connection=true;
    }

    public void disconnect(){
        connection=false;
    }

    public boolean isConnected(){
        return connection;
    }
}
