package com.adaptor.client;

import com.adaptor.adaptee.USB_Device;
import com.adaptor.adaptor.USB_To_TypeC;

public class Client {
    public static void main(String[] args) {
        USB_Device usbDevice = new USB_Device();

        USB_To_TypeC usbToTypeC = new USB_To_TypeC(usbDevice);
        // 因为在适配里里面通过依赖注入的方式创建了一个实例，所以在这里记得把usbDevice作为参数放进去
        usbToTypeC.connectedWithTypeC();
    }
}
