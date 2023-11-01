package p.o11;
import p.zb0;
import p.p65;
import p.c0;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.v;
import io.reactivex.rxjava3.core.Flowable;
import p.wd5;
import io.reactivex.rxjava3.core.Scheduler;
import p.fd1;
import java.lang.reflect.Method;
import p.qv5;
import java.lang.String;
import p.co5;
import p.qs5;
import p.uw5;
import p.p95;
import p.hn5;
import p.np2;
import p.b30;
import p.a32;
import p.by6;
import p.yt6;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ox6;
import java.lang.StringBuilder;
import p.ce7;
import com.spotify.connectivity.connectiontype.DeferUntilConnected;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import p.an5;
import p.gs;
import java.lang.Long;
import p.gw;
import p.iv;
import java.lang.Boolean;
import p.mi5;
import com.google.common.collect.d;
import p.dl6;
import p.q43;
import p.j11;
import android.content.ComponentName;
import p.to6;
import p.v75;
import p.w50;
import p.fn0;
import p.u44;
import p.hs3;
import java.util.LinkedHashMap;
import p.so5;
import java.lang.Class;
import p.hi7;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.ir2;
import p.yf2;
import p.s36;
import p.ro5;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.xe7;
import p.mf1;
import io.reactivex.rxjava3.core.Observable;
import p.ur6;
import p.gg1;
import p.ry7;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.content.res.Resources;
import java.lang.NullPointerException;
import p.nt0;
import p.r45;
import p.rp;
import p.jg2;
import p.un3;
import p.zr5;
import p.al2;
import com.spotify.litenetwork.webapi.model.LitePlaylistObject;
import p.yz5;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.a06;
import p.sz5;
import p.n06;
import p.kg4;
import android.graphics.drawable.Drawable;
import p.sp6;
import p.xj0;
import p.ox7;
import p.hv5;
import p.zz5;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import p.o85;
import p.zk2;
import p.eo5;
import p.xz5;
import p.rr;
import p.m73;
import java.lang.IllegalStateException;
import p.cs;
import p.tp2;
import p.cz0;
import p.dz0;
import p.ez0;
import p.ks;
import p.i73;
import java.lang.Integer;
import p.xy0;
import p.ns;
import p.nt;
import p.kd7;
import p.sg2;
import p.x00;
import p.uv1;
import p.pt;
import p.wv;
import p.qa3;
import p.ru;
import p.f20;
import p.h20;
import p.xp2;
import p.b43;
import java.lang.Throwable;
import p.ty0;
import com.google.common.collect.c;
import p.ju;
import p.kw;
import p.t32;
import p.fv1;
import p.o32;
import java.io.File;
import p.f32;
import p.ws6;
import p.m42;
import java.io.IOException;
import p.p32;
import p.u32;
import p.q32;
import p.b32;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import p.v32;
import java.io.FileOutputStream;
import java.io.Closeable;
import p.g53;
import java.io.FileNotFoundException;
import androidx.fragment.app.d;
import androidx.fragment.app.o;
import java.util.Objects;
import p.ib0;
import p.gb0;
import p.la0;
import p.sa6;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.ko6;

public final class o11 implements zb0, p65	// class@00208b from classes.dex
{
    public final int a;
    public Object b;
    public Object c;
    public Object t;
    public Object v;
    public Object w;

