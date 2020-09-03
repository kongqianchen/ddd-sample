package center.wxp.dddsample.controller.facade;


import center.wxp.dddsample.application.service.CommodityASvc;
import center.wxp.dddsample.controller.co.add.CommodityAddCO;
import center.wxp.dddsample.infrastructure.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 商品信息表 前端控制器
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@RestController
@RequestMapping("/commodity")
@Api(tags = "商品信息管理")

public class CommodityController {
    @Autowired
    private CommodityASvc commodityService;


    /**
     * 新增/修改商品信息
     *
     * @param addCo 新增商品参数对象
     * @return Result<String>
     */
    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "新增/修改商品信息", notes = "传入CommodityAddCo")
    public Result<String> saveOrUpdate(@Validated @RequestBody CommodityAddCO addCo) {
        return commodityService.save(addCo);
    }

}

