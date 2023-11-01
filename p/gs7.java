package p.gs7;
import java.lang.Object;
import java.util.Vector;
import java.lang.String;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import p.hs7;
import java.nio.ByteOrder;
import java.util.Date;
import java.lang.StringBuffer;

public final class gs7	// class@001770 from classes.dex
{
    public int a;
    public String b;
    public final Vector c;

    public void gs7(){
       super();
       this.c = new Vector();
    }
    public void gs7(String p0){
       super();
       this.b = p0;
    }
    public static void a(gs7 p0,ByteBuffer p1){
       hs7 a;
       p0.a = p1.getInt();
       p0.b = XtraBox.access$0(p1, p1.getInt());
       int intx = p1.getInt();
       for (int i = 0; i < intx; i = i + 1) {
          hs7 ohs7 = new hs7();
          int i1 = p1.getInt() - 6;
          ohs7.a = p1.getShort();
          p1.order(ByteOrder.LITTLE_ENDIAN);
          if ((a = ohs7.a) != 8) {
             if (a != 19) {
                if (a != 21) {
                   byte[] uobyteArray = new byte[i1];
                   ohs7.d = uobyteArray;
                   p1.get(uobyteArray);
                }else {
                   ohs7.e = new Date(XtraBox.access$3(p1.getLong()));
                }
             }else {
                ohs7.c = p1.getLong();
             }
          }else {
             ohs7.b = XtraBox.access$2(p1, i1);
          }
          p1.order(ByteOrder.BIG_ENDIAN);
          p0.c.addElement(ohs7);
       }
       if (p0.a == p0.b()) {
          return;
       }else {
          throw new RuntimeException("Improperly handled Xtra tag: Sizes don\'t match \( "+p0.a+"/"+p0.b()+"\) on "+p0.b);
       }
    }
    public final int b(){
       int i = this.b.length() + 12;
       int i1 = 0;
       while (true) {
          gs7 tc = this.c;
          if (i1 >= tc.size()) {
             break ;
          }else {
             i = i + tc.elementAt(i1).a();
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public final String toString(){
       gs7 tc = this.c;
       StringBuffer str = this.b+" ["+this.a+"/"+tc.size()+"]:\n";
       for (int i = 0; i < tc.size(); i = i + 1) {
          str = str.append("  ").append(tc.elementAt(i).toString()).append("\n");
       }
       return str;
    }
}
