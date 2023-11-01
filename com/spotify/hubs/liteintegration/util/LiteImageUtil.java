package com.spotify.hubs.liteintegration.util.LiteImageUtil;
import java.lang.Float;
import java.lang.Object;
import android.content.Context;
import p.sp6;
import p.lp6;
import android.content.res.Resources;
import p.xj0;
import android.content.res.ColorStateList;
import p.n6;
import android.graphics.drawable.Drawable;
import p.nf0;
import p.wd5;
import p.p77;
import android.widget.ImageView;
import p.ju2;
import android.view.View;
import p.hu2;
import p.j13;
import java.lang.String;
import p.r45;
import p.uw5;
import p.te5;
import p.ez2;
import p.do5;
import java.lang.StringBuilder;
import p.io2;
import p.hv5;
import p.av5;
import p.mi;
import android.graphics.Paint;
import p.co5;
import p.ox7;

public final class LiteImageUtil	// class@0008be from classes.dex
{
    private static final Float CHECK_FILL_ICON_SIZE_DP;

    static {
       LiteImageUtil.CHECK_FILL_ICON_SIZE_DP = Float.valueOf(16.00f);
    }
    private void LiteImageUtil(){
       super();
    }
    private static lp6 createIconDrawable(Context p0,sp6 p1,Float p2,int p3){
       lp6 olp6 = new lp6(p0, p1, (float)xj0.e0(p2.floatValue(), p0.getResources()));
       olp6.c(n6.c(p0, p3));
       return olp6;
    }
    public static Drawable getCheckedIcon(Context p0){
       return LiteImageUtil.createIconDrawable(p0, sp6.E, LiteImageUtil.CHECK_FILL_ICON_SIZE_DP, R.color.icon_bg_white);
    }
    public static Drawable getPauseIcon(Context p0){
       return LiteImageUtil.makeCircleDrawable(p0, sp6.X);
    }
    public static Drawable getPlayIcon(Context p0){
       return LiteImageUtil.makeCircleDrawable(p0, sp6.Y);
    }
    private static void loadInto(wd5 p0,p77 p1,ImageView p2,ju2 p3,boolean p4,Object p5,Drawable p6,boolean p7){
       String str1;
       Context context = p2.getContext();
       j13 oj13 = p3.u().e();
       sp6 osp6 = uw5.s(p3.u().d()).f();
       int i = 0;
       String str = null;
       if (oj13 != null) {
          p2.setVisibility(i);
          str1 = oj13.a();
          if (!te5.a(str1)) {
             str = str1;
          }
          sp6 osp61 = uw5.s(oj13.c()).f();
          str1 = str+'/'+osp61+'/'+do5.D(oj13);
          if (!io2.j(str1, p2.getTag(R.id.hubs_internal_image_tag))) {
             p0.b(p2);
             hv5 ohv5 = p0.g(str);
             if (p6 != null) {
                ohv5.b(p6);
                ohv5.h(p6);
             }else if(osp61 != null){
                Drawable uDrawable = LiteImageUtil.placeholder(context, osp61, p7);
                ohv5.b(uDrawable);
                ohv5.h(uDrawable);
             }
             if (do5.D(oj13) == ez2.c) {
                ohv5.b.c(p1);
             }
             if (p5 != null) {
                ohv5.i(p5);
             }
             ohv5.e(p2);
          }
       }else if(osp6 != null){
          p2.setVisibility(i);
          p0.b(p2);
          if (!io2.j(p2.getTag(R.id.hubs_internal_image_tag), osp6)) {
             p2.setImageDrawable(mi.i(context, osp6));
          }
       }else {
          p0.b(p2);
          if (p4) {
             p2.setVisibility(8);
          }
       }
       str1 = str;
       p2.setTag(R.id.hubs_internal_image_tag, str1);
       return;
    }
    public static void loadIntoCard(wd5 p0,p77 p1,ImageView p2,ju2 p3,boolean p4){
       LiteImageUtil.loadIntoCard(p0, p1, p2, p3, p4, null, null);
    }
    public static void loadIntoCard(wd5 p0,p77 p1,ImageView p2,ju2 p3,boolean p4,Object p5,Drawable p6){
       LiteImageUtil.loadInto(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public static void loadIntoRow(wd5 p0,p77 p1,ImageView p2,ju2 p3){
       LiteImageUtil.loadInto(p0, p1, p2, p3, false, null, null, true);
    }
    private static nf0 makeCircleDrawable(Context p0,sp6 p1){
       lp6 olp6 = new lp6(p0, p1, (float)xj0.e0(16.00f, p0.getResources()));
       olp6.c(n6.c(p0, R.color.btn_play_pause_dark));
       nf0 onf0 = new nf0(olp6, 0x3f000000);
       onf0.c.setStrokeWidth(0);
       onf0.invalidateSelf();
       onf0.e = n6.c(p0, R.color.btn_bg_white);
       int[] state = onf0.getState();
       co5.l(state, "state");
       onf0.onStateChange(state);
       onf0.invalidateSelf();
       return onf0;
    }
    private static Drawable placeholder(Context p0,sp6 p1,boolean p2){
       if (p2) {
          return ox7.b(p0, p1, Float.NaN, (float)xj0.e0(32.00f, p0.getResources()));
       }
       return mi.i(p0, p1);
    }
}
