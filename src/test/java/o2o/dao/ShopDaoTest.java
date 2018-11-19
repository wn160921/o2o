package o2o.dao;

import o2o.BaseTest;
import o2o.entity.Area;
import o2o.entity.PersonInfo;
import o2o.entity.Shop;
import o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;

    @Test
    public void testInsert(){
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setShopCategoryId(10L);

        owner.setUserId(8L);
        area.setAreaId(3);

        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺");
        shop.setShopDesc("description");
        shop.setShopAddr("test");
        shop.setPhone("phone");
        shop.setShopImg("img");
        shop.setCreateTime(new Date());
        shop.setAdvice("建议");
        shop.setEnableStatus(1);
        int effectNum = shopDao.insertShop(shop);
        assertEquals(1,effectNum);
    }

    @Test
    public void testUpdate(){
        Shop shop = new Shop();
        shop.setShopId(30L);
        shop.setShopName("测试修改");
        shop.setShopDesc("测试修改");
        shop.setAdvice("测试修改");
        int effectNum = shopDao.updateShop(shop);
        assertEquals(1,effectNum);
    }
}
