package center.wxp.dddsample.infrastructure.common.enums;

/**
 * @author huangwenxue
 * @version 1.0
 * @email 895367830@qq.com
 * @description
 * @date 2020-03-06:20:24
 */
public enum CommodityMeteringEnum {
    METERING_1(1, "多单位"),
    METERING_2(2, "多规格"),
    METERING_3(3, "单一规格模式");

    private Integer k;
    private String v;

    CommodityMeteringEnum(Integer k, String v) {
        this.k = k;
        this.v = v;
    }

    public Integer getK() {
        return k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

}