    public void o11(int p0){
       this.a = p0;
       c0 a = c0.a;
       if (p0 != 27) {
          if (p0 != 29) {
             super();
             return;
          }else {
             super();
             this.t = a;
             this.v = a;
             this.w = a;
             return;
          }
       }else {
          super();
          this.v = a;
          this.w = a;
          return;
       }
    }
    public void o11(int p0,int p1){
       this.a = p0;
       super();
    }
    public void o11(View p0,ViewGroup p1,c p2,e p3,v p4){
       this.a = 1;
       this.w = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p4;
       super();
    }
    public void o11(Flowable p0,wd5 p1,Scheduler p2){
       this.a = 21;
       super();
       this.t = new fd1();
       this.b = p0;
       this.c = p1;
       this.v = p2;
    }
    public void o11(Object p0,Object p1,Object p2,Object p3,Object p4,int p5){
       this.a = p5;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       super();
    }
    public void o11(Method p0,qv5 p1){
       this.a = 16;
       co5.o(p0, "method");
       co5.o(p1, "requestTransformers");
       super();
       this.b = uw5.g(p0);
       this.c = new p95(p0);
       this.t = new hn5(p0);
       this.v = new np2(p0);
       this.w = new b30(p0, p1);
    }
    public void o11(a32 p0,a32 p1,by6 p2,yt6 p3){
       this.a = 14;
       co5.o(p0, "sourceDirectory");
       co5.o(p1, "destinationDirectory");
       co5.o(p3, "fileFactory");
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = new AtomicBoolean(false);
       if (!this.b.exists() || (!this.b.isDirectory() || !this.b.canRead())) {
          throw new ox6("Unable to access source directory: "+this.b);
       }
       if (this.c.exists() && (this.c.isDirectory() && this.c.canWrite())) {
          return;
       }
       throw new ox6("Unable to access destination directory: "+this.c);
    }
    public void o11(ce7 p0,Flowable p1,DeferUntilConnected p2,ConnectionApis p3){
       this.a = 20;
       co5.o(p3, "connectionApis");
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = new an5();
    }
    public void o11(gs p0){
       this.a = 8;
       super(p0, 0);
    }
    public void o11(gs p0,int p1){
       this.a = 8;
       super();
       this.b = Long.valueOf(p0.a);
       this.c = p0.b;
       this.t = p0.c;
       this.v = p0.d;
       this.w = p0.e;
    }
    public void o11(gw p0){
       this.a = 25;
       super();
       this.b = p0.a;
       this.c = p0.b;
       this.t = p0.c;
       this.v = p0.d;
       this.w = p0.e;
    }
    public void o11(gw p0,int p1){
       this.a = 25;
       super(p0);
    }
    public void o11(iv p0){
       this.a = 23;
       super();
       this.b = Boolean.valueOf(p0.a);
       this.c = p0.b;
       this.t = p0.c;
       this.v = p0.d;
       this.w = p0.e;
    }
    public void o11(iv p0,int p1){
       this.a = 23;
       super(p0);
    }
    public void o11(mi5 p0,mi5 p1,d p2,dl6 p3,d p4){
       this.a = 15;
       co5.o(p2, "intentDataParsers");
       co5.o(p4, "installReferrerParsers");
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
    }
    public void o11(q43 p0,j11 p1,ComponentName p2){
       this.a = 0;
       super();
       this.b = new Object();
       this.c = p0;
       this.t = p1;
       this.v = p2;
       this.w = null;
    }
    public void o11(to6 p0,Scheduler p1,v75 p2,w50 p3){
       this.a = 18;
       co5.o(p0, "spotifyBranch");
       co5.o(p2, "partnerUserIdService");
       co5.o(p3, "branchCache");
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = new fn0();
    }
    public void o11(u44 p0,hs3 p1){
       this.a = 17;
       co5.o(p1, "logger");
       super();
       this.b = p0;
       this.c = p1;
       this.t = new LinkedHashMap();
       this.v = new fn0();
       this.w = new an5();
       o11 tb = this.b;
       tb.getClass();
       Single single = Single.fromCallable(new hi7(2, tb)).map(ir2.H);
       co5.l(single, "override fun loadReport\(…}.toMap\(\)\n        }\n    }");
       Disposable uDisposable = single.subscribeOn(s36.c).subscribe(new ro5(this, 0), new ro5(this, 1));
       co5.l(uDisposable, "private fun setCurrentSt…    }\n            \)\n    }");
       xe7.S(this.v, uDisposable);
       uDisposable = this.w.concatMap(new mf1(3, this)).subscribe(new ro5(this, 2), new ro5(this, 3));
       co5.l(uDisposable, "private fun startListeni…        }\n        \)\n    }");
       xe7.S(this.v, uDisposable);
    }
    public void o11(ur6 p0,Scheduler p1){
       this.a = 24;
       super();
       this.b = p0;
       this.c = p1;
       this.t = new fn0();
    }
    public void o11(wd5 p0,Object p1){
       this.a = 22;
       super();
       this.c = new gg1();
       this.t = p0;
       this.b = p1;
    }
    public static o11 c(View p0){
       View view;
       View view1;
       View view2;
       View view3;
       int i = 0x7f0a0036;
       if ((view = ry7.q(p0, i)) != null) {
          i = 0x7f0a010c;
          if ((view1 = ry7.q(p0, i)) != null) {
             i = 0x7f0a0579;
             if ((view2 = ry7.q(p0, i)) != null) {
                i = 0x7f0a0582;
                if ((view3 = ry7.q(p0, i)) != null) {
                   o11 i1 = new o11(p0, view, view1, view2, view3, 12);
                   return i;
                }
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
    public static String p(nt0 p0,String p1){
       return r45.a(p0).g(new rp(23)).g(new un3(p1, 1)).e("");
    }
    public final void a(int p0,zr5 p1,Object p2){
       o11 tv;
       al2 u = p1.u;
       Context context = p1.a.getContext();
       CharSequence text = (TextUtils.isEmpty(p2.b))? context.getText(R.string.add_to_playlist_row_playlist_has_no_name): p2.b;
       al2 uoal2 = u;
       uoal2.setTitle(text);
       uoal2.setSubtitle(context.getString(R.string.add_to_playlist_row_subtitle_owned_by_you));
       kg4.c(p0, u.a, this.w, p2);
       if ((tv = this.v) == null) {
          tv = ox7.b(context, sp6.Z, Float.NaN, (float)xj0.e0(32.00f, context.getResources()));
          this.v = tv;
       }
       hv5 ohv5 = this.t.g(p2.c);
       ohv5.i(this.b);
       ohv5.h(tv);
       ohv5.b(tv);
       ohv5.e(u.v);
       return;
    }
    public final al2 b(RecyclerView p0){
       this.c.getClass();
       zz5 ozz5 = new zz5(xj0.x0(p0.getContext(), p0, R.layout.glue_listtile_2_image));
       eo5.P(ozz5);
       return new al2(ozz5);
    }
    public final rr d(){
       String str = (this.b == null)? " uri": "";
       if (this.c == null) {
          str = str.concat(" url");
       }
       if (this.t == null) {
          str = kg4.l(str, " metadata");
       }
       if (str.isEmpty()) {
          rr str1 = new rr(this.b, this.c, this.t, this.v, this.w);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final cs e(){
       String str = (this.b == null)? " identifier": "";
       if (this.c == null) {
          str = str.concat(" version");
       }
       if (str.isEmpty()) {
          tp2.v(this.v);
          return new cs(this.b, this.c, this.t, this.w);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final gs f(){
       String str = (this.b == null)? " timestamp": "";
       if (this.c == null) {
          str = str.concat(" type");
       }
       if (this.t == null) {
          str = kg4.l(str, " app");
       }
       if (this.v == null) {
          str = kg4.l(str, " device");
       }
       if (str.isEmpty()) {
          gs str1 = new gs(this.b.longValue(), this.c, this.t, this.v, this.w);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final ks g(){
       String str = (this.b == null)? " type": "";
       if (this.t == null) {
          str = str.concat(" frames");
       }
       if (this.w == null) {
          str = kg4.l(str, " overflowCount");
       }
       if (str.isEmpty()) {
          ks str1 = new ks(this.b, this.c, this.t, this.v, this.w.intValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final ns h(){
       String str = (this.b == null)? " pc": "";
       if (this.c == null) {
          str = str.concat(" symbol");
       }
       if (this.v == null) {
          str = kg4.l(str, " offset");
       }
       if (this.w == null) {
          str = kg4.l(str, " importance");
       }
       if (str.isEmpty()) {
          ns str1 = new ns(this.b.longValue(), this.c, this.t, this.v.longValue(), this.w.intValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final nt i(){
       String str = (this.b == null)? " innerUpdate": "";
       if (this.c == null) {
          str = str.concat(" modelExtractor");
       }
       if (this.t == null) {
          str = kg4.l(str, " eventExtractor");
       }
       if (this.v == null) {
          str = kg4.l(str, " modelUpdater");
       }
       if (this.w == null) {
          str = kg4.l(str, " innerEffectHandler");
       }
       if (str.isEmpty()) {
          nt str1 = new nt(this.b, this.c, this.t, this.v, this.w);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final pt j(){
       pt v6 = new pt(this.b, this.c, this.t, this.v, this.w);
       return v6;
    }
    public final ru k(){
       String str = (this.b == null)? " bitrateLevel": "";
       if (this.c == null) {
          str = str.concat(" strategy");
       }
       if (this.t == null) {
          str = kg4.l(str, " targetBitrateLevel");
       }
       if (this.v == null) {
          str = kg4.l(str, " targetBitrateAvailable");
       }
       if (this.w == null) {
          str = kg4.l(str, " hifiStatus");
       }
       if (str.isEmpty()) {
          ru str1 = new ru(this.b, this.c, this.t, this.v.booleanValue(), this.w);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final iv l(){
       String str = (this.b == null)? " requestFocus": "";
       if (str.isEmpty()) {
          iv str1 = new iv(this.b.booleanValue(), this.c, this.t, this.v, this.w);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final gw m(){
       String str = (this.b == null)? " triggerListState": "";
       if (this.c == null) {
          str = str.concat(" formatCapabilities");
       }
       if (this.t == null) {
          str = kg4.l(str, " actionCapabilities");
       }
       if (this.v == null) {
          str = kg4.l(str, " triggerTypes");
       }
       if (str.isEmpty()) {
          gw str1 = new gw(this.b, this.c, this.t, this.v, this.w);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final kw n(){
       String str = (this.c == null)? " uri": "";
       if (this.t == null) {
          str = str.concat(" username");
       }
       if (this.v == null) {
          str = kg4.l(str, " displayName");
       }
       if (this.w == null) {
          str = kg4.l(str, " created");
       }
       if (str.isEmpty()) {
          kw str1 = new kw(this.b, this.c, this.t, this.v, this.w.longValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void o(a32 p0,a32 p1){
       File parentFile;
       o32 v12;
       int a;
       o11 oo11 = this;
       a32 uoa32 = p0;
       Object obj = p1;
       co5.o(obj, "copy");
       oo11.v.i().getClass();
       String str = "Source \'";
       if (!p0.exists()) {
          throw new FileNotFoundException(str+uoa32+"\' does not exist");
       }
       String str1 = "\' exists but is a directory";
       if (p0.isDirectory()) {
          throw new IOException(str+uoa32+str1);
       }
       if (co5.c(p0.getCanonicalPath(), p1.getCanonicalPath())) {
          throw new IOException(str+uoa32+"\' and destination \'"+obj+"\' are the same");
       }
       String obj1 = obj;
       if ((parentFile = obj1.b.getParentFile()) != null) {
          v12 = new o32(obj1.a, parentFile, obj1.c, obj1.t, obj1.v);
       }else {
          o32 oo32 = null;
       }
       obj1 = "Destination \'";
       if (v12 != null && (!v12.mkdirs() && !v12.isDirectory())) {
          throw new IOException(obj1+v12+"\' directory cannot be created");
       }else if(p1.exists() && !p1.canWrite()){
          throw new IOException(obj1+obj+"\' exists but is read-only");
       }else if(p1.exists() && p1.isDirectory()){
          throw new IOException(obj1+obj+str1);
       }else {
          int i = 1;
          boolean b = false;
          int i1 = 4;
          int i2 = 2;
          p32 op32 = uoa32.a.b(uoa32);
          u32 ou32 = obj.a.e(obj, b);
          p32 op321 = op32;
          FileChannel channel = op321.a.getChannel();
          co5.l(channel, "inputStream.channel");
          b32 uob32 = v15;
          b32 uob321 = v15;
          uob32 = new b32(channel, op321.b, op321.c, op321.t, op321.v);
          u32 ou321 = ou32;
          FileChannel channel1 = ou321.a.getChannel();
          co5.l(channel1, "outputStream.channel");
          b32 v18 = new b32(channel1, ou321.b, ou321.c, ou321.t, ou321.v);
          long l = uob321.a.size();
          long l1 = 0;
          while ((l1 - l) < 0) {
             long l2 = l - l1;
             channel = 0x1e00000;
             long l3 = ((l2 - channel) > 0)? channel: l2;
             l2 = v18.b(uob321, l1, l3);
             if (!(l2)) {
                break ;
             }
             l1 = l1 + l2;
          }
          Closeable[] uCloseableAr = new Closeable[i1];
          uCloseableAr[b] = v18;
          uCloseableAr[i] = ou32;
          uCloseableAr[i2] = uob321;
          uCloseableAr[3] = op32;
          a = g53.a;
          for (; b < i1; b = b + 1) {
             g53.a(uCloseableAr[b]);
          }
          long l4 = p0.length();
          long l5 = p1.length();
          if (!(l4 - l5)) {
             obj.setLastModified(p0.lastModified());
             oo11.t.d(obj);
             return;
          }else {
             throw new IOException("Failed to copy full contents from \'"+uoa32+"\' to \'"+obj+"\' Expected length: "+l4+" Actual: "+l5);
          }
       }
    }
    public final void onCancel(){
       o11 tv;
       switch (this.a){
           case 1:
             this.b.clearAnimation();
             this.c.endViewTransition(this.b);
             this.t.a();
             if (o.I(2)) {
                Objects.toString(this.v);
             }
             break;
           default:
             if ((tv = this.v) != null) {
                tv.C(null);
             }
             return;
       }
       return;
    }
    public final void q(){
       switch (this.a){
           case 21:
           default:
             this.t.e();
             this.v = null;
             this.w = null;
             return;
       }
       cd1.d(this.t.a.a, null);
       return;
    }
    public final boolean r(a32 p0,a32 p1){
       a32 uoa321;
       a32[] uoa32Array = p0.a();
       boolean b = false;
       if (uoa32Array != null) {
          ko6 oko6 = xe7.D(uoa32Array);
          int i = 0;
          while (true) {
             if (oko6.hasNext()) {
                a32 uoa32 = oko6.next();
                int i1 = 1;
                if (uoa32.isDirectory()) {
                   if (!this.w.get()) {
                      return b;
                   }else {
                      uoa321 = this.v.d(p1, uoa32.getName());
                      if (!uoa321.exists() && !uoa321.mkdir()) {
                         throw new ox6("Unable to create nested folder "+uoa321);
                      }else if(uoa321.isFile()){
                         if (!uoa321.delete() || !uoa321.mkdir()) {
                            i1 = 0;
                         }
                         if (!i1) {
                            throw new ox6("Unable to replace existed file with folder "+uoa321);
                         }
                      }
                      if (uoa321.isDirectory() && uoa321.canWrite()) {
                         i = i | this.r(uoa32, uoa321);
                      }else {
                         throw new ox6(uoa321+" is not writable folder");
                      }
                   }
                }else {
                   uoa321 = this.v.d(p1, uoa32.getName());
                   int i2 = (!co5.c(uoa32.getName(), ".tag") && (!uoa321.exists() && (!(uoa32.length() - uoa321.length()) && (uoa32.lastModified() - uoa321.lastModified()) <= 0)))? 1: 0;
                   if (i2) {
                      try{
                         this.o(uoa32, uoa321);
                      }catch(java.io.IOException e0){
                         throw new ox6("Unable to copy file "+uoa32+" to "+uoa321);
                      }
                   }else {
                      this.t.d(uoa321);
                      i1 = 0;
                   }
                   i = i | i1;
                }
             }else {
                b = i;
                break ;
             }
          }
       }
       return b;
    }
    public final void s(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null url");
       }
       this.c = p0;
       return;
    }
}
