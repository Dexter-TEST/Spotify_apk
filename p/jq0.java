package p.jq0;
import android.content.Context;
import android.content.res.XmlResourceParser;
import java.lang.Object;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import p.oi;
import android.content.res.TypedArray;
import android.content.res.Resources;
import java.lang.String;
import p.sq0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class jq0	// class@001b22 from classes.dex
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public void jq0(Context p0,XmlResourceParser p1){
       int index;
       super();
       this.a = Float.NaN;
       this.b = Float.NaN;
       this.c = Float.NaN;
       this.d = Float.NaN;
       this.e = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p1), oi.E);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          if (!(index = typedArray.getIndex(i))) {
             index = typedArray.getResourceId(index, this.e);
             this.e = index;
             p0.getResources().getResourceName(index);
             if ("layout".equals(p0.getResources().getResourceTypeName(index))) {
                new sq0().b(LayoutInflater.from(p0).inflate(index, null));
             }
          }else if(index == 1){
             this.d = typedArray.getDimension(index, this.d);
          }else if(index == 2){
             this.b = typedArray.getDimension(index, this.b);
          }else if(index == 3){
             this.c = typedArray.getDimension(index, this.c);
          }else if(index == 4){
             this.a = typedArray.getDimension(index, this.a);
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
}
