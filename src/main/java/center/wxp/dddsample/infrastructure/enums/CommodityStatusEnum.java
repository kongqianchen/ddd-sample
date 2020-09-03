package center.wxp.dddsample.infrastructure.enums;

/**
 * @author yangying
 * @Description:商品状态枚举
 * @Date 2020/4/24
 */
public enum CommodityStatusEnum {

    /**商品状态(1:未发布，2：待审核，3：审核驳回 4：待上架，5：在售（已上架） 6：已下架)*/
    NOISSUE(1, "未发布"),
    TOAUDIT(2, "待审核"),
    AUDITREJECT(3, "审核驳回"),
    TOUP(4, "待上架"),
    UP(5, "已上架"),
    DOWN(6, "已下架");

    private Integer code;
    private String label;

    CommodityStatusEnum(Integer code, String label) {
        this.code = code;
        this.label = label;
    }

    public Integer getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }
}
