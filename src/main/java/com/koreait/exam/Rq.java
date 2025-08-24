package com.koreait.exam;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String cmd;
    private Map<String, String> params = new HashMap<>();
    private String actionMethod;

    public String getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(String actionMethod) {
        this.actionMethod = actionMethod;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public Rq(String cmd) {
        this.cmd = cmd;
        String[] cmdBits = cmd.split("\\?"); // 예) delete 와 id=1, 물음표 기호라 역슬래쉬 써줌
        if(cmdBits.length < 2) {
            return;
        }
        actionMethod = cmdBits[0].substring(1);
        actionMethod = cmdBits[0]; // "delete"
        String[] paramBits;
        paramBits = cmdBits[1].split("="); // 예) "id"와 "1"
        if (paramBits.length < 2) {
            System.out.println("변수=값 형식으로 작성하십시오.");
            return;
        }


        String key = paramBits[0];
        String value = paramBits[1];
        params.put(key, value);


        //   System.out.println("actionMethod : " + actionMethod);
        //  System.out.println("paramBits[0] : " + paramBits[0]);
        //  System.out.println("paramBits[1] : " + paramBits[1]);
        //  System.out.println("params : " + params);
    }
}
