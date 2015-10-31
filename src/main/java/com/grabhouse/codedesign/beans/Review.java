package com.grabhouse.codedesign.beans;

import java.util.Date;

/**
 * Created by srihari on 31/10/15.
 */
public class Review {
    private String userId;
    private String houseId;
    private String description;
    private Date time;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review)) return false;

        Review review = (Review) o;

        if (!getUserId().equals(review.getUserId())) return false;
        if (!getHouseId().equals(review.getHouseId())) return false;
        if (getDescription() != null ? !getDescription().equals(review.getDescription()) : review.getDescription() != null)
            return false;
        return !(getTime() != null ? !getTime().equals(review.getTime()) : review.getTime() != null);

    }

    @Override
    public int hashCode() {
        int result = getUserId().hashCode();
        result = 31 * result + getHouseId().hashCode();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getTime() != null ? getTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Review{" +
                "userId='" + userId + '\'' +
                ", houseId='" + houseId + '\'' +
                ", description='" + description + '\'' +
                ", time=" + time +
                '}';
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
