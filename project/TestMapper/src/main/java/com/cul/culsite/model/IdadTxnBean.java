package com.cul.culsite.model;

import java.util.List;

import com.cul.culsite.dto.MOrderTxnDTO;
import com.cul.culsite.dto.MOrderTxnDetailDTO;

public class IdadTxnBean {

	private MOrderTxnDTO MOrderTxnDTO;
	private List<MOrderTxnDetailDTO> MOrderTxnDetailDTOList;
	public MOrderTxnDTO getMOrderTxnDTO() {
		return MOrderTxnDTO;
	}
	public void setMOrderTxnDTO(MOrderTxnDTO mOrderTxnDTO) {
		MOrderTxnDTO = mOrderTxnDTO;
	}
	public List<MOrderTxnDetailDTO> getMOrderTxnDetailDTOList() {
		return MOrderTxnDetailDTOList;
	}
	public void setMOrderTxnDetailDTOList(
			List<MOrderTxnDetailDTO> mOrderTxnDetailDTOList) {
		MOrderTxnDetailDTOList = mOrderTxnDetailDTOList;
	}
}
