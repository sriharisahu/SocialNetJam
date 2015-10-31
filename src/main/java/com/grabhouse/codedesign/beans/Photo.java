package com.grabhouse.codedesign.beans;

/**
 * Created by srihari on 31/10/15.
 */
public class Photo {
    public String photoId;
    public String location;

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;

        Photo photo = (Photo) o;

        if (getPhotoId() != null ? !getPhotoId().equals(photo.getPhotoId()) : photo.getPhotoId() != null) return false;
        return !(getLocation() != null ? !getLocation().equals(photo.getLocation()) : photo.getLocation() != null);

    }

    @Override
    public int hashCode() {
        int result = getPhotoId() != null ? getPhotoId().hashCode() : 0;
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        return result;
    }
}
