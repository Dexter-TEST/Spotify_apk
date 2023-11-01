package com.spotify.clientfoundations.esperanto.esperanto.MethodDescriptor;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class MethodDescriptor	// class@000578 from classes.dex
{
    private final String inputType;
    private final String methodName;
    private final String outputType;

    public void MethodDescriptor(String p0,String p1,String p2){
       co5.o(p0, "inputType");
       co5.o(p1, "outputType");
       co5.o(p2, "methodName");
       super();
       this.inputType = p0;
       this.outputType = p1;
       this.methodName = p2;
    }
    public static MethodDescriptor copy$default(MethodDescriptor p0,String p1,String p2,String p3,int p4,Object p5){
       MethodDescriptor inputType;
       MethodDescriptor outputType;
       MethodDescriptor methodName;
       if ((p4 & 0x01)) {
          inputType = p0.inputType;
       }
       if ((p4 & 0x02)) {
          outputType = p0.outputType;
       }
       if ((p4 & 0x04)) {
          methodName = p0.methodName;
       }
       return p0.copy(inputType, outputType, methodName);
    }
    public final String component1(){
       return this.inputType;
    }
    public final String component2(){
       return this.outputType;
    }
    public final String component3(){
       return this.methodName;
    }
    public final MethodDescriptor copy(String p0,String p1,String p2){
       co5.o(p0, "inputType");
       co5.o(p1, "outputType");
       co5.o(p2, "methodName");
       return new MethodDescriptor(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof MethodDescriptor) {
          return false;
       }
       if (!co5.c(this.inputType, p0.inputType)) {
          return false;
       }
       if (!co5.c(this.outputType, p0.outputType)) {
          return false;
       }
       if (!co5.c(this.methodName, p0.methodName)) {
          return false;
       }
       return true;
    }
    public final String getInputType(){
       return this.inputType;
    }
    public final String getMethodName(){
       return this.methodName;
    }
    public final String getOutputType(){
       return this.outputType;
    }
    public int hashCode(){
       return (this.methodName.hashCode() + tp2.g(this.outputType, (this.inputType.hashCode() * 31), 31));
    }
    public String toString(){
       return hr7.a("MethodDescriptor\(inputType="+this.inputType+", outputType="+this.outputType+", methodName=", this.methodName, ')');
    }
}
