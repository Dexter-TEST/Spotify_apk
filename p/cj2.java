package p.cj2;
import android.content.ServiceConnection;
import android.content.Context;
import p.et3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.x44;
import android.os.Bundle;
import p.zh0;
import p.fj2;
import p.ht3;
import p.mu3;
import p.fu3;
import p.gu3;
import android.view.View;
import java.util.ArrayList;
import p.ll1;
import p.pl1;
import android.os.BaseBundle;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import p.ej2;
import p.bf7;
import p.ej4;
import java.lang.IllegalStateException;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Handler;
import android.os.Message;

public final class cj2 implements ServiceConnection	// class@001219 from classes.dex
{
    public final Context a;
    public final x44 b;
    public zh0 c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final String j;

    public void cj2(Context p0,et3 p1){
       Context applicationC;
       et3 t = p1.t;
       co5.o(t, "applicationId");
       super();
       if ((applicationC = p0.getApplicationContext()) == null) {
       }else {
          p0 = applicationC;
       }
       this.a = p0;
       this.f = 0x10000;
       this.g = 0x10001;
       this.h = t;
       this.i = 0x133060d;
       this.j = p1.F;
       this.b = new x44(5, this);
       return;
    }
    public final void a(Bundle p0){
       cj2 tc;
       ArrayList stringArrayL;
       et3 b2;
       String str2;
       String str3;
       gu3 v1;
       if (this.d == null) {
       }else {
          boolean b = false;
          this.d = b;
          if ((tc = this.c) != null) {
             zh0 b1 = tc.b;
             zh0 c = tc.c;
             co5.o(b1, "this$0");
             co5.o(c, "$request");
             fj2 c1 = b1.c;
             cj2 uocj2 = null;
             if (c1 != null) {
                c1.c = uocj2;
             }
             b1.c = uocj2;
             ht3 v = b1.d().v;
             String str = "progressBar";
             if (v != null) {
                if ((v1 = v.a.v) != null) {
                   v1.setVisibility(8);
                }else {
                   co5.N(str);
                   throw uocj2;
                }
             }
             if (p0 != null) {
                if ((stringArrayL = p0.getStringArrayList("com.facebook.platform.extra.PERMISSIONS")) == null) {
                   stringArrayL = ll1.a;
                }
                if ((b2 = c.b) == null) {
                   b2 = pl1.a;
                }
                String str1 = p0.getString("com.facebook.platform.extra.ID_TOKEN");
                int i = 1;
                if (b2.contains("openid")) {
                   str1 = (str1 != null && str1.length())? 0: 1;
                   if (str1) {
                      b1.d().y();
                   }
                }
                if (stringArrayL.containsAll(b2)) {
                   if ((str2 = p0.getString("com.facebook.platform.extra.USER_ID")) != null && str2.length()) {
                      i = 0;
                   }
                   if (i) {
                      if ((v = b1.d().v) != null) {
                         if ((v1 = v.a.v) != null) {
                            v1.setVisibility(b);
                         }else {
                            co5.N(str);
                            throw uocj2;
                         }
                      }
                      if ((str3 = p0.getString("com.facebook.platform.extra.ACCESS_TOKEN")) != null) {
                         ej4.C(new ej2(p0, b1, c), str3);
                      }else {
                         throw new IllegalStateException("Required value was null.".toString());
                      }
                   }else {
                      b1.D(p0, c);
                   }
                }else {
                   HashSet hashSet = new HashSet();
                   Iterator iterator = b2.iterator();
                   while (iterator.hasNext()) {
                      String str4 = iterator.next();
                      if (!stringArrayL.contains(str4)) {
                         hashSet.add(str4);
                      }
                   }
                   if ((hashSet.isEmpty() ^ i)) {
                      b1.a(TextUtils.join(",", hashSet), "new_permissions");
                   }
                   c.b = hashSet;
                }
             }
             b1.d().y();
          }
       }
       return;
    }
    public final void b(ComponentName p0,IBinder p1){
       cj2 tj;
       cj2 te;
       co5.o(p0, "name");
       co5.o(p1, "service");
       this.e = new Messenger(p1);
       Bundle uBundle = new Bundle();
       uBundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
       if ((tj = this.j) != null) {
          uBundle.putString("com.facebook.platform.extra.NONCE", tj);
       }
       Message message = Message.obtain(null, this.f);
       message.arg1 = this.i;
       message.setData(uBundle);
       Messenger messenger = new Messenger(this.b);
       try{
          message.replyTo = messenger;
          if ((te = this.e) != null) {
             te.send(message);
          }
       }catch(android.os.RemoteException e0){
          this.a(null);
       }
       return;
    }
    public final void c(ComponentName p0){
       co5.o(p0, "name");
       try{
          this.e = null;
          this.a.unbindService(this);
          this.a(null);
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       this.b(p0, p1);
    }
    public final void onServiceDisconnected(ComponentName p0){
       this.c(p0);
    }
}
