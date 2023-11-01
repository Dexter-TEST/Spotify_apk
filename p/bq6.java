package p.bq6;
import java.lang.String;
import java.lang.Object;
import p.cq6;
import java.lang.StringBuilder;
import p.en6;
import java.nio.charset.Charset;

public final class bq6	// class@001118 from classes.dex
{
    public final byte[] a;
    public final byte[] b;
    public int c;
    public final String d;
    public static final String[] e;

    static {
       String[] stringArray = new String[]{"http://spotify.com/","https://spotify.com/","http://open.spotify.com/","https://open.spotify.com/"};
       bq6.e = stringArray;
    }
    public void bq6(String p0){
       super();
       this.d = p0;
       byte[] uobyteArray = new byte[p0.length()];
       this.a = uobyteArray;
       uobyteArray = new byte[p0.length()];
       this.b = uobyteArray;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < p0.length()) {
             char c = p0.charAt(i1);
             int i2 = 32;
             if (c < i2 || c > '~') {
                throw new cq6("Spotify uri contained non-ASCII characters at position "+i1+": "+p0);
             }
             if (c != i2) {
                this.a[i1] = (byte)c;
                i1 = i1 + 1;
             }else {
                break ;
             }
          }else {
             this.c = i;
             return;
          }
       }
       throw new cq6("Spotify uri contained space.");
    }
    public static int d(byte p0){
       byte b = 48;
       if (p0 >= b && p0 <= 57) {
          return (p0 - b);
       }
       b = 65;
       if (p0 < b || p0 > 70) {
          b = 97;
          if (p0 < b || p0 > 102) {
             return -1;
          }
       }
       return ((p0 - b) + 10);
    }
    public final boolean a(){
       boolean b = (this.c == this.a.length)? true: false;
       return b;
    }
    public final String b(boolean p0){
       bq6 tb;
       int b;
       bq6 ta = this.a;
       bq6 td = this.d;
       if (this.c >= ta.length) {
          throw new cq6(en6.n("End of Spotify uri reached unexpectedly: ", td));
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          bq6 tc = this.c;
          tb = this.b;
          if (tc < ta.length) {
             int i2 = tc + 1;
             this.c = i2;
             if ((b = ta[tc]) < 65) {
                if (b == 43) {
                   b = 32;
                }else if(b == 37){
                   if ((b = i2 + 2) <= ta.length) {
                      b = i2 + 1;
                      this.c = b;
                      b = bq6.d(ta[i2]);
                      bq6 tc1 = this.c;
                      int i3 = tc1 + 1;
                      this.c = i3;
                      i2 = bq6.d(ta[tc1]);
                      if (b >= 0 && i2 >= 0) {
                         b = b * 16;
                         b = b + i2;
                         b = (byte)b;
                      }else {
                         this.c = ta.length;
                         throw new cq6(en6.n("Bad hex character in Spotify uri: ", td));
                      }
                   }else {
                      this.c = ta.length;
                      throw new cq6(en6.n("Badly encoded character in Spotify uri: ", td));
                   }
                }else if(p0 && (b == 58 && b != 47)){
                   break ;
                }
             }
             i2 = i1 + 1;
             tb[i1] = b;
             i1 = i2;
          }else {
             break ;
          }
       }
       return new String(tb, i, i1, Charset.forName("UTF-8"));
    }
    public final String c(){
       bq6 tc;
       if ((tc = this.c) > this.a.length) {
          throw new cq6("End of Spotify uri reached unexpectedly: "+this.d);
       }
       this.c = tc;
       return this.b(false);
    }
}
