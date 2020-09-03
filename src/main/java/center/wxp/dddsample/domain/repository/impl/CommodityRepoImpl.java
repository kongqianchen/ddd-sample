package center.wxp.dddsample.domain.repository.impl;

import center.wxp.dddsample.controller.co.add.CommodityAddCO;
import center.wxp.dddsample.domain.entity.*;
import center.wxp.dddsample.domain.repository.ICommodityRepo;
import center.wxp.dddsample.infrastructure.convertor.CommodityDoWrapper;
import center.wxp.dddsample.infrastructure.tunnel.database.service.ICommodityISvc;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityDo;
import center.wxp.dddsample.infrastructure.tunnel.rpc.CommodityCategoryFeignService;
import center.wxp.dddsample.infrastructure.utils.Result;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 多媒体资源表 服务实现类
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Service
public class CommodityRepoImpl implements ICommodityRepo {
    @Resource
    private CommodityCategoryFeignService commodityCategoryFeignService;
    @Resource
    private ICommodityISvc iCommodityISvc;

    @Override
    public Result getBackCategoryByCategoryId(CommodityAddCO addCO) {
        String categoryId = addCO.getCategoryId();
        if (StringUtils.isNotBlank(categoryId)) {
            Result backCategoryResult = commodityCategoryFeignService.getBackCategoryByCategoryId(categoryId, addCO.getPlatformId(), addCO.getTenantId());
            if (backCategoryResult != null) {
                cn.hutool.json.JSONObject jsonObject = JSONUtil.parseObj(backCategoryResult);
                if (jsonObject.getInt("code").equals(200)) {
                    if (jsonObject.getJSONObject("data").getInt("status").equals(0)) {
                        return Result.error().setMsg("类目被禁用");
                    }
                }
            } else {
                return Result.error().setMsg("类目查询失败");
            }
        }
        return null;
    }

    @Override
    public Brand getBrandInfo(CommodityAddCO addCO) {
        return null;
    }

    @Override
    public List<Commodity> listCommodity(Commodity commodity) {
        CommodityDo commodityDo = CommodityDo.create(JSONObject.toJSONString(commodity));
        QueryWrapper<CommodityDo> doQueryWrapper = new QueryWrapper<>(commodityDo);
        List<CommodityDo> list = iCommodityISvc.list(doQueryWrapper);
        return CommodityDoWrapper.build().listDo(list);
    }

    @Override
    public String saveDescription(CommodityDescription commodityDescription) {
        return null;
    }

    @Override
    public String saveCommodity(Commodity commodity) {
        return null;
    }

    @Override
    public boolean saveOrUpdateCommodityExtendConfig(CommodityExtendConfig commodityExtendConfig) {
        return false;
    }

    @Override
    public boolean saveCommodityPrice(CommodityPrice commodityPrice) {
        return false;
    }

    @Override
    public boolean delPic(CommodityPicture commodityPicture) {
        return false;
    }

    @Override
    public boolean saveCommodityPicture(CommodityAddCO addCO) {
        return false;
    }

    @Override
    public boolean saveCommodityInventory(CommodityAddCO addCO) {
        return false;
    }
}
