package com.laishishui.ecommerce.service;

import com.laishishui.ecommerce.account.AddressInfo;
import com.laishishui.ecommerce.common.TableId;

/**
 * <h1>用户地址相关服务接口定义</h1>
 * @author tachai on 2022/1/7 3:25 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public interface IAddressService {

    /**
     * <h2>创建用户地址信息</h2>
     * @param addressInfo
     * @return
     */
    TableId createAddressInfo(AddressInfo addressInfo);

    /**
     * <h2>获取当前登录的用户地址信息</h2>
     * @return
     */
    AddressInfo getCurrentAddressInfo();

    /**
     * <h2>通过 id 获取用户地址信息，id是EcommerceAddress 表的主键</h2>
     * @param id
     * @return
     */
    AddressInfo getAddressInfoById(Long id);

    /**
     * <h2>通过 TableId 获取用户信息</h2>
     * @param tableId
     * @return
     */
    AddressInfo getAddressInfoByTableId(TableId tableId);

}
