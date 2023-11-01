package p.hk0;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;

public abstract class hk0	// class@001868 from classes.dex
{

    public static Drawable a(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       return Drawable.createFromXmlInner(p0, p1, p2, p3);
    }
    public static int b(TypedArray p0){
       return p0.getChangingConfigurations();
    }
    public static void c(Drawable p0,Resources p1,XmlPullParser p2,AttributeSet p3,Resources$Theme p4){
       p0.inflate(p1, p2, p3, p4);
    }
}
