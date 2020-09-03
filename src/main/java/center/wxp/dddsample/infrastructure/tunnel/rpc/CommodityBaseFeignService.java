package center.wxp.dddsample.infrastructure.tunnel.rpc;

import center.wxp.dddsample.infrastructure.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yangying
 * @Description:
 * @Date 2020/4/13
 */
@FeignClient(value = "goodscenter-base")
public interface CommodityBaseFeignService {

    /**
     * 根据单位Id获取单位信息
     * @return
     */
    @GetMapping("/unit/get")
    public Result getUnitInfoByUnitId(@RequestParam("id") String unitId);

    /**
     * 根据品牌Id获取品牌信息
     * @return
     */
    @GetMapping("/brand/get")
    public Result getbrandInfoBybrandId(@RequestParam("id") String brandId);
}
