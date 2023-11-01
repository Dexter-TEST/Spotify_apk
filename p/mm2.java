package p.mm2;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import com.spotify.rcs.model.GranularConfiguration$Builder;
import com.spotify.rcs.model.GranularConfiguration;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.pl;
import java.lang.Class;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue;
import java.lang.Boolean;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue;
import java.lang.Integer;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.co5;
import com.google.protobuf.a;
import p.kg4;
import java.lang.StringBuilder;
import p.tp2;

public final class mm2	// class@001ec1 from classes.dex
{
    public final String a;
    public final long b;
    public final List c;
    public final long d;

    public void mm2(String p0,long p1,List p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final byte[] a(){
       pl c;
       GranularConfiguration$Builder uBuilder = GranularConfiguration.A().setConfigurationAssignmentId(this.a).setPolicySnapshotId(this.d).setRcsFetchTime(this.b);
       mm2 tc = this.c;
       ArrayList uArrayList = new ArrayList(aj0.b0(tc));
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          pl opl = iterator.next();
          opl.getClass();
          GranularConfiguration$AssignedPropertyValue$Builder uAssignedPro = GranularConfiguration$AssignedPropertyValue.newBuilder().setName(opl.a).setComponentId(opl.b).setGroupId(opl.f).setPolicyId(opl.g);
          if ((c = opl.c) != null) {
             uAssignedPro.setBoolValue(GranularConfiguration$AssignedPropertyValue$BoolValue.newBuilder().setValue(c.booleanValue()));
          }else if((c = opl.d) != null){
             uAssignedPro.setIntValue(GranularConfiguration$AssignedPropertyValue$IntValue.newBuilder().setValue(c.intValue()));
          }else if((opl = opl.e) != null){
             uAssignedPro.setEnumValue(GranularConfiguration$AssignedPropertyValue$EnumValue.newBuilder().setValue(opl));
          }
          c uoc = uAssignedPro.build();
          co5.l(uoc, "propBuilder.build\(\)");
          uArrayList.add(uoc);
       }
       byte[] uobyteArray = uBuilder.addAllProperties(uArrayList).build().toByteArray();
       co5.l(uobyteArray, "newBuilder\(\)\n        .se…(\)\n        .toByteArray\(\)");
       return uobyteArray;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof mm2) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (this.d - p0.d) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       mm2 tb = this.b;
       tb = this.d;
       return (kg4.j(this.c, (((this.a.hashCode() * 31) + (int)(tb ^ (tb >> 32))) * 31), 31) + (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return tp2.o("GranularConfiguration\(configurationAssignmentId="+this.a+", rcsFetchTime="+this.b+", propertiesList="+this.c+", snapshotId=", this.d, ')');
    }
}
