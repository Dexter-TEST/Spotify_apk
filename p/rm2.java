package p.rm2;
import p.pm2;
import java.io.FilterOutputStream;
import p.fs3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.oe0;
import java.nio.charset.Charset;
import java.io.OutputStream;
import p.tm2;
import java.lang.NullPointerException;
import java.util.Arrays;
import p.kg4;
import java.util.Locale;
import java.net.URLEncoder;
import android.net.Uri;
import p.am5;
import android.content.Context;
import p.sz1;
import android.content.ContentResolver;
import android.database.Cursor;
import java.io.InputStream;
import p.ej4;
import java.lang.Integer;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import p.az5;
import android.graphics.Bitmap;
import android.graphics.Bitmap$CompressFormat;
import p.qm2;
import java.lang.IllegalArgumentException;

public final class rm2 implements pm2	// class@002515 from classes.dex
{
    public final OutputStream a;
    public final fs3 b;
    public boolean c;
    public final boolean d;

    public void rm2(FilterOutputStream p0,fs3 p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = true;
       this.d = p2;
    }
    public final void a(String p0,String p1){
       rm2 tb;
       co5.o(p0, "key");
       co5.o(p1, "value");
       this.c(p0, null, null);
       Object[] objArray = new Object[]{p1};
       this.f("%s", objArray);
       this.h();
       if ((tb = this.b) == null) {
       }else {
          tb.a(p1, co5.K(p0, "    "));
       }
       return;
    }
    public final void b(String p0,Object[] p1){
       String j;
       byte[] bytes2;
       co5.o(p1, "args");
       rm2 ta = this.a;
       if (this.d == null) {
          if (this.c != null) {
             Charset a = oe0.a;
             byte[] bytes = "--".getBytes(a);
             co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
             ta.write(bytes);
             if ((j = tm2.j) != null) {
                bytes = j.getBytes(a);
                co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
                ta.write(bytes);
                byte[] bytes1 = "\r\n".getBytes(a);
                co5.l(bytes1, "\(this as java.lang.String\).getBytes\(charset\)");
                ta.write(bytes1);
                this.c = false;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
             }
          }
          p1 = Arrays.copyOf(p1, p1.length);
          p0 = kg4.q(p1, p1.length, p0, "java.lang.String.format\(format, *args\)");
          bytes2 = p0.getBytes(oe0.a);
          co5.l(bytes2, "\(this as java.lang.String\).getBytes\(charset\)");
          ta.write(bytes2);
       }else {
          p1 = Arrays.copyOf(p1, p1.length);
          p0 = String.format(Locale.US, p0, Arrays.copyOf(p1, p1.length));
          co5.l(p0, "java.lang.String.format\(locale, format, *args\)");
          p0 = URLEncoder.encode(p0, "UTF-8");
          co5.l(p0, "encode\(String.format\(Locale.US, format, *args\), \"UTF-8\"\)");
          bytes2 = p0.getBytes(oe0.a);
          co5.l(bytes2, "\(this as java.lang.String\).getBytes\(charset\)");
          ta.write(bytes2);
       }
       return;
    }
    public final void c(String p0,String p1,String p2){
       Object[] objArray1;
       if (this.d == null) {
          Object[] objArray = new Object[]{p0};
          this.b("Content-Disposition: form-data; name=\"%s\"", objArray);
          if (p1 != null) {
             objArray1 = new Object[]{p1};
             this.b("; filename=\"%s\"", objArray1);
          }
          objArray1 = new Object[0];
          this.f("", objArray1);
          if (p2 != null) {
             objArray1 = new Object[]{"Content-Type",p2};
             this.f("%s: %s", objArray1);
          }
          objArray1 = new Object[0];
          this.f("", objArray1);
       }else {
          Object[] objArray2 = new Object[]{p0};
          byte[] bytes = kg4.q(objArray2, 1, "%s=", "java.lang.String.format\(format, *args\)").getBytes(oe0.a);
          co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          this.a.write(bytes);
       }
       return;
    }
    public final void d(String p0,Uri p1,String p2){
       Cursor uCursor;
       long l;
       int i1;
       co5.o(p0, "key");
       co5.o(p1, "contentUri");
       if (p2 == null) {
          p2 = "content/unknown";
       }
       this.c(p0, p0, p2);
       rm2 ta = this.a;
       int i = 0;
       if (ta instanceof am5) {
          if ((uCursor = sz1.a().getContentResolver().query(p1, null, null, null, null)) == null) {
             l = 0;
          }else {
             uCursor.moveToFirst();
             l = uCursor.getLong(uCursor.getColumnIndex("_size"));
             uCursor.close();
          }
          ta.b(l);
          i1 = 0;
       }else {
          i1 = ej4.t(sz1.a().getContentResolver().openInputStream(p1), ta) + i;
       }
       Object[] objArray = new Object[i];
       this.f("", objArray);
       this.h();
       if ((ta = this.b) != null) {
          Object[] objArray1 = new Object[]{Integer.valueOf(i1)};
          String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(objArray1, 1));
          co5.l(str, "java.lang.String.format\(locale, format, *args\)");
          ta.a(str, co5.K(p0, "    "));
       }
       return;
    }
    public final void e(String p0,ParcelFileDescriptor p1,String p2){
       int i1;
       co5.o(p0, "key");
       co5.o(p1, "descriptor");
       if (p2 == null) {
          p2 = "content/unknown";
       }
       this.c(p0, p0, p2);
       rm2 ta = this.a;
       int i = 0;
       if (ta instanceof am5) {
          ta.b(p1.getStatSize());
          i1 = 0;
       }else {
          i1 = ej4.t(new ParcelFileDescriptor$AutoCloseInputStream(p1), ta) + i;
       }
       Object[] objArray = new Object[i];
       this.f("", objArray);
       this.h();
       if ((ta = this.b) != null) {
          Object[] objArray1 = new Object[]{Integer.valueOf(i1)};
          String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(objArray1, 1));
          co5.l(str, "java.lang.String.format\(locale, format, *args\)");
          ta.a(str, co5.K(p0, "    "));
       }
       return;
    }
    public final void f(String p0,Object[] p1){
       this.b(p0, Arrays.copyOf(p1, p1.length));
       if (this.d == null) {
          Object[] objArray = new Object[0];
          this.b("\r\n", objArray);
       }
       return;
    }
    public final void g(String p0,Object p1,tm2 p2){
       co5.o(p0, "key");
       if (az5.L(p1)) {
          this.a(p0, az5.r(p1));
       }else {
          rm2 ta = this.a;
          String str = "    ";
          rm2 tb = this.b;
          if (p1 instanceof Bitmap) {
             co5.o(p1, "bitmap");
             this.c(p0, p0, "image/png");
             p1.compress(Bitmap$CompressFormat.PNG, 100, ta);
             p1 = new Object[0];
             this.f("", p1);
             this.h();
             if (tb != null) {
                tb.a("<Image>", co5.K(p0, str));
             }
          }else if(p1 instanceof byte[]){
             co5.o(p1, "bytes");
             this.c(p0, p0, "content/unknown");
             ta.write(p1);
             Object[] objArray = new Object[0];
             this.f("", objArray);
             this.h();
             if (tb != null) {
                Object[] objArray1 = new Object[]{Integer.valueOf(p1.length)};
                p1 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(objArray1, 1));
                co5.l(p1, "java.lang.String.format\(locale, format, *args\)");
                tb.a(p1, co5.K(p0, str));
             }
          }else {
             String str1 = null;
             if (p1 instanceof Uri) {
                this.d(p0, p1, str1);
             }else if(p1 instanceof ParcelFileDescriptor){
                this.e(p0, p1, str1);
             }else if(p1 instanceof qm2){
                qm2 b = p1.b;
                p1 = p1.a;
                if (b instanceof ParcelFileDescriptor) {
                   this.e(p0, b, p1);
                }else if(b instanceof Uri){
                   this.d(p0, b, p1);
                }else {
                   throw new IllegalArgumentException("value is not a supported type.");
                }
             }else {
                throw new IllegalArgumentException("value is not a supported type.");
             }
          }
       }
       return;
    }
    public final void h(){
       if (this.d == null) {
          Object[] objArray = new Object[]{tm2.j};
          this.f("--%s", objArray);
       }else {
          byte[] bytes = "&".getBytes(oe0.a);
          co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          this.a.write(bytes);
       }
       return;
    }
}
