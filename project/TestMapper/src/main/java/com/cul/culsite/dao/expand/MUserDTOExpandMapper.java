package com.cul.culsite.dao.expand;

import java.util.List;

import com.cul.culsite.dto.MUserDTO;

public interface MUserDTOExpandMapper {
	/**
	 * This method was created for Login. This method corresponds to the
	 * database table M_USER
	 *
	 * @rd
	 */
	List<MUserDTO> selectByLoginInfo(MUserDTO record);
}
