package p.a;
import p.t10;
import java.util.Calendar;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public abstract class a extends t10	// class@000f40 from classes.dex
{
    public final Calendar a;
    public final boolean b;
    public final int c;

    public void a(Calendar p0,boolean p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       a ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof t10) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_0022 :
             if (this.b == p0.b && this.c == p0.c) {
             label_0035 :
                return b;
             }
          }
       }else if(ta.equals(p0.a)){
          goto label_0022 ;
       }
       b = false;
       goto label_0035 ;
    }
    public final int hashCode(){
       a ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       int i1 = 0xf4243;
       i = (i ^ i1) * i1;
       int i2 = (this.b != null)? 1231: 1237;
       return (((i ^ i2) * i1) ^ this.c);
    }
    public final String toString(){
       return en6.o("BirthdayModel{dateOfBirth="+this.a+", dateOfBirthValid="+this.b+", minimumAge=", this.c, "}");
    }
}
