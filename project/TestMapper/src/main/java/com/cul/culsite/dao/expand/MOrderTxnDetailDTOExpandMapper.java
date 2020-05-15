package com.cul.culsite.dao.expand;

import java.util.List;
import java.util.Map;

import com.cul.culsite.dto.MOrderTxnDetailDTO;

public interface MOrderTxnDetailDTOExpandMapper {
	List<MOrderTxnDetailDTO> qrySaleDetailByNo(Map<String, List<String>> noMap);
}
