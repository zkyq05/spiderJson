package com.zkyq.spiderJson.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TGirls {
    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String raw_title;
    private String view_price;
    private String view_fee;
    private String view_sales;

    private String item_loc;
    private String nick;
    private String pic_url;
    private String detail_url;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRaw_title() {
        return raw_title;
    }

    public void setRaw_title(String raw_title) {
        this.raw_title = raw_title;
    }

    public String getView_price() {
        return view_price;
    }

    public void setView_price(String view_price) {
        this.view_price = view_price;
    }

    public String getView_fee() {
        return view_fee;
    }

    public void setView_fee(String view_fee) {
        this.view_fee = view_fee;
    }

    public String getView_sales() {
        return view_sales;
    }

    public void setView_sales(String view_sales) {
        this.view_sales = view_sales;
    }

    public String getItem_loc() {
        return item_loc;
    }

    public void setItem_loc(String item_loc) {
        this.item_loc = item_loc;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
    }
}
