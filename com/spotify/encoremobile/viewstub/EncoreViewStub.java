package com.spotify.encoremobile.viewstub.EncoreViewStub;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class EncoreViewStub extends View	// class@00089e from classes.dex
{

    public void EncoreViewStub(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.setWillNotDraw(true);
    }
    public final void onMeasure(int p0,int p1){
       this.setMeasuredDimension(0, 0);
    }
}
