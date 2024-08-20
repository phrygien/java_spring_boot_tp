package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    // Overriding the methode fron UserDataProvidergetUserAdresse
    @Override
    public String getUserDetails(){
        // Directly access database here
        return "User Details From Database Using Loose Coupling";
    }
}
