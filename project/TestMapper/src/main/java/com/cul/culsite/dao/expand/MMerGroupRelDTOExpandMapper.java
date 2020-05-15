package com.cul.culsite.dao.expand;

import java.util.List;

import com.cul.culsite.model.singlecoupon.CategoryCouponMerRuleInfo;
import com.cul.culsite.model.singlecoupon.CategoryCouponMerRuleRequest;

public interface MMerGroupRelDTOExpandMapper {

	List<CategoryCouponMerRuleInfo> selectCategoryMerRule(
			CategoryCouponMerRuleRequest record);
}
