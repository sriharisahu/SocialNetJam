package com.grabhouse.codedesign.beans;

/**
 * Created by srihari on 1/11/15.
 */
public class Bid {
    private Integer bidId;
    private int bidPrice;
    private Integer houseId;
    private Integer userId;
    private boolean active;

    public Bid(){}

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public int getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bid)) return false;

        Bid bid = (Bid) o;

        if (getBidPrice() != bid.getBidPrice()) return false;
        if (isActive() != bid.isActive()) return false;
        if (!getBidId().equals(bid.getBidId())) return false;
        if (!getHouseId().equals(bid.getHouseId())) return false;
        return getUserId().equals(bid.getUserId());

    }

    @Override
    public int hashCode() {
        int result = getBidId().hashCode();
        result = 31 * result + getBidPrice();
        result = 31 * result + getHouseId().hashCode();
        result = 31 * result + getUserId().hashCode();
        result = 31 * result + (isActive() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "bidId=" + bidId +
                ", bidPrice=" + bidPrice +
                ", houseId=" + houseId +
                ", userId=" + userId +
                ", active=" + active +
                '}';
    }
}
