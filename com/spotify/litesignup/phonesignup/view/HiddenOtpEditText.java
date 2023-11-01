package com.spotify.litesignup.phonesignup.view.HiddenOtpEditText;
import p.pg;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.graphics.Canvas;
import android.widget.EditText;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import p.zp2;
import android.view.KeyEvent;
import p.a55;
import p.yp2;

public final class HiddenOtpEditText extends pg	// class@00096d from classes.dex
{
    public yp2 x;
    public static final int y;

    public void HiddenOtpEditText(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1);
    }
    public final void draw(Canvas p0){
       co5.o(p0, "canvas");
       p0.clipRect(0, 0, 0, 0);
       super.draw(p0);
       p0.restoreToCount(p0.save());
    }
    public final InputConnection onCreateInputConnection(EditorInfo p0){
       co5.o(p0, "outAttrs");
       return new zp2(this, super.onCreateInputConnection(p0));
    }
    public final void onDraw(Canvas p0){
       co5.o(p0, "canvas");
    }
    public final boolean onKeyDown(int p0,KeyEvent p1){
       boolean b;
       HiddenOtpEditText tx;
       co5.o(p1, "event");
       if (p0 != 67) {
       }else if((tx = this.x) != null){
          b = tx.a(this);
       label_0016 :
          boolean b1 = (b)? true: super.onKeyDown(p0, p1);
          return b1;
       }
       b = false;
       goto label_0016 ;
    }
    public final void setOnDeleteListener(yp2 p0){
       this.x = p0;
    }
}
