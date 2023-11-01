package p.hs7;
import java.lang.Object;
import java.lang.String;
import java.util.Date;
import java.lang.StringBuilder;

public final class hs7	// class@0018b5 from classes.dex
{
    public int a;
    public String b;
    public long c;
    public byte[] d;
    public Date e;

    public void hs7(){
       super();
    }
    public void hs7(long p0){
       super();
       this.a = 19;
       this.c = p0;
    }
    public void hs7(String p0){
       super();
       this.a = 8;
       this.b = p0;
    }
    public void hs7(Date p0){
       super();
       this.a = 21;
       this.e = p0;
    }
    public final int a(){
       hs7 ta;
       int len;
       if ((ta = this.a) != 8) {
          if (ta != 19 && ta != 21) {
             len = this.d.length;
          }else {
             len = 14;
          label_0021 :
             return len;
          }
       }else {
          len = (this.b.length() * 2) + 2;
       }
       len = len + 6;
       goto label_0021 ;
    }
    public final String toString(){
       hs7 ta;
       if ((ta = this.a) == 8) {
          return "[string]"+this.b;
       }
       if (ta == 19) {
          return "[long]"+String.valueOf(this.c);
       }
       if (ta != 21) {
          return "[GUID]\(nonParsed\)";
       }
       return "[filetime]"+this.e.toString();
    }
}
