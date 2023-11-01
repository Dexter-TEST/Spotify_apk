package p.vp2;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class vp2	// class@002a3b from classes.dex
{
    public boolean A;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public ArrayList w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void vp2(){
       super();
       this.h = 15;
       this.j = 63;
       this.l = 63;
       this.n = 31;
       this.p = 31;
       this.w = new ArrayList();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || vp2.class != p0.getClass()) {
          return false;
       }
       if (this.r != p0.r) {
          return false;
       }
       if (this.q != p0.q) {
          return false;
       }
       if (this.o != p0.o) {
          return false;
       }
       if (this.m != p0.m) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.s != p0.s) {
          return false;
       }
       if (this.f - p0.f) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (this.e - p0.e) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.v != p0.v) {
          return false;
       }
       if (this.i != p0.i) {
          return false;
       }
       if (this.t != p0.t) {
          return false;
       }
       if (this.k != p0.k) {
          return false;
       }
       if (this.h != p0.h) {
          return false;
       }
       if (this.j != p0.j) {
          return false;
       }
       if (this.l != p0.l) {
          return false;
       }
       if (this.n != p0.n) {
          return false;
       }
       if (this.p != p0.p) {
          return false;
       }
       if (this.u != p0.u) {
          return false;
       }
       vp2 tw = this.w;
       p0 = p0.w;
       if (tw != null) {
          if (!tw.equals(p0)) {
          label_00c0 :
             return false;
          }
       }else if(p0 != null){
          goto label_00c0 ;
       }
       return true;
    }
    public final int hashCode(){
       vp2 te = this.e;
       te = this.f;
       int i = ((((((((((((((((((((((((((((((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (int)(te ^ (te >> 32))) * 31) + (int)(te ^ (te >> 32))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31;
       int i1 = ((te = this.w) != null)? te.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       StringBuilder str = "HEVCDecoderConfigurationRecord{configurationVersion="+this.a+", general_profile_space="+this.b+", general_tier_flag="+this.c+", general_profile_idc="+this.d+", general_profile_compatibility_flags="+this.e+", general_constraint_indicator_flags="+this.f+", general_level_idc="+this.g;
       String str1 = "";
       String str2 = (this.h != 15)? ", reserved1="+this.h: str1;
       str = str+str2+", min_spatial_segmentation_idc="+this.i;
       int i = 63;
       str2 = (this.j != i)? ", reserved2="+this.j: str1;
       str = str+str2+", parallelismType="+this.k;
       str2 = (this.l != i)? ", reserved3="+this.l: str1;
       str = str+str2+", chromaFormat="+this.m;
       i = 31;
       str2 = (this.n != i)? ", reserved4="+this.n: str1;
       str = str+str2+", bitDepthLumaMinus8="+this.o;
       if (this.p != i) {
          str1 = ", reserved5="+this.p;
       }
       return str+str1+", bitDepthChromaMinus8="+this.q+", avgFrameRate="+this.r+", constantFrameRate="+this.s+", numTemporalLayers="+this.t+", temporalIdNested="+this.u+", lengthSizeMinusOne="+this.v+", arrays="+this.w+'}';
    }
}
