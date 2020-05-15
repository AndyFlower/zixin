/**
 * 
 */
package com.cul.culsite.model;

import java.util.List;

import com.cul.culsite.dto.EsOrderDTOWithBLOBs;
import com.cul.culsite.dto.EsOrderItemsDTOWithBLOBs;

/**
 * @author liwenbo
 * 2014-10-30 下午01:48:20
 * @Description:
 * @version V 1.0
 * @JDK  V 1.6.22
 */
public class EsOrderInfoBean {

	private EsOrderDTOWithBLOBs esOrderDTO;
	private List<EsOrderItemsDTOWithBLOBs> esOrderItemsList;
	
	public EsOrderDTOWithBLOBs getEsOrderDTO() {
		return esOrderDTO;
	}
	public void setEsOrderDTO(EsOrderDTOWithBLOBs esOrderDTO) {
		this.esOrderDTO = esOrderDTO;
	}
	public List<EsOrderItemsDTOWithBLOBs> getEsOrderItemsList() {
		return esOrderItemsList;
	}
	public void setEsOrderItemsList(List<EsOrderItemsDTOWithBLOBs> esOrderItemsList) {
		this.esOrderItemsList = esOrderItemsList;
	}
}
