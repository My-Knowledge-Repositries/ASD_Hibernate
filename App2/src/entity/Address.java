package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(length = 45, nullable = false)
    private String country;
    @Column(length = 45, nullable = false)
    private String city;
    private int postal;

    public Address(String country, String city, int postal) {
        this.country = country;
        this.city = city;
        this.postal = postal;
    }

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", postal=" + postal +
                '}';
    }
}
