package com.spotify.messaging.criticalmessaging.criticalmessagingview.internal.encorecomponents.messageimage.MessageImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ox7;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.o74;

public final class MessageImageView extends AppCompatImageView	// class@000a21 from classes.dex
{

    public void MessageImageView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ox7.D, 0, 0);
       co5.l(typedArray, "context.obtainStyledAttr…ageView, defStyleAttr, 0\)");
       typedArray.getDimensionPixelSize(0, 0);
       typedArray.getFloat(1, 0x3f800000);
       ox7.H(this, 0);
       typedArray.recycle();
    }
    private final int getImageSize(){
       int width = (this.getLayoutParams().width <= null)? this.getWidth(): this.getLayoutParams().width;
       return width;
    }
    public final void setViewContext(o74 p0){
       co5.o(p0, "viewContext");
    }
}
