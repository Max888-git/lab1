package model;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Location {
    private Country country;
    private String name;
    private float rating;
    private String address;
    private String phone;
    private Boolean available;

    Location(){
        country = new Country();
        name = "NewLocation";
        rating = 5.0f;
        address = "new street";
        phone = "+380-50-00-0000";
        available = false;
    }

    public Location(Country country, String name, float rating, String address, String phone, Boolean available) {
        this.country = country;
        this.name = name;
        this.rating = rating;
        this.address = address;
        this.phone = phone;
        this.available = available;
    }

    /**
     * GETTER / SETTER
     */

    public Country getCountry(){
        return country;
    }
    public String getName(){
        return name;
    }
    public float getRating(){
        return rating;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public  Boolean isAvailable(){
        return available;
    }



    public String getLocation(){
        return (getCountry().getCountry() + ", " + getName());
    }
    public String getFullAddress(){
        return(getCountry().getCountry() + ", " + getAddress() + ", " + getName());
    }
    public String getInfo(){
        return (
                "Name: " + getName() +
                "\nAddress: " + getCountry().getCountry() + ", " + getAddress() +
                "\nStatus (Available): " + isAvailable() +
                "\nRating: " + getRating() + " stars" +
                "\nPhone: " + getPhone()
                );
    }

    public static final class Builder {
        private Country country;
        private String name;
        private float rating;
        private String address;
        private String phone;
        private Boolean available;

        public Builder() {
        }

        public static Builder aLocation() {
            return new Builder();
        }

        public Builder setCountry(Country country) {
            this.country = country;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRating(float rating) {
            this.rating = rating;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAvailable(Boolean available) {
            this.available = available;
            return this;
        }

        public Location build() {
            return new Location(country, name, rating, address, phone, available);
        }
    }
}
