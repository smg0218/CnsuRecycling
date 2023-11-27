package com.jsp.smg;

public class Utils {
    // 문자열에서 하이픈(-)을 지워주는 메소드
    public static String RemoveHypen(String data) {
        return data.replaceAll("-", "");
    }

    // 문자열을 숫자형(int)으로 바꿔주는 메소드
    public static int ConvertStringToInteger(String data) {
        return Integer.parseInt(data);
    }
}
