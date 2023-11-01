package p.zh3;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.os.Build$VERSION;
import p.wa4;
import java.lang.Math;
import android.os.LocaleList;

public final class zh3 extends Paint	// class@002ef8 from classes.dex
{

    public void zh3(){
       super();
    }
    public void zh3(int p0){
       super(p0);
    }
    public void zh3(PorterDuff$Mode p0){
       super();
       this.setXfermode(new PorterDuffXfermode(p0));
    }
    public void zh3(PorterDuff$Mode p0,int p1){
       super(1);
       this.setXfermode(new PorterDuffXfermode(p0));
    }
    public final void setAlpha(int p0){
       if (Build$VERSION.SDK_INT < 30) {
          this.setColor(((Math.max(0, Math.min(255, p0)) << 24) | (this.getColor() & 0xffffff)));
       }else {
          super.setAlpha(Math.max(0, Math.min(255, p0)));
       }
       return;
    }
    public final void setTextLocales(LocaleList p0){
    }
}
