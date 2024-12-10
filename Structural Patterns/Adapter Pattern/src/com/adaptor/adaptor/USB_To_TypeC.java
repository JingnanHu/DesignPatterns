package com.adaptor.adaptor;

import com.adaptor.adaptee.USB_Device;
import com.adaptor.target.TypeC;

public class USB_To_TypeC implements TypeC {
    private USB_Device usbDevice;
   public USB_To_TypeC (USB_Device usbDevice) {
       this.usbDevice = usbDevice;

   }

   // 为什用这种方式而不是new一个实体？
   // 1. 适配器的职责是适配，而不是创建对象
   //适配器的核心职责是“适配一个已有的接口以供客户端使用”，而不是负责创建它要适配的对象。如果你在适配器内部通过 new 去实例化 USBDevice，就把对象的创建逻辑塞进了适配器，导致职责不清晰。
    // 2. 通过依赖注入来把东西往里放可以更加便捷，使适配器可以适配不同的 USB_Device 实例，比如usb mouse, usb keyboard.这种方式让适配器的使用更加灵活，而不是局限于固定的 USB_Device 实例。


    @Override
    public void connectedWithTypeC() {
        System.out.println("connect with TypeC");
        usbDevice.connectedWithUSB();
    }
}
