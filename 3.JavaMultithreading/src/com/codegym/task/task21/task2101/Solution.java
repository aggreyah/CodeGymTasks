package com.codegym.task.task21.task2101;

/* 
Determine the network address

*/

public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[ip.length];
        for (int i = 0; i < ip.length; i ++){
            String currentIpString = byteToBinaryString(ip[i]);
            String currentMaskString = byteToBinaryString(mask[i]);
            StringBuilder currentNetworkByte = new StringBuilder();
            for (int j = 0; j < currentIpString.length(); j++){
                currentNetworkByte.append(Integer.parseInt(currentIpString.substring(j, j + 1)) & Integer.parseInt(currentMaskString.substring(j, j + 1)));
            }
            netAddress[i] = (byte) Short.parseShort(currentNetworkByte.toString(), 2);
        }
        return netAddress;
    }

    public static void print(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            if (i < bytes.length - 1)
                System.out.print(byteToBinaryString(bytes[i]) + " ");
            else
                System.out.print(byteToBinaryString(bytes[i]));
        }
        System.out.println();
    }

    private static String byteToBinaryString(byte item) {
        int result = item & 0xff;
        return String.format("%8s", Integer.toBinaryString(result)).replace(" ", "0");
    }
}
