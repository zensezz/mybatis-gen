package com.plugin;

/**
 * @author zz
 * @date 2019-08-26 11:35
 */
public enum Annotation {
    DATA("@Data", "lombok.Data"),
    Builder("@Builder", "lombok.Builder"),
    NoArgsConstructor("@NoArgsConstructor", "lombok.NoArgsConstructor"),
    AllArgsConstructor("@AllArgsConstructor", "lombok.AllArgsConstructor"),
    Mapper("@Mapper", "org.apache.ibatis.annotations.Mapper"),
    Param("@Param", "org.apache.ibatis.annotations.Param"),
    ApiModel("@ApiModel", "io.swagger.annotations.ApiModel"),
    ApiModelProperty("@ApiModelProperty", "io.swagger.annotations.ApiModelProperty"),
    JsonFormat("@JsonFormat", "com.fasterxml.jackson.annotation.JsonFormat");

    private String annotation;

    private String clazz;
    Annotation(String annotation, String clazz) {
        this.annotation = annotation;
        this.clazz = clazz;
    }

    public String getAnnotation() {
        return annotation;
    }

    public String getClazz() {
        return clazz;
    }
}
