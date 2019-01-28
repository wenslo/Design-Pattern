package com.github.webslo.designpattern.headfirst.chapter9_iterator.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 16:51
 * @description
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
