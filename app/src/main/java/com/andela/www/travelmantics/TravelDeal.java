package com.andela.www.travelmantics;

import java.io.Serializable;

/**
 * Created by DELL on 02/08/2019.
 */

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String desc;
    private String price;
    private String imageUrl;


    public TravelDeal(){}

    public TravelDeal(String title, String desc, String price, String imageUrl) {
        this.setId(id);
        this.setTitle(title);
        this.setDesc(desc);
        this.setPrice(price);
        this.setImageUrl(imageUrl);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

