package com.slp.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * University就是Composite 可以管理College
 */
public class University  extends OrganizationComponent{
    public University(String name, String des) {
        super(name, des);
    }
    //构造器
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

    /**
     * print就是输出University包含的学院
     */
    @Override
    protected void print() {
        System.out.println(getName());//得到大学的名称
        for (OrganizationComponent organizationComponent: organizationComponents) {
            organizationComponent.print();
        }
    }
}
