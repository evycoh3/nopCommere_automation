package com.helper.config;

import org.aeonbits.owner.Config;

public final class ConfigFactory {
     private ConfigFactory(){}
    public static FrameworkConfig getConfig(){
        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
