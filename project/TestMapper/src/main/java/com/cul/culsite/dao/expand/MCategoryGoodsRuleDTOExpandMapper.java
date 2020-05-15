package com.cul.culsite.dao.expand;

import java.util.List;

import com.cul.culsite.dto.MCategoryGoodsRuleDTO;
import com.cul.culsite.model.singlecoupon.CategoryGoodsRuleRequest;

public interface MCategoryGoodsRuleDTOExpandMapper {

	/**
	 *
	 * @param categoryGoodsRuleRequest
	 * @return
	 */
	List<MCategoryGoodsRuleDTO> selectAllCategoryRuleByConponNo(
			CategoryGoodsRuleRequest categoryGoodsRuleRequest);

	List<MCategoryGoodsRuleDTO> selectCategoryRuleByConponNoAndCategory(
			CategoryGoodsRuleRequest categoryGoodsRuleRequest);

	List<MCategoryGoodsRuleDTO> selectCategoryRuleByConponNoAndProId(
			CategoryGoodsRuleRequest categoryGoodsRuleRequest);

}
