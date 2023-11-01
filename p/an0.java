package p.an0;
import java.util.List;
import java.lang.Object;
import p.u45;
import p.t65;
import p.l14;
import java.lang.Class;
import java.lang.String;
import p.co5;
import p.w70;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.res.Resources;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Number;
import p.ps2;
import android.net.Uri$Builder;
import java.io.File;
import java.nio.ByteBuffer;

public final class an0	// class@000fb4 from classes.dex
{
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public void an0(List p0,List p1,List p2,List p3,List p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final Object a(Object p0,u45 p1){
       Uri uri;
       String authority;
       int identifier;
       an0 tb = this.b;
       int i = tb.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return p0;
          }
          t65 ot65 = tb.get(i1);
          t65 a = ot65.a;
          if (ot65.b.isAssignableFrom(p0.getClass())) {
             co5.j(a, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
             int i2 = 1;
             u45 a1 = p1.a;
             String str = null;
             switch (a.a){
                 case 0:
                   str = ByteBuffer.wrap(p0);
                   break;
                 case 1:
                   uri = p0;
                   if (a.a(uri)) {
                      if (uri.getScheme() != null) {
                         uri = uri.buildUpon().scheme(str).build();
                      }
                      str = new File(uri.toString());
                   }
                   break;
                 case 2:
                   str = p0.i;
                   break;
                 case 3:
                   int i3 = p0.intValue();
                   try{
                      if (a1.getResources().getResourceEntryName(i3) != null) {
                      label_00b6 :
                         if (uri) {
                            str = Uri.parse("android.resource://".append(a1.getPackageName()).append('/').append(i3).toString());
                            co5.l(str, "parse\(this\)");
                         }
                      }
                   }catch(android.content.res.Resources$NotFoundException e0){
                   }
                   uri = 0;
                   goto label_00b6 ;
                   break;
                 case 4:
                   Uri uri1 = p0;
                   if (a.a(uri1)) {
                      if ((authority = uri1.getAuthority()) == null) {
                         authority = "";
                      }
                      List pathSegments = uri1.getPathSegments();
                      String str1 = pathSegments.get(0);
                      if (!(identifier = a1.getPackageManager().getResourcesForApplication(authority).getIdentifier(pathSegments.get(i2), str1, authority))) {
                         i2 = 0;
                      }
                      if (i2) {
                         str = Uri.parse("android.resource://".append(authority).append('/').append(identifier).toString());
                         co5.l(str, "parse\(this\)");
                      }else {
                         throw new IllegalStateException("Invalid android.resource URI: "+uri1.toString());
                      }
                   }
                   break;
                 default:
                   str = Uri.parse(p0);
                   co5.l(str, "parse\(this\)");
             }
             if (str != null) {
                p0 = str;
             }
          }
          i1 = i1 + 1;
       }
    }
}
