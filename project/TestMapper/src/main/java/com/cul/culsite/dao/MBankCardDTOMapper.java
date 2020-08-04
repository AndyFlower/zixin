package com.cul.culsite.dao;

import com.cul.culsite.dto.MBankCardDTO;
import com.cul.culsite.dto.MBankCardDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MBankCardDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int countByExample(MBankCardDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int deleteByExample(MBankCardDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int insert(MBankCardDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int insertSelective(MBankCardDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    List<MBankCardDTO> selectByExample(MBankCardDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    MBankCardDTO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MBankCardDTO record, @Param("example") MBankCardDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MBankCardDTO record, @Param("example") MBankCardDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MBankCardDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_BANK_CARD
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MBankCardDTO record);
}