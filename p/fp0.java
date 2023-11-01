package p.fp0;
import p.o2;
import p.tv7;
import android.app.PendingIntent;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import p.ye7;
import java.lang.Integer;
import java.util.Arrays;
import p.fh5;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class fp0 extends o2	// class@00160d from classes.dex
{
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String t;
    public static final Parcelable$Creator CREATOR;
    public static final fp0 v;

    static {
       fp0.v = new fp0(0);
       fp0.CREATOR = new tv7(0);
    }
    public void fp0(int p0){
       super(1, p0, null, null);
    }
    public void fp0(int p0,int p1,PendingIntent p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public void fp0(int p0,PendingIntent p1){
       super(1, p0, p1, null);
    }
    public static String b(int p0){
       if (p0 == 99) {
          return "UNFINISHED";
       }
       if (p0 == 1500) {
          return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
       }
       switch (p0){
           case 0xffffffff:
             return "UNKNOWN";
           case 0:
             return "SUCCESS";
           case 1:
             return "SERVICE_MISSING";
           case 2:
             return "SERVICE_VERSION_UPDATE_REQUIRED";
           case 3:
             return "SERVICE_DISABLED";
           case 4:
             return "SIGN_IN_REQUIRED";
           case 5:
             return "INVALID_ACCOUNT";
           case 6:
             return "RESOLUTION_REQUIRED";
           case 7:
             return "NETWORK_ERROR";
           case 8:
             return "INTERNAL_ERROR";
           case 9:
             return "SERVICE_INVALID";
           case 10:
             return "DEVELOPER_ERROR";
           case 11:
             return "LICENSE_CHECK_FAILED";
           default:
             switch (p0){
                 case 13:
                   return "CANCELED";
                 case 14:
                   return "TIMEOUT";
                 case 15:
                   return "INTERRUPTED";
                 case 16:
                   return "API_UNAVAILABLE";
                 case 17:
                   return "SIGN_IN_FAILED";
                 case 18:
                   return "SERVICE_UPDATING";
                 case 19:
                   return "SERVICE_MISSING_PERMISSION";
                 case 20:
                   return "RESTRICTED_PROFILE";
                 case 21:
                   return "API_VERSION_UPDATE_REQUIRED";
                 case 22:
                   return "RESOLUTION_ACTIVITY_NOT_FOUND";
                 case 23:
                   return "API_DISABLED";
                 default:
                   return new StringBuilder(31)+"UNKNOWN_ERROR_CODE\("+p0+"\)";
             }
       }
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof fp0) {
          return false;
       }
       if (this.b == p0.b && (ye7.x(this.c, p0.c) && ye7.x(this.t, p0.t))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.b),this.c,this.t};
       return Arrays.hashCode(objArray);
    }
    public final String toString(){
       fh5 uofh5 = ye7.X(this);
       uofh5.b(fp0.b(this.b), "statusCode");
       uofh5.b(this.c, "resolution");
       uofh5.b(this.t, "message");
       return uofh5.toString();
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.I(p0, 2, 4);
       p0.writeInt(this.b);
       is7.B(p0, 3, this.c, p1);
       is7.C(p0, 4, this.t);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
