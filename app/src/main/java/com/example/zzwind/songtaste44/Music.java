package com.example.zzwind.songtaste44;

/**
 * Created by zzwind on 2014/9/30.
 */
public class Music {
    public Music(){

    }
    private int ID;
    private String Name;
    private String Singer;
    private int UserId;
    private int Click;
    private String UpName;
    private String UpUIcon;
    private String GradeNum;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getClick() {
        return Click;
    }

    public void setClick(int click) {
        Click = click;
    }

    public String getUpName() {
        return UpName;
    }

    public void setUpName(String upName) {
        UpName = upName;
    }

    public String getUpUIcon() {
        return UpUIcon;
    }

    public void setUpUIcon(String upUIcon) {
        UpUIcon = upUIcon;
    }

    public String getGradeNum() {
        return GradeNum;
    }

    public void setGradeNum(String gradeNum) {
        GradeNum = gradeNum;
    }
}
