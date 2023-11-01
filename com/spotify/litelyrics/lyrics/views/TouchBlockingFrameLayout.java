package com.spotify.litelyrics.lyrics.views.TouchBlockingFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.view.MotionEvent;

public final class TouchBlockingFrameLayout extends FrameLayout	// class@00093d from classes.dex
{
    public boolean a;

    public void TouchBlockingFrameLayout(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
    }
    public final boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = (this.a != null)? true: super.onInterceptTouchEvent(p0);
       return b;
    }
}
