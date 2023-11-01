package okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p.ir2;
import java.lang.Object;
import java.util.List;
import p.ye7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CountDownLatch;
import java.lang.String;
import java.lang.CharSequence;
import p.av6;
import p.dj0;
import p.co5;
import java.lang.Iterable;
import java.net.IDN;
import p.re5;
import java.lang.Class;
import java.lang.Throwable;
import java.lang.Thread;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import p.ll1;
import p.di7;
import p.ye1;
import p.la6;
import p.ve1;
import java.lang.StringBuilder;
import java.lang.Appendable;
import java.util.Iterator;
import p.zf2;
import p.tp2;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.io.InputStream;
import p.on2;
import p.on;
import p.xe7;
import p.nn6;
import p.hp5;
import p.e70;
import java.io.Closeable;
import p.eb3;

public final class PublicSuffixDatabase	// class@00014c from classes2.dex
{
    public final AtomicBoolean a;
    public final CountDownLatch b;
    public byte[] c;
    public byte[] d;
    public static final byte[] e;
    public static final List f;
    public static final PublicSuffixDatabase g;

    static {
       ir2 oir2 = new ir2(20, 0);
       byte[] uobyteArray = new byte[]{42};
       PublicSuffixDatabase.e = uobyteArray;
       PublicSuffixDatabase.f = ye7.J("*");
       PublicSuffixDatabase.g = new PublicSuffixDatabase();
    }
    public void PublicSuffixDatabase(){
       super();
       this.a = new AtomicBoolean(false);
       this.b = new CountDownLatch(1);
    }
    public static List c(String p0){
       int i1;
       char[] uocharArray = new char[]{'.'};
       int i = 0;
       List list = av6.A0(p0, uocharArray);
       if (co5.c(dj0.r0(list), "")) {
          if ((i1 = list.size() - 1) >= 0) {
             i = i1;
          }
          list = dj0.y0(list, i);
       }
       return list;
    }
    public final String a(String p0){
       byte[][] uobyteArray;
       int i1;
       Charset uTF_8;
       byte[] bytes;
       String str1;
       int i2;
       PublicSuffixDatabase tc;
       String str2;
       byte[][] uobyteArray1;
       int i3;
       int i4;
       int i5;
       PublicSuffixDatabase tc1;
       String str3;
       int i6;
       char c;
       char[] uocharArray;
       List list1;
       int i7;
       di7 uodi7;
       Appendable uAppendable;
       Iterator iterator;
       String obj;
       ll1 a;
       ll1 oll1;
       char[] uocharArray1;
       char[] uocharArray2;
       String str = IDN.toUnicode(p0);
       co5.l(str, "unicodeDomain");
       List list = PublicSuffixDatabase.c(str);
       int b = false;
       if (!this.a.get() && this.a.compareAndSet(b, true)) {
          int i = 0;
          try{
          label_0020 :
             this.b();
             if (!i) {
             }
          }catch(java.io.InterruptedIOException e0){
             Thread.interrupted();
             i = 1;
             goto label_0020 ;
          }catch(java.io.IOException e4){
             re5.a.getClass();
             re5.i(5, "Failed to read public suffix list", e4);
             if (!i) {
             }
          }
          Thread.currentThread().interrupt();
       }else {
          try{
             this.b.await();
          }catch(java.lang.InterruptedException e0){
             Thread.currentThread().interrupt();
          }
       }
    }
    public final void b(){
       InputStream resourceAsSt;
       if ((resourceAsSt = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz")) == null) {
          return;
       }
       hp5 ohp5 = xe7.f(new on2(xe7.d0(resourceAsSt)));
       long l = (long)ohp5.readInt();
       ohp5.V(l);
       long l1 = (long)ohp5.readInt();
       ohp5.V(l1);
       eb3.d(ohp5, null);
       _monitor_enter(this);
       this.c = ohp5.b.l0(l);
       this.d = ohp5.b.l0(l1);
       _monitor_exit(this);
       this.b.countDown();
       return;
    }
}
