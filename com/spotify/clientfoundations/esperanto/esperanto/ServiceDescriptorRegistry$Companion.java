package com.spotify.clientfoundations.esperanto.esperanto.ServiceDescriptorRegistry$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceDescriptor;
import p.co5;
import java.util.concurrent.ConcurrentHashMap;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceDescriptorRegistry;

public final class ServiceDescriptorRegistry$Companion	// class@00057b from classes.dex
{

    private void ServiceDescriptorRegistry$Companion(){
       super();
    }
    public void ServiceDescriptorRegistry$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final ServiceDescriptor find(String p0){
       co5.o(p0, "serviceID");
       return ServiceDescriptorRegistry.access$getDescriptors$cp().get(p0);
    }
    public final void register(ServiceDescriptor p0){
       co5.o(p0, "desc");
       ServiceDescriptorRegistry.access$getDescriptors$cp().put(p0.getServiceID(), p0);
    }
}
