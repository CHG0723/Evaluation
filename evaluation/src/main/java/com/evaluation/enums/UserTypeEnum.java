package com.evaluation.enums;

/**
 * @author: xieyong
 * @date: 2020/3/23 15:12
 * @Description:
 */
public enum UserTypeEnum {
    ADMIN("1", "管理员"),
    TEACHER("2", "老师"),
    STUDENT("3", "学生");


    private String code;

    private String desc;

    UserTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static UserTypeEnum getEventByCode(String code) {
        UserTypeEnum[] values = UserTypeEnum.values();
        for (UserTypeEnum type : values) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
