package com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Type;
import java.lang.Object;

public interface abstract Converter	// class@00087a from classes.dex
{

    boolean canHandle(Type p0);
    Object convert(Type p0,Object p1);
}
