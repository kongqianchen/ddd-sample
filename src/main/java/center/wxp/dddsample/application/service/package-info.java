/**
 * 以领域驱动设计的四层架构为例，之所以引入应用层（Application Layer），
 * 就是为了给调用者提供完整的业务用例。
 * CO -> entity(入参转领域实体)
 * 接口服务
 * 新增：save
 * 修改：modify
 * 查询：get（单个）、list（多个、分页）
 * 统计：count
 * 删除：remove
 */
package center.wxp.dddsample.application.service;
