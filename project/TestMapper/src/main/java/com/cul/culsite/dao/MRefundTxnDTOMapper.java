package com.cul.culsite.dao;

import com.cul.culsite.dto.MRefundTxnDTO;
import com.cul.culsite.dto.MRefundTxnDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MRefundTxnDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int countByExample(MRefundTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int deleteByExample(MRefundTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String mrtTxnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int insert(MRefundTxnDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int insertSelective(MRefundTxnDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    List<MRefundTxnDTO> selectByExample(MRefundTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    MRefundTxnDTO selectByPrimaryKey(String mrtTxnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MRefundTxnDTO record, @Param("example") MRefundTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MRefundTxnDTO record, @Param("example") MRefundTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MRefundTxnDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REFUND_TXN
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MRefundTxnDTO record);
}