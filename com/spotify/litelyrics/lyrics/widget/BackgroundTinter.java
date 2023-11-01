package com.spotify.litelyrics.lyrics.widget.BackgroundTinter;
import android.view.View;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import p.xw5;
import android.graphics.drawable.Drawable;
import p.eb3;
import p.ce1;
import android.os.Build$VERSION;

final class BackgroundTinter	// class@00093e from classes.dex
{
    public final View a;
    public int b;

    public void BackgroundTinter(View p0){
       Context context = p0.getContext();
       co5.l(context, "view.context");
       Resources resources = context.getResources();
       super();
       this.a = p0;
       this.b = xw5.b(resources, R.color.lyrics_background_default, context.getTheme());
    }
    public final void setTint(int p0){
       this.b = p0;
       BackgroundTinter ta = this.a;
       Drawable uDrawable = eb3.L(ta.getBackground());
       co5.l(uDrawable, "wrap\(view.background\)");
       ce1.g(uDrawable, p0);
       ta.setBackground(uDrawable);
       if (Build$VERSION.SDK_INT <= 22) {
          ta.postInvalidate();
       }
       return;
    }
}
