package com.cul.culsite.dao.expand;

import com.cul.culsite.dto.EsOrderItemsDTO;
import com.cul.culsite.dto.EsOrderItemsDTOCriteria;

public interface EsOrderItemsDTOExpandMapper {
	EsOrderItemsDTO selectProductId(EsOrderItemsDTOCriteria example);
}
