package com.example.nikitaverma.zomato.model.search_for_resturants;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class ZomatoEvent implements Serializable{

    @SerializedName("event")
    @Expose
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}