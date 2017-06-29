package com.example.dbm0204.assignment103;

import android.graphics.drawable.Drawable;

/**
 * Created by dbm0204 on 6/29/17.
 */

public class ListViewItem {
    public final Drawable icon; // drawable for the ImagView
    public final String title;
    public final String desc;

    public Drawable getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public ListViewItem(Drawable icon, String title, String desc) {
        this.icon = icon;
        this.title = title;
        this.desc = desc;

    }
}
