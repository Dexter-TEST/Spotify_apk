package p.i52;
import java.lang.String;
import java.lang.Object;
import p.wu6;
import p.w51;
import android.content.Context;
import p.kf6;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.ye7;
import java.util.Arrays;
import p.fh5;

public final class i52	// class@001928 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public void i52(String p0,String p1,String p2,String p3,String p4,String p5,String p6){
       super();
       int i = 1;
       int i1 = (p0 != null && !p0.trim().isEmpty())? 0: 1;
       w51.m("ApplicationId must be set.", (i ^ i1));
       this.b = p0;
       this.a = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       return;
    }
    public static i52 a(Context p0){
       i52 TextUtils.isEmpty(str);
       kf6 okf6 = new kf6(p0);
       String str = okf6.g("google_app_id");
       if (TextUtils.isEmpty(str)) {
          return null;
       }
       TextUtils.isEmpty(str) = new i52(str, okf6.g("google_api_key"), okf6.g("firebase_database_url"), okf6.g("ga_trackingId"), okf6.g("gcm_defaultSenderId"), okf6.g("google_storage_bucket"), okf6.g("project_id"));
       return TextUtils.isEmpty(str);
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof i52) {
          return b;
       }
       if (ye7.x(this.b, p0.b) && (ye7.x(this.a, p0.a) && (ye7.x(this.c, p0.c) && (ye7.x(this.d, p0.d) && (ye7.x(this.e, p0.e) && (ye7.x(this.f, p0.f) && ye7.x(this.g, p0.g))))))) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.b,this.a,this.c,this.d,this.e,this.f,this.g};
       return Arrays.hashCode(objArray);
    }
    public final String toString(){
       fh5 uofh5 = ye7.X(this);
       uofh5.b(this.b, "applicationId");
       uofh5.b(this.a, "apiKey");
       uofh5.b(this.c, "databaseUrl");
       uofh5.b(this.e, "gcmSenderId");
       uofh5.b(this.f, "storageBucket");
       uofh5.b(this.g, "projectId");
       return uofh5.toString();
    }
}
