package com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class GranularConfiguration$AssignedPropertyValue$StructuredValueCase extends Enum	// class@000bc2 from classes.dex
{
    private final int value;
    private static final GranularConfiguration$AssignedPropertyValue$StructuredValueCase[] $VALUES;
    public static final GranularConfiguration$AssignedPropertyValue$StructuredValueCase BOOL_VALUE;
    public static final GranularConfiguration$AssignedPropertyValue$StructuredValueCase ENUM_VALUE;
    public static final GranularConfiguration$AssignedPropertyValue$StructuredValueCase INT_VALUE;
    public static final GranularConfiguration$AssignedPropertyValue$StructuredValueCase STRUCTUREDVALUE_NOT_SET;

    static {
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase uAssignedPro = new GranularConfiguration$AssignedPropertyValue$StructuredValueCase("BOOL_VALUE", 0, 1);
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase.BOOL_VALUE = uAssignedPro;
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase uAssignedPro1 = new GranularConfiguration$AssignedPropertyValue$StructuredValueCase("INT_VALUE", 1, 2);
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase.INT_VALUE = uAssignedPro1;
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase uAssignedPro2 = new GranularConfiguration$AssignedPropertyValue$StructuredValueCase("ENUM_VALUE", 2, 3);
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase.ENUM_VALUE = uAssignedPro2;
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase uAssignedPro3 = new GranularConfiguration$AssignedPropertyValue$StructuredValueCase("STRUCTUREDVALUE_NOT_SET", 3, 0);
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase.STRUCTUREDVALUE_NOT_SET = uAssignedPro3;
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase[] uAssignedPro4 = new GranularConfiguration$AssignedPropertyValue$StructuredValueCase[]{uAssignedPro,uAssignedPro1,uAssignedPro2,uAssignedPro3};
       GranularConfiguration$AssignedPropertyValue$StructuredValueCase.$VALUES = uAssignedPro4;
    }
    private void GranularConfiguration$AssignedPropertyValue$StructuredValueCase(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static GranularConfiguration$AssignedPropertyValue$StructuredValueCase forNumber(int p0){
       if (!p0) {
          return GranularConfiguration$AssignedPropertyValue$StructuredValueCase.STRUCTUREDVALUE_NOT_SET;
       }
       if (p0 == 1) {
          return GranularConfiguration$AssignedPropertyValue$StructuredValueCase.BOOL_VALUE;
       }
       if (p0 == 2) {
          return GranularConfiguration$AssignedPropertyValue$StructuredValueCase.INT_VALUE;
       }
       if (p0 != 3) {
          return null;
       }
       return GranularConfiguration$AssignedPropertyValue$StructuredValueCase.ENUM_VALUE;
    }
    public static GranularConfiguration$AssignedPropertyValue$StructuredValueCase valueOf(int p0){
       return GranularConfiguration$AssignedPropertyValue$StructuredValueCase.forNumber(p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$StructuredValueCase valueOf(String p0){
       return Enum.valueOf(GranularConfiguration$AssignedPropertyValue$StructuredValueCase.class, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$StructuredValueCase[] values(){
       return GranularConfiguration$AssignedPropertyValue$StructuredValueCase.$VALUES.clone();
    }
    public int getNumber(){
       return this.value;
    }
}
