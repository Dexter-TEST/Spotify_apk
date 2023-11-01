package p.ol;
import p.j22;
import android.net.Uri;
import p.u45;
import java.lang.Object;
import p.au0;
import java.util.List;
import p.dj0;
import java.lang.Iterable;
import java.lang.String;
import p.zf2;
import p.qn6;
import android.content.res.AssetManager;
import android.content.Context;
import java.io.InputStream;
import p.on;
import p.xe7;
import p.nn6;
import p.hp5;
import p.kl;
import p.pn6;
import p.r;
import java.io.File;
import p.g70;
import p.co5;
import android.webkit.MimeTypeMap;
import p.q63;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import java.io.FileInputStream;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import android.os.Build$VERSION;
import p.fl6;
import p.ib1;
import android.os.Bundle;
import android.graphics.Point;
import android.os.Parcelable;
import p.u3;

public final class ol implements j22	// class@002147 from classes.dex
{
    public final int a;
    public final Uri b;
    public final u45 c;

    public void ol(Uri p0,u45 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object a(au0 p0){
       File cacheDir;
       pn6 opn6;
       AssetFileDescriptor uAssetFileDe;
       fl6 a;
       Bundle uBundle;
       int i3;
       int i = 3;
       ol tc = this.c;
       ol tb = this.b;
       int i1 = 1;
       switch (this.a){
           case 0:
           default:
             ContentResolver contentResol = tc.a.getContentResolver();
             opn6 = 0;
             int i2 = (co5.c(tb.getAuthority(), "com.android.contacts") && co5.c(tb.getLastPathSegment(), "display_photo"))? 1: 0;
             String str1 = "\'.";
             InputStream inputStream = null;
             if (i2) {
                if ((uAssetFileDe = contentResol.openAssetFileDescriptor(tb, "r")) != null) {
                   inputStream = uAssetFileDe.createInputStream();
                }
                if (inputStream == null) {
                   throw new IllegalStateException("Unable to find a contact photo associated with \'"+tb+str1.toString());
                }
             }else if(Build$VERSION.SDK_INT >= 29){
                if (co5.c(tb.getAuthority(), "media")) {
                   List pathSegments = tb.getPathSegments();
                   if ((i3 = pathSegments.size()) >= i && (co5.c(pathSegments.get((i3 - 3)), "audio") && co5.c(pathSegments.get((i3 - 2)), "albums"))) {
                      a = 1;
                   }
                }
                if (opn6) {
                   u45 d = tc.d;
                   a = d.a;
                   if (a instanceof ib1) {
                   }else {
                      a = inputStream;
                   }
                   if (a != null) {
                      fl6 b = d.b;
                      if (b instanceof ib1) {
                      }else {
                         b = inputStream;
                      }
                      if (b != null) {
                         uBundle = new Bundle(i1);
                         uBundle.putParcelable("android.content.extra.SIZE", new Point(a.H, b.H));
                      label_0111 :
                         if ((uAssetFileDe = u3.c(contentResol, tb, uBundle)) != null) {
                            inputStream = uAssetFileDe.createInputStream();
                         }
                         if (inputStream == null) {
                            throw new IllegalStateException("Unable to find a music thumbnail associated with \'"+tb+str1.toString());
                         }
                      }
                   }
                   uBundle = inputStream;
                   goto label_0111 ;
                }
             }
             if ((inputStream = contentResol.openInputStream(tb)) == null) {
                throw new IllegalStateException("Unable to open \'"+tb+str1.toString());
             }
             cacheDir = tc.a.getCacheDir();
             cacheDir.mkdirs();
             return new qn6(new pn6(xe7.f(xe7.d0(inputStream)), cacheDir, new kl()), contentResol.getType(tb), i);
       }
       String str = dj0.q0(dj0.h0(tb.getPathSegments(), i1), "/", null, null, null, 62);
       cacheDir = tc.a.getCacheDir();
       cacheDir.mkdirs();
       opn6 = new pn6(xe7.f(xe7.d0(tc.a.getAssets().open(str))), cacheDir, new kl());
       return new qn6(opn6, r.b(MimeTypeMap.getSingleton(), str), i);
    }
}
