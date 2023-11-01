package p.lm2;
import p.mm2;
import com.spotify.rcs.model.GranularConfiguration;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue;
import java.lang.Boolean;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue;
import java.lang.Integer;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue;
import p.pl;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import p.bc3;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue;
import com.spotify.rcs.resolver.grpc.v0.f;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$BoolValue;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$IntValue;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$EnumValue;
import com.spotify.rcs.admin.grpc.v0.PropertyDefinition$Identifier;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$Metadata;

public abstract class lm2	// class@001d7e from classes.dex
{

    public static mm2 a(byte[] p0){
       GranularConfiguration granularConf = GranularConfiguration.B(p0);
       List list = granularConf.y();
       co5.l(list, "storageProto.propertiesList");
       ArrayList uArrayList = new ArrayList(aj0.b0(list));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          GranularConfiguration$AssignedPropertyValue uAssignedPro = iterator.next();
          co5.l(uAssignedPro, "it");
          int i = 0;
          Boolean uBoolean = (uAssignedPro.getStructuredValueCase() == GranularConfiguration$AssignedPropertyValue$StructuredValueCase.BOOL_VALUE)? Boolean.valueOf(uAssignedPro.getBoolValue().getValue()): i;
          Integer integer = (uAssignedPro.getStructuredValueCase() == GranularConfiguration$AssignedPropertyValue$StructuredValueCase.INT_VALUE)? Integer.valueOf(uAssignedPro.getIntValue().getValue()): i;
          if (uAssignedPro.getStructuredValueCase() == GranularConfiguration$AssignedPropertyValue$StructuredValueCase.ENUM_VALUE) {
             i = uAssignedPro.getEnumValue().getValue();
          }
          String name = uAssignedPro.getName();
          co5.l(name, "proto.name");
          String componentId = uAssignedPro.getComponentId();
          co5.l(componentId, "proto.componentId");
          pl v3 = new pl(name, componentId, uBoolean, integer, i, uAssignedPro.getGroupId(), uAssignedPro.getPolicyId());
          uArrayList.add(v3);
       }
       String str = granularConf.t();
       co5.l(str, "storageProto.configurationAssignmentId");
       mm2 iterator1 = new mm2(str, granularConf.z(), uArrayList, granularConf.v());
       return iterator;
    }
    public static mm2 b(Configuration p0){
       co5.o(p0, "protoConfiguration");
       bc3 uobc3 = p0.f();
       co5.l(uobc3, "protoConfiguration.assignedValuesList");
       ArrayList uArrayList = new ArrayList(aj0.b0(uobc3));
       Iterator iterator = uobc3.iterator();
       while (iterator.hasNext()) {
          Configuration$AssignedValue uAssignedVal = iterator.next();
          co5.l(uAssignedVal, "it");
          int i = 0;
          Boolean uBoolean = (uAssignedVal.k() == f.a)? Boolean.valueOf(uAssignedVal.f().getValue()): i;
          Integer integer = (uAssignedVal.k() == f.b)? Integer.valueOf(uAssignedVal.h().getValue()): i;
          if (uAssignedVal.k() == f.c) {
             i = uAssignedVal.g().getValue();
          }
          String name = uAssignedVal.j().getName();
          co5.l(name, "proto.propertyId.name");
          String str = uAssignedVal.j().g();
          co5.l(str, "proto.propertyId.scope");
          pl v3 = new pl(name, str, uBoolean, integer, i, uAssignedVal.i().g(), uAssignedVal.i().getPolicyId());
          uArrayList.add(v3);
       }
       String str1 = p0.g();
       co5.l(str1, "protoConfiguration.configurationAssignmentId");
       mm2 iterator1 = new mm2(str1, p0.i(), uArrayList, p0.j());
       return iterator;
    }
}
