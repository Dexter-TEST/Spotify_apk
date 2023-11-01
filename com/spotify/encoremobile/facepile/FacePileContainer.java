package com.spotify.encoremobile.facepile.FacePileContainer;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.view.View;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.graphics.Path;

public final class FacePileContainer extends LinearLayout	// class@000899 from classes.dex
{
    public Path a;
    public float b;

    public void FacePileContainer(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.setDuplicateParentStateEnabled(true);
    }
    public final boolean drawChild(Canvas p0,View p1,long p2){
       co5.o(p0, "canvas");
       co5.o(p1, "child");
       int i = this.indexOfChild(p1);
       if (this.a == null || i <= 0) {
          return super.drawChild(p0, p1, p2);
       }
       i = p0.save();
       FacePileContainer ta = this.a;
       boolean b = false;
       if (ta == null) {
          p0.restoreToCount(i);
          return b;
       }else {
          Context context = this.getContext();
          co5.l(context, "context");
          if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
             b = true;
          }
          float f = (b)? (float)p1.getLeft() + this.b: (float)p1.getLeft() - this.b;
          p0.translate(f, 0);
          p0.clipPath(ta);
          p0.translate((- f), 0);
          p0.restoreToCount(i);
          return super.drawChild(p0, p1, p2);
       }
    }
}
