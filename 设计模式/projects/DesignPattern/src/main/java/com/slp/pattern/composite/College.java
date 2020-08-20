package com.slp.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院的Composite
 */
public class College extends OrganizationComponent {
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());//得到学院名称
        for (OrganizationComponent organizationComponent: organizationComponents) {
            organizationComponent.print();
        }
    }

    //存放的是Department
    List<OrganizationComponent> organizationComponents =new ArrayList<OrganizationComponent>();

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }


}
