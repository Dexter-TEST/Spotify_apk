package com.spotify.clientfoundations.esperanto.esperanto.ServiceDescriptorRegistry;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceDescriptorRegistry$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;

public final class ServiceDescriptorRegistry	// class@00057c from classes.dex
{
    public static final ServiceDescriptorRegistry$Companion Companion;
    private static final ConcurrentHashMap descriptors;

    static {
       ServiceDescriptorRegistry.Companion = new ServiceDescriptorRegistry$Companion(null);
       ServiceDescriptorRegistry.descriptors = new ConcurrentHashMap();
    }
    public void ServiceDescriptorRegistry(){
       super();
    }
    public static final ConcurrentHashMap access$getDescriptors$cp(){
       return ServiceDescriptorRegistry.descriptors;
    }
}
