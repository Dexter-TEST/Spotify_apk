package p.fb;
import android.text.method.TransformationMethod;
import android.content.Context;
import java.lang.Object;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.CharSequence;
import android.view.View;
import java.lang.String;
import java.util.Locale;
import android.graphics.Rect;

public final class fb implements TransformationMethod	// class@00159a from classes.dex
{
    public final Locale a;

    public void fb(Context p0){
       super();
       this.a = p0.getResources().getConfiguration().locale;
    }
    public final CharSequence getTransformation(CharSequence p0,View p1){
       String str = (p0 != null)? p0.toString().toUpperCase(this.a): null;
       return str;
    }
    public final void onFocusChanged(View p0,CharSequence p1,boolean p2,int p3,Rect p4){
    }
}
