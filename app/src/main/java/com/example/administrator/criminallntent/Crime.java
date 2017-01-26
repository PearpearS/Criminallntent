package com.example.administrator.criminallntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2017/1/26.
 */
public class Crime{
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }
    public void setDate(Date date){
        mDate=date;
    }
    public Date getDate(){
        return mDate;
    }
    public void setSolved(boolean solved){
        mSolved=solved;
    }
    public boolean isSolved(){
        return mSolved;
    }

    public Crime(){
        mId=UUID.randomUUID();
        mDate=new Date();
    }
}

