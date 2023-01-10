package com.clevermis.demo01;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Proxy implements Rent {

    private Host host;

    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse(){
        System.out.println("中介带你看房！");
    }

    public void fare(){
        System.out.println("收中介费！");
    }

    public void hetong(){
        System.out.println("签租赁合同！");
    }
}
