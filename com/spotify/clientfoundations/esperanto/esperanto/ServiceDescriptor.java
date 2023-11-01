package com.spotify.clientfoundations.esperanto.esperanto.ServiceDescriptor;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import com.spotify.clientfoundations.esperanto.esperanto.MethodDescriptor;
import p.co5;
import java.util.ArrayList;
import java.util.Collection;

public abstract class ServiceDescriptor	// class@00057a from classes.dex
{
    private final HashMap mMethodsMap;

    public void ServiceDescriptor(){
       super();
       this.mMethodsMap = new HashMap();
    }
    public final void addMethod(String p0,MethodDescriptor p1){
       co5.o(p0, "methodName");
       co5.o(p1, "methodDescriptor");
       this.mMethodsMap.put(p0, p1);
    }
    public final ArrayList findAllDescriptors(){
       return new ArrayList(this.mMethodsMap.values());
    }
    public final MethodDescriptor findDescriptor(String p0){
       co5.o(p0, "methodName");
       return this.mMethodsMap.get(p0);
    }
    public abstract String getServiceID();
    public abstract String getServiceName();
}
