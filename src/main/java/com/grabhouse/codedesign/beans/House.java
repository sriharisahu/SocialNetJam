package com.grabhouse.codedesign.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by srihari on 31/10/15.
 */
@Entity
@Table(name = "HOUSE")
public class House implements Serializable {
    @Id
    @GeneratedValue
    private Integer houseId;
    private double locationX;
    private double locationY;
    private String description;
    private float price;
    private String location;
    private List<Photo> photos;
    private Integer ownerId;

    public House(){}

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public double getLocationX() {
        return locationX;
    }

    public void setLocationX(double locationX) {
        this.locationX = locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public void setLocationY(double locationY) {
        this.locationY = locationY;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;

        House house = (House) o;

        if (Double.compare(house.getLocationX(), getLocationX()) != 0) return false;
        if (Double.compare(house.getLocationY(), getLocationY()) != 0) return false;
        if (Float.compare(house.getPrice(), getPrice()) != 0) return false;
        if (!getHouseId().equals(house.getHouseId())) return false;
        if (getDescription() != null ? !getDescription().equals(house.getDescription()) : house.getDescription() != null)
            return false;
        if (getLocation() != null ? !getLocation().equals(house.getLocation()) : house.getLocation() != null)
            return false;
        return !(getPhotos() != null ? !getPhotos().equals(house.getPhotos()) : house.getPhotos() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getHouseId().hashCode();
        temp = Double.doubleToLongBits(getLocationX());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getLocationY());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getPrice() != +0.0f ? Float.floatToIntBits(getPrice()) : 0);
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + (getPhotos() != null ? getPhotos().hashCode() : 0);
        return result;
    }
}
