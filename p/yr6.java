package p.yr6;
import java.lang.Object;
import java.io.PrintWriter;
import java.lang.String;
import java.lang.Math;
import java.lang.StringBuilder;
import p.tp2;

public final class yr6	// class@002e14 from classes.dex
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;
    public final long n;

    public void yr6(int p0,int p1,long p2,long p3,long p4,long p5,long p6,long p7,long p8,long p9,int p10,int p11,int p12,long p13){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
       i.n = p13;
    }
    public final void a(PrintWriter p0){
       p0.println("===============BEGIN PICASSO STATS ===============");
       p0.println("Memory Cache Stats");
       p0.print("  Max Cache Size: ");
       yr6 ta = this.a;
       p0.println(ta);
       p0.print("  Cache Size: ");
       yr6 tb = this.b;
       p0.println(tb);
       p0.print("  Cache % Full: ");
       p0.println((int)Math.ceil((double)(((float)tb / (float)ta) * 100.00f)));
       p0.print("  Cache Hits: ");
       p0.println(this.c);
       p0.print("  Cache Misses: ");
       p0.println(this.d);
       p0.println("Network Stats");
       p0.print("  Download Count: ");
       p0.println(this.k);
       p0.print("  Total Download Size: ");
       p0.println(this.e);
       p0.print("  Average Download Size: ");
       p0.println(this.h);
       p0.println("Bitmap Stats");
       p0.print("  Total Bitmaps Decoded: ");
       p0.println(this.l);
       p0.print("  Total Bitmap Size: ");
       p0.println(this.f);
       p0.print("  Total Transformed Bitmaps: ");
       p0.println(this.m);
       p0.print("  Total Transformed Bitmap Size: ");
       p0.println(this.g);
       p0.print("  Average Bitmap Size: ");
       p0.println(this.i);
       p0.print("  Average Transformed Bitmap Size: ");
       p0.println(this.j);
       p0.println("===============END PICASSO STATS ===============");
       p0.flush();
    }
    public final String toString(){
       return tp2.o("StatsSnapshot{maxSize="+this.a+", size="+this.b+", cacheHits="+this.c+", cacheMisses="+this.d+", downloadCount="+this.k+", totalDownloadSize="+this.e+", averageDownloadSize="+this.h+", totalOriginalBitmapSize="+this.f+", totalTransformedBitmapSize="+this.g+", averageOriginalBitmapSize="+this.i+", averageTransformedBitmapSize="+this.j+", originalBitmapCount="+this.l+", transformedBitmapCount="+this.m+", timeStamp=", this.n, '}');
    }
}
