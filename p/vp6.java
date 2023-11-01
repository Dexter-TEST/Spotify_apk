package p.vp6;
import p.he1;
import android.widget.ImageView;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.view.View;

public final class vp6 implements he1	// class@002a3f from classes.dex
{
    public final ImageView a;

    public void vp6(ImageView p0){
       this.a = p0;
    }
    public final Drawable a(Bitmap p0){
       return new BitmapDrawable(this.a.getResources(), p0);
    }
}
