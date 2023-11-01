package com.spotify.clientfoundations.core.core.NativeApplicationScope;

public interface abstract NativeApplicationScope	// class@00055b from classes.dex
{

    void destroy();
    byte[] getCacheId();
    byte[] getCacheSalt();
    long getNThis();
}
