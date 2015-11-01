package com.grabhouse.codedesign.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by srihari on 31/10/15.
 */
@Entity
@Table(name="photo")
public class Photo {
    @Id
    @GeneratedValue
    public Integer photoId;
    public String photoUrl;

    public Photo(){}

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }


    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;

        Photo photo = (Photo) o;

        if (!getPhotoId().equals(photo.getPhotoId())) return false;
        return !(getPhotoUrl() != null ? !getPhotoUrl().equals(photo.getPhotoUrl()) : photo.getPhotoUrl() != null);

    }

    @Override
    public int hashCode() {
        int result = getPhotoId().hashCode();
        result = 31 * result + (getPhotoUrl() != null ? getPhotoUrl().hashCode() : 0);
        return result;
    }
}
