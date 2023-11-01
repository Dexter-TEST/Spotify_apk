package p.av5;
import android.net.Uri;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import p.cv5;
import java.lang.String;
import java.util.List;
import java.lang.IllegalArgumentException;
import p.p77;
import java.util.ArrayList;

public final class av5	// class@000ffe from classes.dex
{
    public Uri a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public ArrayList f;
    public final Bitmap$Config g;
    public int h;

    public void av5(Uri p0,Bitmap$Config p1){
       super();
       this.a = p0;
       this.b = 0;
       this.g = p1;
    }
    public final cv5 a(){
       av5 uoav5 = this;
       if (uoav5.h == null) {
          uoav5.h = 2;
       }
       cv5 v1 = new cv5(uoav5.a, uoav5.b, null, uoav5.f, uoav5.c, uoav5.d, false, false, 0, uoav5.e, 0, 0, 0, false, false, uoav5.g, uoav5.h);
       return v1;
    }
    public final void b(int p0,int p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("Width must be positive number or 0.");
       }
       if (p1 < 0) {
          throw new IllegalArgumentException("Height must be positive number or 0.");
       }
       if (!p1 && !p0) {
          throw new IllegalArgumentException("At least one dimension has to be positive number.");
       }
       this.c = p0;
       this.d = p1;
       return;
    }
    public final void c(p77 p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Transformation must not be null.");
       }
       if (p0.a() == null) {
          throw new IllegalArgumentException("Transformation key must not be null.");
       }
       if (this.f == null) {
          this.f = new ArrayList(2);
       }
       this.f.add(p0);
       return;
    }
}
