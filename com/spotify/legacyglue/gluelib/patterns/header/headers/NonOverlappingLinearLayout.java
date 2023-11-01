package com.spotify.legacyglue.gluelib.patterns.header.headers.NonOverlappingLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;

public class NonOverlappingLinearLayout extends LinearLayout	// class@0008f9 from classes.dex
{

    public void NonOverlappingLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final boolean hasOverlappingRendering(){
       return false;
    }
}
