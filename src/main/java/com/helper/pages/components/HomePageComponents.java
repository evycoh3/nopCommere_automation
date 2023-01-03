package com.helper.pages.components;

public final  class HomePageComponents {

    private final String sideNavbar="//ul[@data-widget]/li/a/p[contains(text(),'%value%')]";
    private final String subSideNavBae="//ul[@class='nav nav-treeview']//p[text()='%value%']";

    public String getSideNavbar() {
        return sideNavbar;
    }

    public String getSubSideNavBae() {
        return subSideNavBae;
    }
}
