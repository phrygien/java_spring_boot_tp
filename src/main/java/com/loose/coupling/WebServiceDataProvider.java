package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching data from looely coupling via Webservice";
    }
}
