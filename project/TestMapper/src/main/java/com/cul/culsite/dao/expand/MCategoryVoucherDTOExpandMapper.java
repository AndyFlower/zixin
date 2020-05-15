package com.cul.culsite.dao.expand;

import java.util.List;
import java.util.Map;

import com.cul.culsite.dto.MCategoryVoucherDTO;
import com.cul.culsite.model.singlecoupon.CategoryCouponInfo;
import com.cul.culsite.model.singlecoupon.CategoryCouponRequest;

public interface MCategoryVoucherDTOExpandMapper {
	List<MCategoryVoucherDTO> selectCategoryVoucherList(Map<String, String> map);

	List<CategoryCouponInfo> selectCategoryConponInfo(CategoryCouponRequest bean);

	MCategoryVoucherDTO selectByConponNo(String conponNo);

	List<CategoryCouponInfo> selectCategoryInfoByCategoryNo(
			CategoryCouponRequest bean);

}
