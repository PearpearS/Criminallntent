package com.example.administrator.criminallntent;

import java.util.UUID;

/**
 * Created by Administrator on 2017/1/20.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public Crime(){
        mId=UUID.randomUUID();
    }
}
