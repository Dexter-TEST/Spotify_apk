package p.pw;
import java.lang.Object;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import p.vy;
import java.nio.Buffer;
import p.do5;
import java.util.List;
import p.w10;
import java.util.Iterator;
import p.vv7;
import java.lang.String;
import java.io.ByteArrayInputStream;
import p.le5;
import java.lang.RuntimeException;
import java.lang.Throwable;
import p.xe7;
import p.cg0;
import p.ka6;
import java.lang.StringBuilder;
import p.tp2;

public final class pw	// class@0022e8 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public List f;
    public List g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public List l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;

    public void pw(){
       super();
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = true;
       this.i = 1;
       this.j = 0;
       this.k = 0;
       this.l = new ArrayList();
       this.m = 63;
       this.n = 7;
       this.o = 31;
       this.p = 31;
       this.q = 31;
    }
    public void pw(ByteBuffer p0){
       int b;
       pw tb;
       super();
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = true;
       this.i = 1;
       int i = 0;
       this.j = i;
       this.k = i;
       this.l = new ArrayList();
       this.m = 63;
       this.n = 7;
       this.o = 31;
       this.p = 31;
       this.q = 31;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       this.a = b;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       this.b = b;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       this.c = b;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       this.d = b;
       vy b1 = new vy(p0);
       int i1 = 6;
       this.m = b1.b(i1);
       int i2 = 2;
       this.e = b1.b(i2);
       int i3 = 3;
       this.n = b1.b(i3);
       int i4 = 5;
       b = b1.b(i4);
       for (int i5 = 0; i5 < b; i5 = i5 + 1) {
          byte[] uobyteArray2 = new byte[do5.i0(p0)];
          p0.get(uobyteArray2);
          this.f.add(uobyteArray2);
       }
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       long l = (long)b;
       b = 0;
       while (((long)b - l) < 0) {
          byte[] uobyteArray1 = new byte[do5.i0(p0)];
          p0.get(uobyteArray1);
          this.g.add(uobyteArray1);
          b = b + 1;
       }
       if (p0.remaining() < 4) {
          this.h = i;
       }
       if (this.h != null && ((tb = this.b) == 100 && (tb != 110 && (tb != 122 && tb != 144)))) {
          b1 = new vy(p0);
          this.o = b1.b(i1);
          this.i = b1.b(i2);
          this.p = b1.b(i4);
          this.j = b1.b(i3);
          this.q = b1.b(i4);
          this.k = b1.b(i3);
          if ((b = p0.get()) < 0) {
             b = b + 256;
          }
          long l1 = (long)b;
          while (((long)i - l1) < 0) {
             byte[] uobyteArray = new byte[do5.i0(p0)];
             p0.get(uobyteArray);
             this.l.add(uobyteArray);
             i = i + 1;
          }
       }else {
          this.i = -1;
          this.j = -1;
          this.k = -1;
       }
       return;
    }
    public final void a(ByteBuffer p0){
       pw tb;
       byte[] uobyteArray;
       p0.put((byte)(this.a & 0x00ff));
       p0.put((byte)(this.b & 0x00ff));
       p0.put((byte)(this.c & 0x00ff));
       p0.put((byte)(this.d & 0x00ff));
       w10 ow10 = new w10(p0);
       int i = 6;
       ow10.a(this.m, i);
       ow10.a(this.e, 2);
       ow10.a(this.n, 3);
       ow10.a(this.g.size(), 5);
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          uobyteArray = iterator.next();
          vv7.e0(p0, uobyteArray.length);
          p0.put(uobyteArray);
       }
       p0.put((byte)(this.g.size() & 0x00ff));
       Iterator iterator1 = this.g.iterator();
       while (iterator1.hasNext()) {
          byte[] uobyteArray1 = iterator1.next();
          vv7.e0(p0, uobyteArray1.length);
          p0.put(uobyteArray1);
       }
       if (this.h != null && ((tb = this.b) == 100 && (tb != 110 && (tb != 122 && tb != 144)))) {
          ow10 = new w10(p0);
          ow10.a(this.o, i);
          ow10.a(this.i, 2);
          ow10.a(this.p, 5);
          ow10.a(this.j, 3);
          ow10.a(this.q, 5);
          ow10.a(this.k, 3);
          iterator = this.l.iterator();
          while (iterator.hasNext()) {
             uobyteArray = iterator.next();
             vv7.e0(p0, uobyteArray.length);
             p0.put(uobyteArray);
          }
       }
       return;
    }
    public final long b(){
       pw tb;
       Iterator iterator = this.f.iterator();
       long l = 6;
       while (iterator.hasNext()) {
          l = l + 2;
          l = l + (long)iterator.next().length;
       }
       l = l + 1;
       Iterator iterator1 = this.g.iterator();
       while (iterator1.hasNext()) {
          l = l + 2;
          l = l + (long)iterator1.next().length;
       }
       if (this.h != null && ((tb = this.b) == 100 && (tb != 110 && (tb != 122 && tb != 144)))) {
          l = l + 4;
          iterator = this.l.iterator();
          while (iterator.hasNext()) {
             l = l + 2;
             l = l + (long)iterator.next().length;
          }
       }
       return l;
    }
    public final String[] c(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          byte[] uobyteArray = iterator.next();
          try{
             int i = uobyteArray.length - 1;
             uArrayList.add(le5.v(new ByteArrayInputStream(uobyteArray, 1, i)).toString());
          }catch(java.io.IOException e0){
             throw new RuntimeException(e0);
          }
       }
       String[] stringArray = new String[uArrayList.size()];
       return uArrayList.toArray(stringArray);
    }
    public final ArrayList d(){
       ArrayList uArrayList = new ArrayList(this.g.size());
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(xe7.t(iterator.next(), 0));
       }
       return uArrayList;
    }
    public final String[] e(){
       String str;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          byte[] uobyteArray = iterator.next();
          try{
             int i = uobyteArray.length - 1;
             str = ka6.v(new cg0(new ByteArrayInputStream(uobyteArray, 1, i))).toString();
          }catch(java.io.IOException e0){
             str = "not parsable";
          }
          e0.add(str);
       }
       String[] stringArray = new String[uArrayList.size()];
       return uArrayList.toArray(stringArray);
    }
    public final ArrayList f(){
       ArrayList uArrayList = new ArrayList(this.f.size());
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(xe7.t(iterator.next(), 0));
       }
       return uArrayList;
    }
    public final String toString(){
       return tp2.n("AvcDecoderConfigurationRecord{configurationVersion="+this.a+", avcProfileIndication="+this.b+", profileCompatibility="+this.c+", avcLevelIndication="+this.d+", lengthSizeMinusOne="+this.e+", hasExts="+this.h+", chromaFormat="+this.i+", bitDepthLumaMinus8="+this.j+", bitDepthChromaMinus8="+this.k+", lengthSizeMinusOnePaddingBits="+this.m+", numberOfSequenceParameterSetsPaddingBits="+this.n+", chromaFormatPaddingBits="+this.o+", bitDepthLumaMinus8PaddingBits="+this.p+", bitDepthChromaMinus8PaddingBits=", this.q, '}');
    }
}
