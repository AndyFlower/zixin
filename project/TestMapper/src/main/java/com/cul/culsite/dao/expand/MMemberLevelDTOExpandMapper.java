package com.cul.culsite.dao.expand;

import java.util.List;
import java.util.Map;

import com.cul.culsite.model.UserBenefitsBean;

public interface MMemberLevelDTOExpandMapper {

	/** 根据issuerId 和 custSeq 找会员等级和等级下的权益包 **/
	List<UserBenefitsBean> queryBenefitsDiscountAndLevelbyIssuerIdAndcustSeq(
			Map<String, String> map);

	List<UserBenefitsBean> queryBenefitsPointsAndLevelbyIssuerIdAndcustSeq(
			Map<String, String> map);
}
