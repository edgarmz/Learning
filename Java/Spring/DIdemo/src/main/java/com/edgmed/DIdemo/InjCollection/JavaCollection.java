package com.edgmed.DIdemo.InjCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
    private List injectionList;
    private Set injectionSet;
    private Map injectionMap;
    private Properties injectionProperties;

    public void getInjectionList() {
        System.out.println(injectionList);
    }

    public void setInjectionList(List injectionList) {
        this.injectionList = injectionList;
    }

    public void getInjectionSet() {
        System.out.println(injectionSet);
    }

    public void setInjectionSet(Set injectionSet) {
        this.injectionSet = injectionSet;
    }

    public void getInjectionMap() {
        System.out.println(injectionMap);
    }

    public void setInjectionMap(Map injectionMap) {
        this.injectionMap = injectionMap;
    }

    public void getInjectionProperties() {
        System.out.println(injectionProperties);
    }

    public void setInjectionProperties(Properties injectionProperties) {
        this.injectionProperties = injectionProperties;
    }
}
