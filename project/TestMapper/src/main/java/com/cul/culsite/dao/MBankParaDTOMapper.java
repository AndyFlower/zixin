package com.cul.culsite.dao;

import com.cul.culsite.dto.MBankParaDTO;
import com.cul.culsite.dto.MBankParaDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MBankParaDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int countByExample(MBankParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int deleteByExample(MBankParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String mbpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int insert(MBankParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int insertSelective(MBankParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    List<MBankParaDTO> selectByExample(MBankParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    MBankParaDTO selectByPrimaryKey(String mbpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MBankParaDTO record, @Param("example") MBankParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MBankParaDTO record, @Param("example") MBankParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MBankParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_PARA
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MBankParaDTO record);
}