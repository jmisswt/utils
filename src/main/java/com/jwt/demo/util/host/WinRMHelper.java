package com.jwt.demo.util.host;

import io.cloudsoft.winrm4j.client.WinRmClientContext;
import io.cloudsoft.winrm4j.winrm.WinRmTool;
import io.cloudsoft.winrm4j.winrm.WinRmToolResponse;
import org.apache.http.client.config.AuthSchemes;

/**
 * @author jiangwentao
 * @description
 * @createTime 2023年01月31日 16:33
 */
public class WinRMHelper {
    private final String ip;

    private final String username;

    private final String password;

    public static final int DEFAULT_PORT = 5985;

    public WinRMHelper(final String ip, final String username, final String password) {
        this.ip = ip;
        this.username = username;
        this.password = password;
    }

    public String execute(final String command) {
        WinRmClientContext context = WinRmClientContext.newInstance();
        WinRmTool tool = WinRmTool.Builder.builder(ip, username, password).setAuthenticationScheme(AuthSchemes.NTLM).port(DEFAULT_PORT).useHttps(false).context(context).build();
        tool.setOperationTimeout(5000L);
        WinRmToolResponse resp = tool.executeCommand(command);
        context.shutdown();
        return resp.getStdOut();
    }

    public static void main(String[] args) {
        String ip="10.29.1.31";
        String username="administrator";
        String password="victor";

//        WinRMHelper exec = new WinRMHelper(ip, username, password);
//        String resp = exec.execute("ExecutableFile.exe c:\\temp\\ParameterFile.txt");
//        System.out.println(resp);

        WinRmClientContext context = WinRmClientContext.newInstance();
        WinRmTool.Builder builder = WinRmTool.Builder.builder(ip, username, password);
        builder.setAuthenticationScheme(AuthSchemes.NTLM);
        builder.port(5985);
        builder.useHttps(false);

        builder.context(context);
        WinRmTool tool =  builder.build();
        tool.setOperationTimeout(5000L);
        System.out.println("========");
        String command = "dir";
        WinRmToolResponse resp = tool.executeCommand(command);
        System.out.println(resp.getStatusCode());
        String out = resp.getStdOut();
        System.out.println(out);
        context.shutdown();

    }
}
