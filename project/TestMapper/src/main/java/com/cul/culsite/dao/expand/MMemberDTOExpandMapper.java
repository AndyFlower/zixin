package com.cul.culsite.dao.expand;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.cul.culsite.dto.MMemberDTO;

public interface MMemberDTOExpandMapper {
	MMemberDTO selectByCustSeq(String custSeq, String msIssuerId);

	int updateBycancelOpenId(String custSeq, String msIssuerId);

	/**
	 * search member by phoneNo and issUserId
	 *
	 * @param phoneNo
	 * @param issUserId
	 * @return
	 */
	MMemberDTO selectByPhoneNoAndIssUserId(@Param("phoneNo") String phoneNo,
			@Param("issUserId") String issUserId);

	/**
	 * 查询补主卡用户
	 * 
	 * @param param
	 * @return
	 */
	List<MMemberDTO> selectUndefaultCard(Map<String, Object> param);
}
