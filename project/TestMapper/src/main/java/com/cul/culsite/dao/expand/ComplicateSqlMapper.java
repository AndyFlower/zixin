package com.cul.culsite.dao.expand;

import java.util.List;
import java.util.Map;

import com.cul.culsite.dto.MOrderTxnDTO;
import com.cul.culsite.dto.MUserDTO;
import com.cul.culsite.model.CardNoAllInfoBean;
import com.cul.culsite.model.uid.UserBean;

public interface ComplicateSqlMapper {
	List<CardNoAllInfoBean> selectCardNoAllInfoByNo(String no);

	List<MOrderTxnDTO> selectOrderTxn(Map<String, Object> param);

	/**
	 * 通过 m_order_txn_detail中的cardNo查询对应的消费流水
	 * 
	 * @param motdCardNo
	 * @return
	 */
	List<MOrderTxnDTO> selectOrderTxnByCardNo(String cardNo);

	/**
	 * 通过 m_order_txn_detail中的cardNo查询对应的主售卖流水(AA的主流水)
	 * 
	 * @param motdCardNo
	 *            卡号
	 * @return 单条售卖流水m_order_txn的记录
	 */
	MOrderTxnDTO selectMOrderTxnByCardNo(String cardNo);

	MUserDTO selectUser(UserBean bean);

	/**
	 * 根据卡号查询售卖订单号
	 * 
	 * @param cardNo
	 * @return
	 */
	List<String> findIslvOrderIdByCardNo(String cardNo);
}
