package com.elementia.elementiajmt.registry;

/**
 * Created by AliquotMesozoic on 1/13/15 at 12:12 AM.
 */
public interface IRegisterGeneric {
    public void getInstance();
    public String getRawName();

    @Override
    public String toString();
}
