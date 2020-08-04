package com.cul.culsite.dao;

import com.cul.culsite.dto.MVoucherDTO;
import com.cul.culsite.dto.MVoucherDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MVoucherDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int countByExample(MVoucherDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int deleteByExample(MVoucherDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int insert(MVoucherDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int insertSelective(MVoucherDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    List<MVoucherDTO> selectByExample(MVoucherDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    MVoucherDTO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MVoucherDTO record, @Param("example") MVoucherDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MVoucherDTO record, @Param("example") MVoucherDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MVoucherDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_VOUCHER
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MVoucherDTO record);
}