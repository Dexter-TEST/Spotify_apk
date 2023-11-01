package p.c33;
import android.content.Context;
import p.wd5;
import p.p77;
import p.id0;
import p.az2;
import java.lang.Object;
import java.lang.Class;
import p.t67;
import android.widget.ImageView;
import java.lang.String;
import p.r45;
import p.uw5;
import p.sp6;
import android.view.View;
import p.lp6;
import p.mi;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.bz2;
import android.util.Base64;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import p.cz2;
import p.j13;
import java.util.ArrayList;
import p.ez2;
import p.do5;
import p.hv5;

public final class c33	// class@00118a from classes.dex
{
    public final Context a;
    public final wd5 b;
    public final p77 c;
    public final az2 d;
    public final t67 e;

    public void c33(Context p0,wd5 p1,p77 p2,p77 p3,id0 p4,az2 p5){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       p2.getClass();
       this.c = p2;
       p5.getClass();
       this.d = p5;
       this.e = new t67(p0, p4, p3, p2);
    }
    public static void c(ImageView p0,String p1){
       sp6 osp6;
       if ((osp6 = uw5.s(p1).e(sp6.o0)) != p0.getTag(R.id.hub_glue_internal_tag_image_icon)) {
          p0.setImageDrawable(mi.i(p0.getContext(), osp6));
          p0.setTag(R.id.hub_glue_internal_tag_image_icon, osp6);
       }
       return;
    }
    public static Uri d(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       return Uri.parse(p0);
    }
    public final Drawable a(String p0,bz2 p1){
       if (!TextUtils.isEmpty(p0) && p0.startsWith("data:image/webp;base64,")) {
          byte[] uobyteArray = Base64.decode(p0.substring(23), 0);
          return new BitmapDrawable(this.a.getResources(), BitmapFactory.decodeByteArray(uobyteArray, 0, uobyteArray.length));
       }else if(p1 != null){
          p1 = bz2.t;
       }
       return this.d.a(p0, p1);
    }
    public final void b(ImageView p0,j13 p1,bz2 p2){
       c33 tb = this.b;
       if (p1 == null) {
          tb.b(p0);
          p0.setImageDrawable(null);
       }else {
          Uri uri = c33.d(p1.a());
          Drawable uDrawable = this.a(p1.c(), p2);
          ArrayList uArrayList = new ArrayList();
          if (do5.D(p1) == ez2.c) {
             uArrayList.add(this.c);
          }
          tb.getClass();
          hv5 ohv5 = new hv5(tb, uri);
          ohv5.h(uDrawable);
          ohv5.b(uDrawable);
          ohv5.j(uArrayList);
          ohv5.e(p0);
       }
       return;
    }
}
