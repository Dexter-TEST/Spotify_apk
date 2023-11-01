package p.ur0;
import p.tr0;
import p.vr0;
import java.lang.Object;
import android.content.ClipData;
import java.lang.Class;
import android.net.Uri;
import android.os.Bundle;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import java.util.Locale;
import p.wr0;
import android.view.ContentInfo;
import android.content.ClipDescription;
import p.en6;

public final class ur0 implements tr0, vr0	// class@002904 from classes.dex
{
    public final int a;
    public Object b;
    public int c;
    public int t;
    public Comparable v;
    public Object w;

    public void ur0(){
       this.a = 2;
       super();
    }
    public void ur0(ClipData p0,int p1){
       this.a = 0;
       super();
       this.b = p0;
       this.c = p1;
    }
    public void ur0(ur0 p0){
       Object[] objArray;
       int i = 1;
       this.a = i;
       super();
       ur0 b = p0.b;
       b.getClass();
       this.b = b;
       b = p0.c;
       int i1 = 0;
       int i2 = 5;
       int i3 = 3;
       if (b >= null) {
          if (b <= i2) {
             this.c = b;
             b = p0.t;
             if (((b & 0x01)) != b) {
                throw new IllegalArgumentException("Requested flags 0x"+Integer.toHexString(b)+", but only 0x"+Integer.toHexString(i)+" are allowed");
             }
             this.t = b;
             this.v = p0.v;
             this.w = p0.w;
             return;
          }else {
             objArray = new Object[i3];
             objArray[i1] = "source";
             objArray[i] = Integer.valueOf(i1);
             objArray[2] = Integer.valueOf(i2);
             throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] \(too high\)", objArray));
          }
       }else {
          objArray = new Object[i3];
          objArray[i1] = "source";
          objArray[i] = Integer.valueOf(i1);
          objArray[2] = Integer.valueOf(i2);
          throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] \(too low\)", objArray));
       }
    }
    public final void a(Uri p0){
       this.v = p0;
    }
    public final wr0 build(){
       return new wr0(new ur0(this));
    }
    public final ClipData c(){
       return this.b;
    }
    public final int getFlags(){
       return this.t;
    }
    public final ContentInfo k(){
       return null;
    }
    public final int m(){
       return this.c;
    }
    public final void setExtras(Bundle p0){
       this.w = p0;
    }
    public final void setFlags(int p0){
       this.t = p0;
    }
    public final String toString(){
       StringBuilder str;
       ur0 tc;
       String str1;
       String str2;
       switch (this.a){
           case 1:
             str = "ContentInfoCompat{clip="+this.b.getDescription()+", source=";
             if ((tc = this.c) != null) {
                if (tc != 1) {
                   if (tc != 2) {
                      if (tc != 3) {
                         if (tc != 4) {
                            str1 = (tc != 5)? String.valueOf(tc): "SOURCE_PROCESS_TEXT";
                         }else {
                            str1 = "SOURCE_AUTOFILL";
                         }
                      }else {
                         str1 = "SOURCE_DRAG_AND_DROP";
                      }
                   }else {
                      str1 = "SOURCE_INPUT_METHOD";
                   }
                }else {
                   str1 = "SOURCE_CLIPBOARD";
                }
             }else {
                str1 = "SOURCE_APP";
             }
             str = str+str1+", flags=";
             tc = this.t;
             str1 = ((tc & 0x01))? "FLAG_CONVERT_TO_PLAIN_TEXT": String.valueOf(tc);
             str = str+str1;
             str2 = "";
             str1 = (this.v == null)? str2: ", hasLinkUri\("+this.v.toString().length()+"\)";
             str = str+str1;
             if (this.w != null) {
                str2 = ", hasExtras";
             }
             break;
           default:
             return super.toString();
       }
       return en6.p(str, str2, "}");
    }
}
