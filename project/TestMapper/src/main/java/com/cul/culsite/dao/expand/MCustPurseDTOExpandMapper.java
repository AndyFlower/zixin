package com.cul.culsite.dao.expand;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cul.culsite.dto.MCustPurseDTO;

public interface MCustPurseDTOExpandMapper {

	/**
	 * 获取有效的用户黄金主账户
	 *
	 * @param custSeq
	 * @return MCustPurseDTO
	 */
	MCustPurseDTO selectGoldPurseByCustSeq(@Param("custSeq") String custSeq,
			@Param("type") String type);

	/**
	 * 根据LBS查询卡包排序
	 * 
	 * @param issuerId
	 * @param lng
	 * @param lat
	 * @return
	 */
	List<MCustPurseDTO> queryCardListByOpenIdLbs(String openId, String lng,
			String lat);
}
