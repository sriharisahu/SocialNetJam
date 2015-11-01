package com.grabhouse.codedesign.beans;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by srihari on 31/10/15.
 */
@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue
    private Integer reviewId;
    private String userId;
    @OneToOne
    @JoinColumn(name = "houseId")
    private House house;
    private String description;
    private Date createdTime;
    private Date updatedTime;

    public Review(){}

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review)) return false;

        Review review = (Review) o;

        if (!getReviewId().equals(review.getReviewId())) return false;
        if (!getUserId().equals(review.getUserId())) return false;
        if (!getHouse().equals(review.getHouse())) return false;
        if (getDescription() != null ? !getDescription().equals(review.getDescription()) : review.getDescription() != null)
            return false;
        if (getCreatedTime() != null ? !getCreatedTime().equals(review.getCreatedTime()) : review.getCreatedTime() != null)
            return false;
        return !(getUpdatedTime() != null ? !getUpdatedTime().equals(review.getUpdatedTime()) : review.getUpdatedTime() != null);

    }

    @Override
    public int hashCode() {
        int result = getReviewId().hashCode();
        result = 31 * result + getUserId().hashCode();
        result = 31 * result + getHouse().hashCode();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getCreatedTime() != null ? getCreatedTime().hashCode() : 0);
        result = 31 * result + (getUpdatedTime() != null ? getUpdatedTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", userId='" + userId + '\'' +
                ", house=" + house +
                ", description='" + description + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
