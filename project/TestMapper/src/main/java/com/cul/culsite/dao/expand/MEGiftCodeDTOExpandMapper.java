package com.cul.culsite.dao.expand;

import java.util.List;

import com.cul.culsite.dto.MEGiftCodeDTO;
import com.cul.culsite.dto.MEGiftCodeDTOCriteria;

public interface MEGiftCodeDTOExpandMapper {
    List<MEGiftCodeDTO> selectTotalProductNum(MEGiftCodeDTOCriteria example);
}
