package p.ob2;
import p.jy0;
import java.lang.Object;
import p.mf6;
import java.lang.Boolean;
import p.ao;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.os.Handler;
import android.content.res.ColorStateList;
import p.bd6;
import android.graphics.Rect;
import p.is7;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import java.lang.StringBuilder;
import p.ly0;
import p.m60;
import org.json.JSONObject;
import android.content.Context;
import p.ji5;
import p.lv1;
import android.content.res.TypedArray;
import p.ry7;
import p.d0;
import p.ad6;
import p.yg0;
import android.accounts.Account;
import p.sk;
import p.wh0;
import p.bc6;
import p.k80;
import android.util.Base64;

public final class ob2 implements jy0	// class@0020e7 from classes.dex
{
    public final int a;
    public final int b;
    public Object c;
    public Object t;
    public Object v;
    public Object w;
    public final Object x;

    public void ob2(){
       this.a = 1;
       super();
       this.b = 0;
       this.x = mf6.a;
    }
    public void ob2(int p0,Boolean p1,ao p2,AudioManager$OnAudioFocusChangeListener p3,Handler p4,Boolean p5){
       this.a = 4;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       this.x = p5;
    }
    public void ob2(int p0,Boolean p1,ao p2,AudioManager$OnAudioFocusChangeListener p3,Handler p4,Boolean p5,int p6){
       this.a = 4;
       super(p0, p1, p2, p3, p4, p5);
    }
    public void ob2(ColorStateList p0,ColorStateList p1,ColorStateList p2,int p3,bd6 p4,Rect p5){
       this.a = 2;
       super();
       is7.g(p5.left);
       is7.g(p5.top);
       is7.g(p5.right);
       is7.g(p5.bottom);
       this.c = p5;
       this.t = p1;
       this.v = p0;
       this.w = p2;
       this.b = p3;
       this.x = p4;
    }
    public void ob2(String p0,List p1,String p2,String p3){
       this.a = 0;
       super();
       p0.getClass();
       this.c = p0;
       p2.getClass();
       this.t = p2;
       this.v = p3;
       p1.getClass();
       this.x = p1;
       this.b = 0;
       this.w = p0+"-"+p2+"-"+p3;
    }
    public void ob2(ly0 p0,String p1,String p2,String p3,String p4,int p5){
       this.a = 3;
       this.x = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       this.b = p5;
       super();
    }
    public void ob2(m60 p0,JSONObject p1,String p2){
       this.a = 5;
       this.x = p0;
       super();
       String str = "";
       this.c = str;
       this.b = 1;
       this.v = str;
       try{
          this.w = str;
          this.t = p2;
          if (p1.has("id")) {
             this.c = p1.getString("id");
          }
          if (p1.has("number_of_use")) {
             this.b = p1.getInt("number_of_use");
          }
          if (p1.has("url")) {
             this.v = p1.getString("url");
          }
          if (p1.has("html")) {
             this.w = p1.getString("html");
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void ob2(m60 p0,JSONObject p1,String p2,int p3){
       this.a = 5;
       super(p0, p1, p2);
    }
    public static boolean a(Context p0,ob2 p1){
       p1.getClass();
       ji5 oji5 = ji5.g(p0);
       oji5.getClass();
       int i = 0;
       if ((p1 = p1.b) > oji5.h(i, "bnc_branch_view_use_"+p1.c) || p1 == -1) {
          i = true;
       }
       return i;
    }
    public static ob2 c(Context p0,int p1){
       ob2 bd6.a(p0, typedArray.getResourceId(5, i1), typedArray.getResourceId(6, i1), new d0((float)i1));
       int i = 1;
       int i1 = 0;
       boolean b = (p1)? true: false;
       is7.f("Cannot create a CalendarItemStyle with a styleResId of 0", b);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.w);
       typedArray.recycle();
       bd6.a(p0, typedArray.getResourceId(5, i1), typedArray.getResourceId(6, i1), new d0((float)i1)) = new ob2(ry7.x(p0, typedArray, 4), ry7.x(p0, typedArray, 9), ry7.x(p0, typedArray, 7), typedArray.getDimensionPixelSize(8, i1), new bd6(bd6.a(p0, typedArray.getResourceId(5, i1), typedArray.getResourceId(6, i1), new d0((float)i1))), new Rect(typedArray.getDimensionPixelOffset(i1, i1), typedArray.getDimensionPixelOffset(2, i1), typedArray.getDimensionPixelOffset(i, i1), typedArray.getDimensionPixelOffset(3, i1)));
       return bd6.a(p0, typedArray.getResourceId(5, i1), typedArray.getResourceId(6, i1), new d0((float)i1));
    }
    public final yg0 b(){
       yg0 v6 = new yg0(this.v, this.w, this.c, this.t, this.x);
       return v6;
    }
    public final void h(wh0 p0){
       ob2 b1;
       ob2 oob2 = this;
       wh0 owh0 = p0;
       ly0 r = oob2.x.r;
       k80 ok80 = k80.a(oob2.c);
       k80 ok801 = k80.a(oob2.t);
       k80 ok802 = k80.a(oob2.v);
       k80 ok803 = k80.a(oob2.w);
       k80 ok804 = (r != null)? k80.a(r): null;
       owh0.o(7, 2);
       int i = wh0.a(6, ok803) + (wh0.a(3, ok802) + (wh0.a(2, ok801) + (wh0.a(1, ok80) + 0)));
       k80 b = bc6.b;
       if (ok804 != null) {
          i = wh0.a(9, ok804) + (wh0.a(8, b) + i);
       }
       int i1 = wh0.d(10);
       int i2 = ((b1 = oob2.b) >= null)? wh0.b(b1): 10;
       owh0.n(((i1 + i2) + i));
       owh0.i(1, ok80);
       owh0.i(2, ok801);
       owh0.i(3, ok802);
       owh0.i(6, ok803);
       if (ok804 != null) {
          owh0.i(8, b);
          owh0.i(9, ok804);
       }
       owh0.j(10, b1);
       return;
    }
    public final String toString(){
       switch (this.a){
           case 0:
             StringBuilder str = "FontRequest {mProviderAuthority: "+this.c+", mProviderPackage: "+this.t+", mQuery: "+this.v+", mCertificates:";
             int i = 0;
             int i1 = 0;
             while (true) {
                ob2 tx = this.x;
                if (i1 < tx.size()) {
                   str = str.append(" [");
                   List list = tx.get(i1);
                   for (int i2 = 0; i2 < list.size(); i2 = i2 + 1) {
                      str = str.append(" \"").append(Base64.encodeToString(list.get(i2), i)).append("\"");
                   }
                   str = str.append(" ]");
                   i1 = i1 + 1;
                }else {
                   break ;
                }
             }
             return str+"}"+"mCertificatesArray: "+this.b;
             break;
       }
       return super.toString();
    }
}
