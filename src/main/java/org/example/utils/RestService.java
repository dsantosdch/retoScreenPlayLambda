package org.example.utils;

public enum RestService {

    BASE_URL("https://retorest.s3.us-east-2.amazonaws.com/"),
    GET_OBJECT("perro.jpg");

    private String uri;

    RestService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }

}
