package o2o.dao;

import o2o.entity.Shop;

public interface ShopDao {
    /**
     * 新增商铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);
}
