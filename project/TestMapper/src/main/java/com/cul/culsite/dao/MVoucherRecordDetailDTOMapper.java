package com.cul.culsite.dao;

import com.cul.culsite.dto.MVoucherRecordDetailDTO;
import com.cul.culsite.dto.MVoucherRecordDetailDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MVoucherRecordDetailDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int countByExample(MVoucherRecordDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int deleteByExample(MVoucherRecordDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String mvrdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int insert(MVoucherRecordDetailDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int insertSelective(MVoucherRecordDetailDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    List<MVoucherRecordDetailDTO> selectByExample(MVoucherRecordDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    MVoucherRecordDetailDTO selectByPrimaryKey(String mvrdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MVoucherRecordDetailDTO record, @Param("example") MVoucherRecordDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MVoucherRecordDetailDTO record, @Param("example") MVoucherRecordDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MVoucherRecordDetailDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER_RECORD_DETAIL
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MVoucherRecordDetailDTO record);
}