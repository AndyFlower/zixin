package com.cul.culsite.dao.expand;

import java.util.List;

import com.cul.culsite.dto.MCardInfomationDTO;
import com.cul.culsite.dto.MCardInfomationDTOCriteria;

public interface MCardInfomationDTOExpandMapper {
	List<MCardInfomationDTO> selectBysingle(MCardInfomationDTOCriteria example);
}
