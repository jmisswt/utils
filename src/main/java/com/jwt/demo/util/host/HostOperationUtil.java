package com.jwt.demo.util.host;

import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.UnknownHostException;

/**
 * @author jiangwentao
 * @description
 * @createTime 2023年01月29日 15:48
 */
public class HostOperationUtil {
    public static void main(String[] args) throws UnknownHostException {
        String macAddress = getMacAddress();
        System.out.println("macAddress: " + macAddress);
        String cpuCores = getCpuCores();
        System.out.println("cpuCores: " + cpuCores);


        System.out.println("finish!!!");

    }

    private static String exec(String cmd) {
        try {
            //String[] cmdA = {"cmd.exe", "/c", cmd};
            String[] cmdA = {"cmd.exe", "/c "+"cmdkey /generic:10.29.1.31 /u:administrator /p:victor", cmd};
            String[] envp = {"cmdkey /generic:" + "10.29.1.31" + " /user:" + "administrator" + " /pass:" + "victor"};
            Process process = Runtime.getRuntime().exec(cmdA);
            LineNumberReader br = new LineNumberReader(new InputStreamReader(process.getInputStream(), "GBK"));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.length() > 0) {
                    sb.append(line).append("\n");
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 使用远程桌面连接主机
     *
     * @param hostIp   主机IP
     * @param username 主机登录用户名
     * @param password 主机登录密码
     */
    public static void remoteConnect(String hostIp, String username, String password) {
        try {
            //Process process = Runtime.getRuntime().exec("cmdkey /generic:" + hostIp + " /user:" + username + " /pass:" + password);
            Process exec = Runtime.getRuntime().exec("mstsc /v: " + hostIp + " /f /console");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取mac地址
     *
     * @return
     */
    public static String getMacAddress() {
        final String dosCmd = "wmic nicconfig get macaddress";
        return exec(dosCmd);
    }

    /**
     * 获取cpu 核心数
     *
     * @return
     */
    public static String getCpuCores() {
        final String dosCmd = "wmic cpu get numberofcores";
        return exec(dosCmd);
    }

    /**
     * 获取主板序列号
     *
     * @return
     */
    public static String getBaseBoardSerialumber() {
        final String dosCmd = "wmic baseboard get serialnumber";
        return exec(dosCmd);
    }

    /**
     * 获取Bios序列号
     *
     * @return
     */
    public static String getBiosSerialumber() {
        final String dosCmd = "wmic bios get serialnumber";
        return exec(dosCmd);
    }
}
