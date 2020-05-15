package com.cul.culsite.dao.expand;

import java.util.List;

import com.cul.culsite.dto.MMasterAttachCardDTO;
import com.cul.culsite.dto.MMasterAttachCardDTOCriteria;

public interface MMasterAttachCardDTOExpandMapper {
	List<MMasterAttachCardDTO> selectByExample1(MMasterAttachCardDTOCriteria example);
}
