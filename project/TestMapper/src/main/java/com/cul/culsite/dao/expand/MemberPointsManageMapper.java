package com.cul.culsite.dao.expand;

import java.util.List;
import java.util.Map;

import com.cul.culsite.model.memberpoint.BenefitsPkgInfo;
import com.cul.culsite.model.memberpoint.EmemberInfo;
import com.cul.culsite.model.memberpoint.MerchantBusinessBenefitsInfo;
import com.cul.culsite.model.memberpoint.PointsRecordBean;
public interface MemberPointsManageMapper {
	
	public List<PointsRecordBean> selectValidPointsRecordInfo(Map<String, Object> param);
	
	/**
	 * 根据实体卡卡号查询会员信息
	 * @param param
	 * @return
	 */
	public List<EmemberInfo> qryEmemberInfo(Map<String, Object> param);
	
	/**
	 * 根据会员等级查询权益id和规则id
	 * @param param
	 * @return
	 */
	public List<BenefitsPkgInfo> qryBenefitsPkgInfo(Map<String, Object> param);
	
	/**
	 * 根据规则Id查询业态和门店
	 * @param param
	 * @return
	 */
	public List<MerchantBusinessBenefitsInfo> qryMerchantBusinessBenefitsInfo(Map<String, Object> param);
	
	/**
	 * 根据custSeq查询会员信息
	 * @param param
	 * @return
	 */
	public List<EmemberInfo> qryEmemberInfoByUid(Map<String, Object> param);
	
}
