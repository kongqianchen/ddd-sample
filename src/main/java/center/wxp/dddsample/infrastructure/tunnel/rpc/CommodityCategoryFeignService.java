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
@FeignClient(value = "goodscenter-category")
public interface CommodityCategoryFeignService {

    /**
     * 获取类目名字 返回类型：类目一/类目二/类目三
     *
     * @return
     */
    @GetMapping("/category/backstage/getCategoryName")
    Result getCategoryName(@RequestParam("id") String categoryId);

    /**
     * 根据类目id 平台id 租户id查询商品类目对象
     *
     * @param id         类目id
     * @param platformId 平台id
     * @param tenantId   租户id
     * @return Result
     */
    @GetMapping("/category/backstage/get")
    Result getBackCategoryByCategoryId(@RequestParam("id") String id,
                                       @RequestParam("platformId") String platformId,
                                       @RequestParam("tenantId") String tenantId);

    /**
     * 根据类目id 平台id 租户id查询类目配置对象
     *
     * @param categoryBackstageId 类目id
     * @param platformId 平台id
     * @param tenantId   租户id
     * @return
     */
    @GetMapping("/attribute/selAndParent")
    Result getCategoryValueByCategoryId(@RequestParam("categoryBackstageId") String categoryBackstageId,
                                        @RequestParam("platformId") String platformId,
                                        @RequestParam("tenantId") String tenantId);
}
