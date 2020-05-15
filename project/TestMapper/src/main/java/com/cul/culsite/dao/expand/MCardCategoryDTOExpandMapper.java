package com.cul.culsite.dao.expand;

import java.util.List;
import java.util.Map;

import com.cul.culsite.dto.MCardCategoryDTO;
import com.cul.culsite.dto.MproductCategory;

public interface MCardCategoryDTOExpandMapper {
	/**
     * 正大广场查询优惠券
     * @param issuerId
     * @param productId
     * @return
     */
    List<MproductCategory> queryCardCategoryDetailInfo(String issuerId,String productId);
    
    /**
     * 记次券包查询
     * @param custSeq
     * @return
     */
    List<MproductCategory> queryCardCategoryDetailByCustSeq(Map<String,Object> map);
    
    /**
     * 通过商品号查询相关券信息
     * @param example
     * @return
     */
    List<MCardCategoryDTO> qryCategoryByProduct(String productNo);
    
    /**
     * 
     * @param map
     * @return
     */
    List<MproductCategory> qryCategoryByProduct(Map<String,String[]> map);
    
    /**
     * 
     * @param map
     * @return
     */
    List<MproductCategory> qryCategoryByNo(List<String> categoryNos);
    
    /**
     * 通过券号查询券类型
     * @param example
     * @return
     */
    List<MproductCategory> qryCategoryByVoucher(Map<String,Object> voucherNo);
}
